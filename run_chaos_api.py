import pandas as pd
import os
import subprocess
import datetime
import xml.etree.ElementTree as ET
import shutil
import tarfile
from collections import defaultdict
import  csv
import pickle
import json
import re

# PROJECTS_DIRECTORY = "C:\\Users\\yhcro\\Documents\\FFprojects\\"
flakeflagger_project_to_sha = {}
# MVN_LOC = 'C:\\Users\\yhcro\\Downloads\\apache-maven-3.8.8-bin\\apache-maven-3.8.8\\bin\\mvn'
# JAVA_HOME = "C:\\Users\\yhcro\\IdeaProjects\\FlakyTracker\\OpenJDK8U-jdk_x64_windows_hotspot_8u402b06\\jdk8u402-b06\\jre\\"

# CHAOS_API_DIR = r"C:\Users\yhcro\Documents\Code\ChaosAPI\target\ChaosAPI-1.0-SNAPSHOT.jar"
# CHAOS_API_DIR = "/Users/yhcrown/Documents/GitHub/ChaosAPI/target/ChaosAPI-1.0-SNAPSHOT.jar"

WORKSPACE= os.getcwd()
SUMMARY_LOG = WORKSPACE + '/logs/'
FLAKEFLAGGER_TRACKER_GENERATED_DIRECTORY = SUMMARY_LOG + "/flakeflagger/"

MVN_LOC = "/Users/yhcrown/Documents/tools/apache-maven-3.9.5/bin/mvn"
# MVN_LOC = "/workspace/apache-maven-3.8.8/bin/mvn"

JAVA_HOME = "/Library/Java/JavaVirtualMachines/jdk8u442-b06/Contents/Home/"
# JAVA_HOME = "/shared-data/jdk8u422-b05/"

PROJECTS_DIRECTORY = "/Users/yhcrown/Documents/flaky_java_projects_ff/"

TO_DO_project_List_file = "/Users/yhcrown/Documents/GitHub/experiment-utils/project-utils/project_list"

NEW_PROJECT_DIR = "/Users/yhcrown/Documents/temp-projects/"
NEW_PROJECT_CSV = "./build_results.csv"

def default_project_dict():
    return {
        'total_tests': set(),
        'passed_tests': set(),
        'failed_tests': set(),
        'chaos_failed_tests': set(),
        'flaky_tests': set(),
        'tests': []
    }


def default_group_dict():
    return {
        'configs':[],
        'tests': set(),
        'other_config_tests': set()
    }

project_dict =  defaultdict(default_project_dict)


def fqcn_to_path(fqcn):
    """
    将全类名转换为相对路径，例如 com.example.TestClass -> com/example/TestClass.java
    """
    parts = fqcn.split('.')
    class_name = parts[-1] + '.java'
    package_path = os.path.join(*parts[:-1])
    return os.path.join(package_path, class_name)

def find_modules(root_dir):
    """
    遍历项目根目录，查找所有包含 pom.xml 和 src 目录的模块
    """
    modules = []
    for dirpath, dirnames, filenames in os.walk(root_dir):
        if 'pom.xml' in filenames and 'src' in dirnames:
            modules.append(dirpath)
    return modules

def find_test_module(modules, fqcn):
    """
    在所有模块中查找包含指定测试类的模块
    """
    relative_path = fqcn_to_path(fqcn)
    for module in modules:
        test_file_path = os.path.join(module, 'src', 'test', 'java', relative_path)
        if os.path.exists(test_file_path):
            return module
    return None

def find_module_path(project_root,fqcn):
    if not os.path.exists(project_root):
        print(f"项目根目录不存在: {project_root}")
        return

    modules = find_modules(project_root)
    if not modules:
        print("未找到任何模块。请确保项目根目录及其子目录包含 pom.xml 和 src 目录。")
        return

    module = find_test_module(modules, fqcn)
    if module:
        relative_module = os.path.relpath(module, project_root)
        if module == None:
            print(f"测试类 {fqcn} 属于模块: root")
        print(f"测试类 {fqcn} 属于模块: {relative_module}")
    else:
        print(f"未找到测试类 {fqcn} 所属的模块。")
    return module

def extract_and_process_tgz(directory):
    """
    遍历目录，处理其中的 .tgz 文件并提取 XML 文件进行解析
    """
    for root, dirs, files in os.walk(directory):
        for file in files:
            if file.endswith('.tgz'):
                tgz_path = os.path.join(root, file)
                # print(f"Processing: {tgz_path}")
                process_tgz(tgz_path)


def process_tgz(tgz_path):
    """
    解压 tgz 文件并处理其中的 XML 文件
    """
    with tarfile.open(tgz_path, "r:gz") as tar:
        for member in tar.getmembers():
            if member.isfile() and member.name.endswith('.xml'):
                xml_file = tar.extractfile(member)
                if xml_file:
                    process_xml(xml_file, member.name)
                    # print(xml_file)

flaky_fail_to_text = dict()

processed_projects = set()

def process_xml(xml_file, xml_path):
    """
    处理 XML 文件
    """
    try:
        tree = ET.parse(xml_file)
        root = tree.getroot()
        # 解析 Surefire 报告
        for testcase in root.findall(".//testcase"):
            test_name = testcase.attrib.get("name")
            classname = testcase.attrib.get("classname")

            # 查找失败的测试信息
            failure = testcase.find("error")
            if failure is None:
                failure = testcase.find("failure")
            if failure is not None:
                message = failure.attrib.get("message", "")
                # print(message)
                # 检查错误是否为 AssertionError
                if True:
                # if "Socket" in failure.text:
                # if "AssertionError" in failure.text:
                #     log_dir = base_log_file + "/".join(xml_path.replace("failingLogs", "").split("/")[:-1])
                #     if not os.path.exists(log_dir):
                #         os.makedirs(log_dir)
                #     log_file = log_dir + "/" + xml_path.split("/")[-1]
                    project = xml_path.split('/')[1]
                    processed_projects.add(project)
                    project_dict[project]['flaky_tests'].add(classname + '#' + test_name)
                    if project+'#'+classname+'#' + test_name not in flaky_fail_to_text:
                        flaky_fail_to_text[project+'#'+classname+'#' + test_name] = failure.text
                    # assertion_positive.add(project+'#'+classname+'#' + test_name)

                    simple_class_name = classname.split(".")[-1]
                    # process_error_log(failure.text, simple_class_name, project, xml_path,message, classname+'-'+test_name)
                    # with open(log_file, "w+") as f:
                    #     # f.write(f"AssertionError in test: {test_name}, Class: {classname}, Message: {message} \n")
                    #     f.write(f"SocketError in test: {test_name}, Class: {classname}, Message: {message} \n")
                    #     f.write(f"{failure.text}")
                    # 如果需要记录，可以写入文件或保存到数据结构中
    except ET.ParseError as e:
        print(f"Failed to parse XML: {xml_path}, Error: {e}")


def read_flakeflagger():
    path = './Project_Info.csv'
    df = pd.read_csv(path)
    need_process_projects = df.rename(columns={'SHA': 'Project_Hash','URL':'Project_URL'})
    need_process_projects['Project_Name'] = need_process_projects['Project_URL'].apply(lambda x: "-".join(x.split('/')[-2:]))
    for index, project in need_process_projects.iterrows():
        flakeflagger_project_to_sha[project['Project_Name']] = project['Project_Hash']
    return need_process_projects


def flakeflagger_flaky_tests():
    path = './test_results.csv'
    df = pd.read_csv(path)
    flaky_tests = df[["Project","Test"]].loc[df["IsFlaky"]==1]
    flaky_tests = flaky_tests.rename(columns={'Project':'Project_Name','Test':'testname'})
    flaky_tests["Project_Hash"] = flaky_tests['Project_Name'].apply(lambda x:flakeflagger_project_to_sha[x])
    # print(flaky_tests)
    return flaky_tests

def download_project(project, target_dir):
    cwd = os.getcwd()
    url = project['Project_URL']
    name = project['Project_Name']
    commit = project['Project_Hash']
    # if os.path.isdir(target_dir):
    #     shutil.rmtree(target_dir)
    os.chdir(PROJECTS_DIRECTORY)
    subprocess.run('git clone ' +url.strip() + ' ' + name, shell=True, stdout=open(os.devnull, 'w'), stderr=subprocess.STDOUT)
    if os.path.exists(target_dir):
        os.chdir(target_dir)
        subprocess.run('git checkout ' + commit, shell=True, stdout=open(os.devnull, 'w'), stderr=subprocess.STDOUT)
    else:
        print(f'{name} repository does not exist')
    os.chdir(cwd)

ff_build_fail_projects = set()
def build_project(target_dir):
    clean_cmd = MVN_LOC + " clean"
    # run_command(clean_cmd, target_dir)
    cmd = MVN_LOC + ' install -DskipTests -Ddependency-check.skip=true -Denforcer.skip=true -Drat.skip=true -Dmdep.analyze.skip=true -Dmaven.javadoc.skip=true -Dgpg.skip=true -Dlicense.skip=true -am  '
    print(target_dir, cmd)
    returncode, stdout, stderr = run_command(cmd, target_dir)
    build_log = target_dir + '/build.log'


    if returncode != 0:
        print("Build failed. See build.log for details.")

    with open(build_log, 'w', encoding='utf-8') as f:
        f.write(stdout)
        f.write(stderr)
    return returncode


def run_command(command, cwd):
    """Run a shell command and return (returncode, stdout, stderr)."""
    try:
        result = subprocess.run(command, cwd=cwd, shell=True,
                                stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True, timeout=900)
        return result.returncode, result.stdout, result.stderr
    except Exception as e:
        return -1, '', str(e)

def run_chaosapi(target_dir, log_dir):
    cmd = MVN_LOC + f" test -DargLine=\"-javaagent:{CHAOS_API_DIR} \" -Dmaven.test.failure.ignore=true"
    print(target_dir)
    print(cmd)
    returncode, stdout, stderr = run_command(cmd, target_dir)


    if returncode != 0:
        print("TEST failed. See test.log for details.")


    with open(log_dir, 'w', encoding='utf-8') as f:
        f.write(stdout)
        f.write(stderr)

chaos_positive = set()
def process_xml2(xml_file):
    """
    处理 XML 文件
    """
    # base_log_file = base_directory + '/flakeflagger_socket_failing_log/'
    try:
        tree = ET.parse(xml_file)
        root = tree.getroot()
        # 解析 Surefire 报告
        for testcase in root.findall(".//testcase"):
            test_name = testcase.attrib.get("name")
            classname = testcase.attrib.get("classname")
            project = xml_file.split(PROJECTS_DIRECTORY)[1].split('/')[0]
            # 查找失败的测试信息
            failure = testcase.find("error")
            if failure is not None:
                message = failure.attrib.get("message", "")
                # print(message)
                # 检查错误是否为 AssertionError

                if "Chaos" in failure.text:
                    print(xml_file)

                    chaos_positive.add(project+'#'+classname+'#' + test_name)

                # if "AssertionError" in failure.text:
                #     if not os.path.exists(log_dir):
                #         os.makedirs(log_dir)
                #     assertion_positive.add(project+'#'+classname+'#' + test_name)
                #
                #     simple_class_name = classname.split(".")[-1]
                #     # process_error_log(failure.text, simple_class_name, project, xml_path,message, classname+'-'+test_name)
                #     with open(log_file, "w+") as f:
                #         # f.write(f"AssertionError in test: {test_name}, Class: {classname}, Message: {message} \n")
                #         f.write(f"SocketError in test: {test_name}, Class: {classname}, Message: {message} \n")
                #         f.write(f"{failure.text}")
                    # 如果需要记录，可以写入文件或保存到数据结构中
    except ET.ParseError as e:
        print(f"Failed to parse XML: {xml_file}, Error: {e}")


def analyze_test_results():
    flakeflagger_projects = read_flakeflagger()
    for index, project in flakeflagger_projects.iterrows():
        project_name = project['Project_Name']
        target_dir = PROJECTS_DIRECTORY + project_name
        for dir, subpath, files in os.walk(target_dir):
            # print(dir)

            if 'target/surefire-reports' in dir:

                for file in files:
                    if file.endswith('.xml'):
                        xml_dir = dir + '/' + file
                        process_xml2(xml_dir)

projects = {}

ff_true_positive = set()


def ff_analyze():
    print("true positive: ", len(ff_true_positive.intersection(chaos_positive)), ff_true_positive.intersection(chaos_positive))
    print("false positive:", len(chaos_positive-ff_true_positive),chaos_positive-ff_true_positive)


def get_original_test_result(target_dir, cmd , report_dir):
    print(target_dir, " ", cmd)
    project_name = target_dir.split('/')[-1]
    returncode, stdout, stderr = run_command(cmd, target_dir)
    if stderr is not None:
        with open(report_dir+'/'+project_name+'-stderr.chaosapi', 'w+') as f:
            f.write(stderr)
    if stdout is not None:
        with open(report_dir+'/'+project_name+'-stdout.chaosapi', 'w+') as f:
            f.write(stdout)


    # if returncode == 0:
    for dir, subpath, files in os.walk(target_dir):
            if 'target/surefire-reports' in dir:
                focus_dir = dir.replace(target_dir,'/')
                focus_dir = report_dir + project_name + '/' + focus_dir
                # if not os.path.exists(focus_dir):
                #     os.makedirs(focus_dir)
                # print(focus_dir)
                if os.path.exists(focus_dir):
                    shutil.rmtree(focus_dir)
                shutil.copytree(dir,focus_dir)

same_text_num = 0

def get_test_failures(reports_dir, target_set):

    for dir, subpaths, files in os.walk(reports_dir):
        for file in files:
            if file.endswith('.xml'):
                project =  dir.replace(reports_dir,' ').split('/')[0].strip()

                config_name = reports_dir.split('/')[-2]
                if 'config_' in reports_dir:
                    if config_name not in project_dict[project]:
                        project_dict[project][config_name] = set()
                if project not in project_dict:
                    continue
                try:
                    tree = ET.parse(dir+'/'+file)
                    root = tree.getroot()
                    if root.tag == 'testsuite':
                        suites = [root]
                    elif root.tag == 'testsuites':
                        suites = root.findall('testsuite')
                    else:
                        print(f"未知的根元素 {root.tag} 在文件 {report_file}")
                        return failed_tests

                    for suite in suites:
                        # 失败的测试用例通常在 <testcase> 元素下有 <failure> 或 <error> 子元素
                        for testcase in suite.findall('testcase'):
                            project_dict[project]['total_tests'].add(testcase.get('classname')+ '#' + testcase.get('name'))

                            failures = testcase.findall('failure')
                            errors = testcase.findall('error')
                            if failures or errors:
                                # 获取测试用例的全名，通常由 classname + name 组成
                                classname = testcase.attrib.get('classname', 'UnknownClass')
                                testname = testcase.attrib.get('name', 'UnknownTest')
                                full_test_name = f"{project}#{classname}#{testname}".strip()
                                target_set.add(full_test_name)

                                global same_text_num
                                # text = None
                                # if 'config_' not in reports_dir:
                                #     if full_test_name not in flaky_fail_to_text:
                                #         print(full_test_name)
                                #     else:
                                #         text = flaky_fail_to_text[full_test_name]


                                for failure in failures:
                                    this_text = failure.text
                                    if 'config_' in reports_dir:
                                        project_dict[project]['chaos_failed_tests'].add(
                                            testcase.get('classname') + '#' + testcase.get('name'))
                                        project_dict[project][config_name].add(
                                            testcase.get('classname') + '#' + testcase.get('name'))

                                    else:
                                        project_dict[project]['failed_tests'].add(
                                        testcase.get('classname') + '#' + testcase.get('name'))

                                    # if text is not None and text == this_text:
                                    #     same_text_num += 1
                                    # else:
                                        # print("fail not occur",full_test_name)

                                        # print(text)
                                        # print(this_text)
                                for error in errors:
                                    this_text = error.text
                                    # if text is not None and text == this_text:
                                    #     same_text_num += 1
                                    if 'config_' in reports_dir:
                                        project_dict[project]['chaos_failed_tests'].add(
                                            testcase.get('classname') + '#' + testcase.get('name'))

                                        project_dict[project][config_name].add(
                                            testcase.get('classname') + '#' + testcase.get('name'))

                                    else:
                                        project_dict[project]['failed_tests'].add(
                                            testcase.get('classname') + '#' + testcase.get('name'))

                                    # else:
                                    #     print("erro not occur",full_test_name)
                                        # print(text)
                                        # print(this_text)



                except ET.ParseError as e:
                    print(f"  解析文件 {dir}{file} 失败: {e}")




def build_agent_args(config_file_path):
    sleepStrategy = "OFF"
    sleepValue = 900
    randomStrategy = "OFF"
    randomValue = -1
    socketStrategy = "OFF"
    socketValue = 100
    timeStrategy = "OFF"
    timeValue = 10000
    dateStrategy = "OFF"
    dateValue = "1582999200"
    zoneStrategy = "OFF"
    zoneValue = "Pacific/Chatham"
    localeStrategy = "OFF"
    localeValue = "tr-TR"
    clockStrategy = "OFF"
    clockValue = 3600
    httpDropStrategy = "OFF"


    with open(config_file_path, "r", encoding="utf-8") as file:
        for line in file:
            line = line.strip()
            if not line or "=" not in line:  # 跳过空行或格式错误行
                continue
            key, value = line.split("=", 1)
            key, value = key.strip(), value.strip()

            # 处理数据类型
            if value.isdigit():
                value = int(value)  # 转换整数
            elif value.startswith('"') and value.endswith('"'):
                value = value[1:-1]  # 处理字符串
            elif value.lstrip("-").isdigit():
                value = int(value)  # 处理负数
            # 赋值
            if key == "sleepStrategy":
                sleepStrategy = value
            elif key == "sleepValue":
                sleepValue = value
            elif key == "randomStrategy":
                randomStrategy = value
            elif key == "randomValue":
                randomValue = value
            elif key == "socketStrategy":
                socketStrategy = value
            elif key == "socketValue":
                socketValue = value
            elif key == "timeStrategy":
                timeStrategy = value
            elif key == "timeValue":
                timeValue = value
            elif key == "dateStrategy":
                dateStrategy = value
            elif key == "dateValue":
                dateValue = value
            elif key == "zoneStrategy":
                zoneStrategy = value
            elif key == "zoneValue":
                zoneValue = value
            elif key == "clockStrategy":
                clockStrategy = value
            elif key == "clockValue":
                clockValue = value
            elif key == "localeStrategy":
                localeStrategy = value
            elif key == "localeValue":
                localeValue = value
            elif key == "httpDropStrategy":
                httpDropStrategy = value


    args = (f"sleepStrategy={sleepStrategy},"
            f"sleepValue={sleepValue},"
            f"randomStrategy={randomStrategy},"
            f"randomValue={randomValue},"
            f"socketStrategy={socketStrategy},"
            f"socketValue={socketValue},"
            f"timeStrategy={timeStrategy},"
            f"timeValue={timeValue},"
            f"dateStrategy={dateStrategy},"
            f"dateValue={dateValue},"
            f"zoneStrategy={zoneStrategy},"
            f"zoneValue={zoneValue},"
            f"localeValue={localeValue},"
            f"localeStrategy={localeStrategy},"
            f"clockStrategy={clockStrategy},"
            f"clockValue={clockValue},"
            f"httpDropStrategy={httpDropStrategy}"

            )

    return args



# def get_config_list():


def get_idflakies_modify_pom_cmd(target_dir):
    cmd = "bash iDFlakies/pom-modify/modify-project.sh " + target_dir
    return cmd

def get_idflakies_run_cmd():
    cmd = MVN_LOC + " idflakies:detect -Ddetector.detector_type=random-class-method -Ddt.randomize.rounds=10 -Ddt.detector.original_order.all_must_pass=false -Dmaven.test.failure.ignore=true"
    return cmd

def find_flaky_test_from_idflakies():
    idflakies_dir = '/.dtfixingtools/detection-results/list.txt'
    flakeflagger_projects = read_flakeflagger()
    for index, project in flakeflagger_projects.iterrows():
        project_name = project['Project_Name']
        target_dir = PROJECTS_DIRECTORY + project_name
        if 'od_tests' not in project_dict[project_name]:
            project_dict[project_name]['od_tests'] = set()
        for dir, subpath, files in os.walk(target_dir):
            for file in files:
                if idflakies_dir in dir + '/' + file:
                    # print(dir+'/'+ file)
                    idflakies_json_dir = dir +'/'+ file
                    if os.path.exists(idflakies_json_dir):
                        with open(idflakies_json_dir, "r", encoding='utf-8') as f:
                            tests = f.readlines()

                            for test in tests:
                                test = re.sub(r'\.(?!.*\.)', '#', test.strip())
                                project_dict[project_name]['od_tests'].add(test)
                                # print(test)
        if 'od_tests' in project_dict[project_name]:
            print(project_name,'has od tests:',len(project_dict[project_name]['od_tests'].intersection(project_dict[project_name]['flaky_tests'])))
            print(project_dict[project_name]['od_tests'].intersection(project_dict[project_name]['flaky_tests']))
        #     print(project_name,tests)
        #
        # else:
        #     print(project_name, " no od tests")


def run_idflakies(target_dir,  report_dir):
    print("idflakies: ", target_dir)
    project_name = target_dir.split('/')[-1]
    pom_cmd = get_idflakies_modify_pom_cmd(target_dir)
    subprocess.run(pom_cmd, shell=True,
                   stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True, timeout=6000)
    # print(stdout)
    run_cmd = get_idflakies_run_cmd()
    if not os.path.exists(report_dir+'/'+project_name+'-stdout.idflakies'):
        # returncode, stdout, stderr = run_command(run_cmd, target_dir)
        # returncode, stdout, stderr = run_command(run_cmd, target_dir)
        os.chdir(target_dir)
        try:
            returncode, stdout, stderr  = subprocess.run(run_cmd,  shell=True,
                                    stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True, timeout=3600)
        except Exception as e:
            returncode, stdout, stderr  = -1, '', str(e)
        print(run_cmd)
    # if stderr is not None:
    #     with open(report_dir+'/'+project_name+'-stderr.chaosapi', 'w+') as f:
    #         f.write(stderr)
        if stdout is not None:
            with open(report_dir+'/'+project_name+'-stdout.idflakies', 'w+') as f:
                f.write(stdout)
        if stderr is not None:
            with open(report_dir+'/'+project_name+'-stderr.idflakies', 'w+') as f:
                f.write(stderr)
    os.chdir(WORKSPACE)

    #
    # for dir, subpath, files in os.walk(target_dir):
    #         if 'target/surefire-reports' in dir:
    #             focus_dir = dir.replace(target_dir,'/')
    #             focus_dir = report_dir + project_name + '/' + focus_dir
    #             if os.path.exists(focus_dir):
    #                 shutil.rmtree(focus_dir)
    #             shutil.copytree(dir,focus_dir)


def get_new_projects():
    successful = []
    with open(NEW_PROJECT_CSV, newline='', encoding='utf-8') as csvfile:
        reader = csv.DictReader(csvfile)
        for row in reader:
            # 这里 CSV 里 success 列写的是 True/False 字符串
            if row.get('success', '').lower() == 'true':
                successful.append(row['repo'].replace('/','_'))
    print('new project number:',len(successful),successful)
    return successful


def main():
    flakeflagger_projects = read_flakeflagger()
    flakeflagger_tests = flakeflagger_flaky_tests()

    for index, project in flakeflagger_projects.iterrows():
    # for project_name in get_new_projects():
        project_name = project['Project_Name']

    ## if target_dir do not exists, clone the repository first
        target_dir = PROJECTS_DIRECTORY + '/' + project_name
        # target_dir = NEW_PROJECT_DIR+'/' + project_name



        if project_name in [ 'square-okhttp', 'orbit-orbit', 'undertow-io-undertow', 'wildfly-wildfly', 'activiti-activiti', 'Alluxio-alluxio','apache-ambari', 'apache-incubator-dubbo', 'apache-hbase','togglz-togglz','square-okhttp','spring-projects-spring-boot','undertow-io-undertow']:
            continue
        # #

        # idflakies_report_dir = WORKSPACE + '/idflakies-flakeflagger/'
        # if not os.path.exists(idflakies_report_dir+project_name+'/'):
        #     os.makedirs(idflakies_report_dir+project_name+'/')
        # run_idflakies(target_dir, idflakies_report_dir+project_name+'/')


        # continue

        # if project_name != 'apache-commons-exec':
        #     continue



        for dir, subpath, files in os.walk(WORKSPACE+'/chaos_agent_configs/'):
            for file in files:
                args = build_agent_args(dir+'/'+file)
                report_dir = WORKSPACE + '/chaosapi-experiments-newproject/' + file + '/'
                if not os.path.exists(report_dir):
                    os.makedirs(report_dir)
                # if project_name in ['joel-costigliola-assertj-core']:
                agent_log_dir = report_dir + '/chaoslog/'
                if not os.path.exists(agent_log_dir):
                    os.makedirs(agent_log_dir)

                # if True:
                if not os.path.exists(report_dir+'/'+project_name):
                    log = agent_log_dir + project_name + '.agentlog'
                    if "only_zone" in file:
                        get_original_test_result(target_dir,
                                                 "zoneStrategy=FIX zoneValue=Pacific/Chatham "+ MVN_LOC + f" clean test -DargLine=\"-javaagent:{CHAOS_API_DIR}={args},console=false,log={log} \" -Dmaven.test.failure.ignore=true",
                                                 report_dir)
                    elif "only_locale" in file:
                        get_original_test_result(target_dir,
                                                 "localeStrategy=FIX localeValue=tr-TR " + MVN_LOC + f" clean test -DargLine=\"-javaagent:{CHAOS_API_DIR}={args},console=false,log={log} \" -Dmaven.test.failure.ignore=true",
                                                 report_dir)
                    else:
                        get_original_test_result(target_dir,  MVN_LOC + f" clean test -DargLine=\"-javaagent:{CHAOS_API_DIR}={args},console=false,log={log} \" -Dmaven.test.failure.ignore=true",report_dir)



        report_dir = '/flakeflagger_chaosapi_test_report-config-v3/'
        # code = build_project(target_dir)
        # if code != 0:
        #     ff_build_fail_projects.add(project_name)
        # get_original_test_result(target_dir, MVN_LOC + ' clean test -Dmaven.test.failure.ignore=true',WORKSPACE + '/flakeflagger_original_test_report/')
        # get_original_test_result(target_dir,  MVN_LOC + f" test -DargLine=\"-javaagent:{CHAOS_API_DIR}={build_agent_args()} \" -Dmaven.test.failure.ignore=true",WORKSPACE + '/'+report_dir)

        generated_dir = FLAKEFLAGGER_TRACKER_GENERATED_DIRECTORY+"/CHAOSAPI/"+project_name
        if not os.path.exists(generated_dir):
            os.makedirs(generated_dir)
        generated_log_path = generated_dir + '/chaos.log'
        if not os.path.exists(generated_log_path):
            ff_build_fail_projects.add(project_name)
        # if project_name not in ff_build_fail_projects:
            # print(ff_build_fail_projects)
            # run_chaosapi(target_dir,generated_log_path)

    for index, Test in flakeflagger_tests.iterrows():
        project_name = Test['Project_Name']
        test_name = Test['testname']
        if not project_name in ff_build_fail_projects:
            ff_true_positive.add(project_name+'#'+ test_name)
    find_flaky_test_from_idflakies()




def analyze_positive_result(write_dir):
    random_group = {'config_only_random_fix', 'config_only_random_max', 'config_only_random_min'}
    date_group = {'config_only_date_bk', 'config_only_fix_date'}
    sleep_group = {'config_only_sleep_decrease', 'config_only_sleep_increase', 'config_only_sleep_random'}
    time_group = {'config_only_time_increment', 'config_only_time_same', 'config_only_time_round',
                  'config_only_time_zero'}
    zone_group = {'config_only_zone_fix'}
    socket_group = {'config_only_socket_0.1'}
    clock_group = {'config_only_clock_plus'}
    locale_group = {'config_only_locale_fix'}


    group_dict = defaultdict(default_group_dict)
    group_list = ['random_group','date_group',"sleep_group","time_group","zone_group","socket_group", "locale_group", "clock_group"]
    group_dict['random_group']['configs'] = random_group
    group_dict['date_group']['configs'] = date_group
    group_dict['sleep_group']['configs'] = sleep_group
    group_dict['time_group']['configs'] =  time_group
    group_dict['zone_group']['configs'] = zone_group
    group_dict['socket_group']['configs'] = socket_group
    group_dict['clock_group']['configs'] = clock_group
    group_dict['locale_group']['configs'] = locale_group

    with open(write_dir, 'w', newline='', encoding='utf-8') as csvfile:
        writer = csv.writer(csvfile)

        fixed_keys = ['total_tests', 'failed_tests', 'chaos_failed_tests', 'flaky_tests', 'tests','passed_tests']

        title_list = ['Project', 'Total_Tests', 'Original_Failed', 'Chaosi_Failed','Flaky_Tests', 'TP' , 'new_TP', 'non_od_flaky', 'non_od_flaky_tp','FP_without_locale']
        # writer.writerow(['Project', 'Total_Tests', 'Original_Failed', 'Chaosi_Failed','Flaky_Tests', 'TP'])
        keys_to_delete = [
            project for project, data in project_dict.items()
            if len(data['total_tests']) == 0
        ]
        for key in keys_to_delete:
            del project_dict[key]

        for key, value in next(iter(project_dict.items()))[1].items():
            if key not in fixed_keys:
                title_list.append(key)
        for key, value in group_dict.items():
            title_list.append(key)
        writer.writerow(title_list)
        sum_total_tests = 0
        sum_failed_tests = 0
        sum_chaosi_failed_tests = 0
        sum_flaky_tests = 0
        sum_tp = 0
        sum_new_tp = 0
        sum_flaky_nod = 0
        sum_flaky_nod_tp= 0

        sum_tp_without_zone = 0
        for project, info in project_dict.items():
            for key, value in group_dict.items():
                value['tests'] = set()
                value['other_config_tests'] = set()

            temp_group_sum = set()
            # tests_str = '; '.join(info['tests'])
            # fixed_keys = ['total_tests', 'failed_tests', 'chaos_failed_tests', 'flaky_tests','passed_tests']
            if project in ['square-okhttp', 'orbit-orbit','undertow-io-undertow', 'wildfly-wildfly', 'apache-incubator-dubbo']:
                continue




            row = [project]

            row.append(len(info['total_tests']))
            row.append(str(len(info['failed_tests']) )  + '->' + str(len(info['failed_tests'].intersection(info['flaky_tests'])))  )
            row.append(len(info['chaos_failed_tests']))
            row.append(len(info['flaky_tests']))
            row.append(len(info['chaos_failed_tests'].intersection(info['flaky_tests'])))
            row.append(len(  (info['chaos_failed_tests'] - info['failed_tests']).intersection(info['flaky_tests'])   ))
            row.append(len(  (info['flaky_tests'] - info['od_tests'])    ))
            row.append(len(  (info['flaky_tests'] - info['od_tests']).intersection(info['chaos_failed_tests'])  ))

            if 'config_only_locale_fix-flakeflagger' in info:
                row.append(len (  (info['chaos_failed_tests'] - info['flaky_tests']) - info['config_only_locale_fix-flakeflagger'] ))
            else:
                print(project)
                row.append(len((info['chaos_failed_tests'] - info['flaky_tests'])))

            for key, value in info.items():
                if key not in fixed_keys:
                    temp_sum = set()
                    temp_sum.update(info['failed_tests'])
                    for key2 , value2 in info.items():
                        if key2 != key and key2 not in fixed_keys:
                            temp_sum.update(value2)

                    row.append(str(len(value - info['failed_tests']))  + '->' + str(len(value.intersection(info['flaky_tests']))) + '->' + str(len(value-temp_sum)) + '->' + str(len((value-temp_sum).intersection(info['flaky_tests']))))
                    if len((value-temp_sum).intersection(info['flaky_tests'])) > 0:
                        print('----unique flaky----')
                        print(f"{project} has unique flaky test on config {key} : {(value-temp_sum).intersection(info['flaky_tests'])}")

                    if len((value-temp_sum)) > 0:
                        print('----unique failure----')
                        print(f"{project} has unique flaky test on config {key} : {(value-temp_sum)}")


                    for group in group_list:
                        if key.split('-flakeflagger')[0] in group_dict[group]['configs']:
                            group_dict[group]['tests'].update(value)
                        else:
                            group_dict[group]['other_config_tests'].update(value)
            for group_name, group_info in group_dict.items():
                row.append ( str(len (group_info['tests'] - group_info['other_config_tests'])) + '->' + str(len (  (group_info['tests'] - group_info['other_config_tests']).intersection(info['flaky_tests'])  )))

            writer.writerow(row)

            sum_total_tests += len(info['total_tests'])

            if len(info['total_tests']) != 0:
                sum_failed_tests += len(info['failed_tests'])
                sum_chaosi_failed_tests += len(info['chaos_failed_tests'])
                sum_flaky_tests +=  len(info['flaky_tests'])
                sum_tp += len(info['chaos_failed_tests'].intersection(info['flaky_tests']))
                sum_new_tp += len(  (info['chaos_failed_tests'] - info['failed_tests']).intersection(info['flaky_tests']))
                sum_flaky_nod += len(  (info['flaky_tests'] - info['od_tests'])    )
                sum_flaky_nod_tp += len(  (info['flaky_tests'] - info['od_tests']).intersection(info['chaos_failed_tests'])    )
                sum_tp_without_zone +=len (  (info['chaos_failed_tests'] - info['flaky_tests']) - info['config_only_locale_fix-flakeflagger'] )
            # row.append()??

            #

        writer.writerow(['sum',sum_total_tests,sum_failed_tests,sum_chaosi_failed_tests,sum_flaky_tests,sum_tp,sum_new_tp, sum_flaky_nod,sum_flaky_nod_tp,sum_tp_without_zone])





chaos_fails = set()
original_fails = set()
config_list = []

def custom_serializer(obj):
    if isinstance(obj, set):
        return list(obj)
    if isinstance(obj, dict):
        return {k: v for k, v in obj.items() if k != "total_tests"}
    raise TypeError(f"Type {type(obj)} not serializable")


if __name__ == '__main__':
    os.environ['JAVA_HOME'] = JAVA_HOME
    os.environ['MAVEN_HOME'] = MVN_LOC

    base_directory = r"/Users/yhcrown/Documents/GitHub/generated-flaky-study/flakeflagger_failing_log/"
    returncode, stdout, stderr = run_command(MVN_LOC+ " -version",os.getcwd())
    print(stdout)

    ff_project_dict_cache_file = WORKSPACE + '/ff-project-dict.pkl'
    if os.path.exists(ff_project_dict_cache_file):
        with open(ff_project_dict_cache_file , "rb") as f:
            project_dict = pickle.load(f)
        print("load project_dict from cache")
    else:
        extract_and_process_tgz(base_directory)
        print('save project_dict into '+ff_project_dict_cache_file)
        with open(ff_project_dict_cache_file , "wb") as f:
            pickle.dump(project_dict, f)
    # print(flaky_fail_to_text)

    main()


    temp_fails = set()
    # get_test_failures(WORKSPACE + '/flakeflagger_original_test_report/', original_fails)
    project_dict['jknack-handlebars.java']['flaky_tests'] = {'com.github.jknack.handlebars.HumanizeHelperTest#naturalTime'}
    easily_triggered_flaky_tests = set()

    for dir, subpath, files in os.walk(WORKSPACE+'/chaosapi-experiments/'):
            for path in subpath:
                # print(path)
                if 'config_' in path:
                    temp_fails = set()
                    config_list.append(path)
                    print(dir+'/'+path)
                    get_test_failures(dir+'/'+path+'/', temp_fails)

                    if len(original_fails - temp_fails) > 0:
                        print("strange:", path )
                        easily_triggered_flaky_tests.update(original_fails - temp_fails)
                        print(len(original_fails-temp_fails),original_fails - temp_fails)
                        # print('new failures -------')

                        # print(path)
                        # print(len(temp_fails-original_fails), temp_fails-original_fails)
                    chaos_fails.update(temp_fails)
    print("easily triggered flaky tests:",len(easily_triggered_flaky_tests), easily_triggered_flaky_tests)
    print("keep failed tests:", len(original_fails - easily_triggered_flaky_tests), original_fails - easily_triggered_flaky_tests)


    with open(WORKSPACE+'/project_dict.json', 'w', encoding='utf-8') as f:
        json.dump(project_dict, f,  default=custom_serializer, ensure_ascii=False, indent=4)
    # print(project_dict)
    # analyze_test_results()
    # ff_analyze()
    # get_test_failures(WORKSPACE + '/flakeflagger_original_test_report/',original_fails)
    # get_test_failures(WORKSPACE + '/flakeflagger_chaosapi_test_report/', chaos_fails)
    print("1:",len(chaos_fails))
    # get_test_failures(WORKSPACE + '/flakeflagger_chaosapi_test_report-config-v1/', chaos_fails)
    print("2:",len(chaos_fails))

    # get_test_failures(WORKSPACE + '/flakeflagger_chaosapi_test_report-config-v2/', chaos_fails)

    # get_test_failures(WORKSPACE + '/flakeflagger_chaosapi_test_report-config-v3/', chaos_fails)

    print("3:",len(chaos_fails))

    analyze_positive_result(WORKSPACE+'/logs/chaos_fail_summary.csv')
    print(len(original_fails))
    print(len(chaos_fails))
    print(len(ff_true_positive))
    print(chaos_fails)
    print(len(ff_true_positive.intersection(original_fails)))
    print(len(ff_true_positive.intersection(chaos_fails)))
    print(ff_true_positive.intersection(chaos_fails))

    print(chaos_positive)
    print(same_text_num)
