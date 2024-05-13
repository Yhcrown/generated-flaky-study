import pandas as pd
import os
import shutil
import subprocess
import datetime
import time
import logging
import re
import csv
logging.basicConfig(format='%(asctime)s - %(message)s', level=logging.DEBUG)

# PROJECTS_DIRECTORY = "/Users/yhcrown/Documents/flaky_java_projects/"
PROJECTS_DIRECTORY = "/shared-data/generated-flaky/projects/"
CURRENT_DIRECTORY = os.getcwd()
# RANDOOP_GENERATED_DIRECTORY = "/Users/yhcrown/Documents/GitHub/generated-flaky-study/randoop_tests/"
RANDOOP_GENERATED_DIRECTORY = "/shared-data/generated-flaky/randoop_tests/"
# TOOLS_DIRECTORY = "/Users/yhcrown/Documents/tools/"


WORKSPACE='/workspace/generated-flaky-study/'

TOOLS_DIRECTORY = "/shared-data/common-jar/"

RANDOOP_JAR = TOOLS_DIRECTORY + 'randoop-all-4.3.2.jar'
GUAVA_JAR = TOOLS_DIRECTORY + 'guava-32.1.3-jre.jar'
HAMCREST_JAR = TOOLS_DIRECTORY + 'hamcrest-core-1.3.jar'
JUNIT_JAR = TOOLS_DIRECTORY + 'junit-4.13.2.jar'
# SUMMARY_LOG = CURRENT_DIRECTORY + '/logs/'
SUMMARY_LOG = '/shared-data/generated-flaky/logs/'

# MVN_LOC = "/Users/yhcrown/Documents/tools/apache-maven-3.9.5/bin/mvn"
MVN_LOC = "/workspace/apache-maven-3.9.6/bin/mvn"

# JAVA_HOME = "/Library/Java/JavaVirtualMachines/zulu-8.jdk/Contents/Home"
JAVA_HOME = "/workspace/jdk8u392-b08/"

RERUN_TIMES = 10


project_to_sha = dict()
build_fails = set()
generate_fails = set()
flaky_projects = set()
evosuite_flaky_projects = set()
flaky_tests_per_project = dict()
modified_flaky_tests_per_project = dict()
line_content = dict()
normal_test_num_per_project = dict()
flaky_sta = dict()

initial_flaky_test = dict()


error_case_num = 0

total_test_num = 0
total_flaky_num = 0

def read_dataset():
    path = "./dataset.csv"
    path = WORKSPACE+"/dataset.csv"
    df = pd.read_csv(path)
    developer_NOD_projects = df['Project_Name'].loc[df['flaky'] == 'NOD'].loc[df['language'] == 'Java'].loc[
        df['test_type'] == 'developer-written'].unique()
    cols_to_keep = ['Project_Name', 'Project_URL', 'Project_Hash']
    developer_NOD_info = pd.DataFrame(
        df[df['Project_Name'].isin(developer_NOD_projects)][cols_to_keep].drop_duplicates())
    developer_NOD_info.to_csv(WORKSPACE+'/developer_NOD_projects_info.csv')
    print(developer_NOD_info)
    test_info = df.loc[df['flaky'] == 'NOD'].loc[
        df['language'] == 'Java'].loc[df['test_type'] == 'developer-written']
    test_info =  test_info[test_info['Project_Name'].isin(developer_NOD_projects)]
    print(len(test_info))
    print(df[
              'test_type'].unique())  ## ['evosuite_Default' 'evosuite_NoFlakinessSuppression' 'developer-written' 'generated']
    print(df['flaky'].unique())  ## not flaky, NOD,  OD
    print(developer_NOD_projects, len(developer_NOD_projects))  ## 105, same as paper
    evo = df['Project_Name'].loc[df['flaky'] == 'NOD'].loc[df['language'] == 'Java'].loc[
        df['test_type'] == 'evosuite_Default'].unique()
    for p in evo:
        if p in developer_NOD_projects:
            evosuite_flaky_projects.add(p)
    print("evosuite:", len(df['Project_Name'].loc[df['flaky'] == 'NOD'].loc[df['language'] == 'Java'].loc[
                               df['test_type'] == 'evosuite_NoFlakinessSuppression'].unique()))
    return developer_NOD_info


def download_project(project, target_dir):
    cwd = os.getcwd()
    url = project['Project_URL']
    name = project['Project_Name']
    commit = project['Project_Hash']
    if os.path.isdir(target_dir):
        shutil.rmtree(target_dir)
    os.chdir(PROJECTS_DIRECTORY)
    subprocess.run('git clone ' + url + ' ' + name, shell=True, stdout=open(os.devnull, 'w'), stderr=subprocess.STDOUT)
    os.chdir(target_dir)
    subprocess.run('git checkout ' + commit, shell=True, stdout=open(os.devnull, 'w'), stderr=subprocess.STDOUT)
    os.chdir(cwd)


def build_project(target_dir):
    cwd = os.getcwd()
    os.chdir(target_dir)
    build_log = target_dir + '/build.log'
    start_time = time.time()
    print('Building client ... ' + str(datetime.datetime.now()))
    os.environ['JAVA_HOME'] = JAVA_HOME
    subprocess.run(
        MVN_LOC + ' install -DskipTests -Ddetector.detector_type=random-class-method -Ddt.randomize.rounds=10 -Ddt.detector.original_order.all_must_pass=false -Ddependency-check.skip=true -Denforcer.skip=true -Drat.skip=true -Dmdep.analyze.skip=true -Dmaven.javadoc.skip=true -Dgpg.skip -Dlicense.skip=true -am  ',
        shell=True, stdout=open(build_log, 'w'), stderr=subprocess.STDOUT)
    end_time = time.time()
    insertTimeInLog(start_time, end_time, build_log)
    os.chdir(cwd)


def run_randoop(project, target_dir):
    cwd = os.getcwd()
    os.chdir(target_dir)
    if os.path.isdir('/tmp/jars'):
        shutil.rmtree('/tmp/jars')
    os.mkdir('/tmp/jars')

    start_time = time.time()
    os.environ['JAVA_HOME'] = JAVA_HOME
    subprocess.run(MVN_LOC+ ' dependency:copy-dependencies',
                   shell=True, stdout=open(os.devnull, 'w'), stderr=subprocess.STDOUT)
    for dir, subdir, files in os.walk(target_dir):
        if "dependency" in subdir:
            for file in os.listdir(dir + "/dependency"):
                if file.endswith(".jar"):
                    shutil.copy(dir + "/dependency/" + file, "/tmp/jars")
    os.chdir(target_dir)

    ## Linux platform
    concat_class_path = '$(find ' + target_dir + ' -name \"classes\" -type d | paste -sd :)'
    concat_class_path += ':$(find ' + target_dir + ' -name \"test-classes\" -type d | paste -sd :)'
    concat_class_path += ':$(find /tmp/jars -name \"*.jar\" -type f | paste -sd :):'
    # print(concat_class_path)
    ## Mac os platform

    # concat_class_path = '$(find ' + target_dir + ' -name "classes" -type d | xargs echo | tr \' \' \':\')'
    # concat_class_path += ':$(find ' + target_dir + ' -name "test-classes" -type d | xargs echo | tr \' \' \':\')'
    # concat_class_path += ':$(find /tmp/jars -name "*.jar" -type f | xargs echo | tr \' \' \':\'):'

    generated_dir = RANDOOP_GENERATED_DIRECTORY + project['Project_Name'] + '/' + project['Project_Hash'] + '/alltests/'
    if not os.path.exists(generated_dir):
        os.makedirs(generated_dir)
    literals_file = generated_dir + 'literal.log'
    test_method_num_limit = 500
    test_method_max_size = 100
    class_list_file = '/tmp/classes.txt'
    all_classes = []
    # print(target_dir)
    for dir_path, subpaths, files in os.walk(target_dir):
        for f in files:

            if f.endswith('.class') and '/classes/' in dir_path:
                clz = (dir_path + '/' + f.split('.')[0]).split('/classes/')[-1].replace('/', '.')
                if clz not in all_classes:
                    all_classes.append(clz)
    # print(all_classes)

    with open(class_list_file, 'w') as fw:
        for clz in all_classes:
            if '$' in clz:
                # print(clz)
                clz = clz.split('$')[0]
            fw.write(clz + '\n')

    concat_class_path += RANDOOP_JAR + ':'
    concat_class_path += JUNIT_JAR + ':'
    concat_class_path += HAMCREST_JAR + ':'
    concat_class_path += GUAVA_JAR

    os.environ['JAVA_HOME'] = JAVA_HOME
    randoop_cmd = JAVA_HOME+'/bin/java -ea -classpath ' + concat_class_path + \
                  ' randoop.main.Main gentests' \
                  + ' --classlist=' + class_list_file \
                  + ' --output-limit=' + str(test_method_num_limit) \
                  + ' --time-limit=60' \
                  + ' --junit-output-dir=' + generated_dir \
                  + ' --regression-test-basename=TestGroup' \
                  + str(test_method_max_size) + 'Case' \
                  + ' --log=' + str(generated_dir) + 'randoop-log.txt' \
                  + ' --usethreads=true' \
        # + ' --literals-file=' + literals_file \
    # + ' --literals-level=ALL'
    logging.info(randoop_cmd)
    test_gen_log = generated_dir + '/testgen.txt'
    try:
        subprocess.run(randoop_cmd, shell=True, stdout=open(test_gen_log, 'w'), stderr=subprocess.STDOUT, timeout=90)
    except subprocess.TimeoutExpired as e:
        with open(test_gen_log, "a+") as f:
            f.write(str(e))
        print(project['Project_Name'], e)
    end_time = time.time()
    insertTimeInLog(start_time, end_time, test_gen_log)
    os.chdir(cwd)


def insertTimeInLog(start_time, end_time, log):
    duration = (end_time - start_time)
    fr = open(log, 'r')
    lines = fr.readlines()
    fr.close()
    lines.insert(0, '[TIME]: ' + str(datetime.timedelta(seconds=duration)) + '\n')
    fw = open(log, 'w')
    fw.write(''.join(lines))
    fw.close()


def search_build_error():
    log = open(SUMMARY_LOG + 'build_summary.log', 'w+')
    global error_case_num
    for dir, subpath, files in os.walk(PROJECTS_DIRECTORY):
        for file in files:
            if file == 'build.log':
                with open(dir + '/' + file, 'r') as f:
                    lines = f.readlines()
                    for line in lines:
                        if '[INFO] BUILD FAILURE' in line:
                            log.write(dir.split("/")[-1] + ', BUILD FAILURE\n')
                            build_fails.add(dir.split('/')[-1])
                            # error_case_num = error_case_num +1
                        if '[ERROR]' in line:
                            log.write(line)
    log.close()


def search_generate_error():
    log = open(SUMMARY_LOG + 'generated_summary.log', 'w+')
    for dir, subpath, files in os.walk(PROJECTS_DIRECTORY):
        for file in files:
            if file == 'build.log':
                with open(dir + '/' + file, 'r') as f:
                    lines = f.readlines()
                    for line in lines:
                        if '[INFO] BUILD FAILURE' in line:
                            log.write(dir.split("/")[-1] + ', BUILD FAILURE\n')
                            build_fails.add(dir.split('/')[-1])
                        if '[ERROR]' in line:
                            log.write(line)
    log.close()


def search_error_cause():
    global error_case_num
    for dir, subpath, files in os.walk(RANDOOP_GENERATED_DIRECTORY):
        for file in files:
            if file == "testgen.txt":
                if len(files) < 4:
                    print("no generated test in project:", dir.split("/")[-3])
                    error_case_num = error_case_num + 1
                    generate_fails.add(dir.split('/')[-3])
                    if dir.split("/")[-3] not in build_fails:
                        print("-----", dir.split("/")[-3])
                    break


def find_flaky():
    log = open(SUMMARY_LOG + 'flaky_summary.log', 'w+')
    log2 = open(SUMMARY_LOG + 'flaky_line.log', 'w+')
    for dir, subpath, files in os.walk(RANDOOP_GENERATED_DIRECTORY):
        for file in files:
            if file == "testgen.txt":
                with open(dir + '/' + file, 'r') as f:
                    lines = f.readlines()
                    first = True
                    for line in lines:
                        if 'Possibly flaky:' in line:
                            if first:
                                log.write(dir.split("/")[-3] + '\n')
                                first = False
                                flaky_projects.add(dir.split('/')[-3])
                            log.write(line)
    pattern = r'@Test.*?// flaky:.*?(?=@Test|\Z)'

    global total_flaky_num
    global total_test_num
    for project in flaky_projects:
        for dir, subpath, files in os.walk(RANDOOP_GENERATED_DIRECTORY + "/" + project):
            for file in files:
                if file == "TestGroup100Case0.java":
                    with open(dir + '/' + file, 'r') as f:
                        java_code = f.read()
                        total_test_num += len(java_code.split("@Test"))
                        if project not in normal_test_num_per_project:
                            normal_test_num_per_project[project] = len(java_code.split("@Test"))
                        matches = re.findall(pattern, java_code, re.DOTALL)
                        project_name = dir.split("/")[-3]
                        # log2.write(project_name + ", length: "+str(len(matches))+"\n")

                        for match in matches:
                            test_case = match.strip().split('@Test')[-1]
                            total_flaky_num += 1
                            if project not in flaky_tests_per_project:
                                flaky_tests_per_project[project] = list()
                            flaky_tests_per_project[project].append(test_case)
                            # print(test_case)
                            # log2.write(test_case+"\n")
                        last_test = java_code.strip().split('@Test')[-1]
                        for line in last_test.split('\n'):
                            if '// flaky:' in line:
                                if project not in flaky_tests_per_project:
                                    flaky_tests_per_project[project] = list()
                                flaky_tests_per_project[project].append(last_test)


    uncomment_tests()
    generate_new_testclass()


def uncomment_tests():
    for flaky_project in flaky_projects:
        tests = flaky_tests_per_project[flaky_project]
        modified_flaky_tests_per_project[flaky_project] = list()
        for test_code in tests:
            versions = []
            lines = test_code.split('\n')
            flaky_lines = [i for i, line in enumerate(lines) if '// flaky:' in line]
            for i, line_num in enumerate(flaky_lines):
                version = lines.copy()
                version[line_num] = version[line_num].replace('// flaky:', '')
                new_code = '\n'.join(version)
                test_name = re.search(r'public void\s+(\w+)\s*\(', test_code).group(1)
                modified_test_name = f"{test_name}_{i + 1}"

                modified_test_code = re.sub(r'public void\s+' + test_name + r'\s*\(',
                                            'public void ' + modified_test_name + '(',
                                            new_code)
                modified_flaky_tests_per_project[flaky_project].append(modified_test_code)
                line_content[flaky_project+'_'+modified_test_name.split('.')[-1]] = version[line_num]

def generate_new_testclass():
    for project in flaky_projects:
        for dir, subpath, files in os.walk(RANDOOP_GENERATED_DIRECTORY + "/" + project):
            for file in files:
                if file == 'TestGroup100Case0.java':
                    # os.remove(dir+'/'+'flaky_tests.java')
                    with open(dir + '/' + file, 'r+') as f:
                        original_lines = f.readlines()
                        new_lines = []
                        new_lines.append("package flaky; \n")
                        for line in original_lines:
                            if line.startswith("import") or line.startswith(
                                    "@Fix") or "public static boolean debug = false;" in line:
                                new_lines.append(line)
                            elif line.startswith("public class"):
                                new_lines.append("public class FlakyTest{")
                            elif "@Test" in line:
                                break
                        new_class = '\n'.join(new_lines)
                        for test in modified_flaky_tests_per_project[project]:
                            new_class += "\n" + "\t@Test" + test
                        new_class += '\n}'
                    with open(dir + '/FlakyTest.java', 'w+') as f:
                        f.write(new_class)



def copy_and_run():
    cwd = os.getcwd()
    for project in flaky_projects:
        target_dir = PROJECTS_DIRECTORY + project
        os.chdir(target_dir)
        test_dir = target_dir + '/src/test/java/flaky'
        if not os.path.exists(test_dir):
            os.mkdir(test_dir)
        for dir, subpath, files in os.walk(RANDOOP_GENERATED_DIRECTORY + "/" + project):
            if 'FlakyTest.java' in files:
                log_dir = dir + '/rerun/'
                if not os.path.exists(log_dir):
                    os.mkdir(log_dir)
                if 'FlakyTests.java' in files:
                    os.remove(dir+'/FlakyTests.java')
                if os.path.exists(test_dir+'FlakyTests.java'):
                    os.remove(test_dir+'/FlakyTests.java')
                shutil.copy(dir + '/FlakyTest.java', test_dir + '/FlakyTest.java')
        #         with open(dir + '/FlakyTest.java', 'r+') as f:
        #             java_code = f.read()
        #             pattern = r'public void (.*?)\(\)'
        #             matches = re.findall(pattern, java_code)
        #         break
        # for test in matches:
        #     cmd = '/Users/yhcrown/Documents/tools/apache-maven-3.9.5/bin/mvn -Dtest=FlakyTest#' + test + " test "
        #     cmd2 = '/Users/yhcrown/Documents/tools/apache-maven-3.9.5/bin/mvn -Dtest=FlakyTest#' + test + " surefire:test "
        #     print(os.getcwd(), cmd)
        #     if not os.path.exists(log_dir + test):
        #         os.mkdir(log_dir + test)
        #     subprocess.run(cmd, shell=True, stdout=open(log_dir + test + '/' + '0.log', 'w+'),
        #                    stderr=subprocess.STDOUT, timeout=90)
        #     for i in range(1, 10):
        #         subprocess.run(cmd2, shell=True, stdout=open(log_dir + test + '/' + str(i) + '.log', 'w+'),
        #                        stderr=subprocess.STDOUT, timeout=90)
        cmd = MVN_LOC+ ' -Dtest=FlakyTest test '
        cmd2 = MVN_LOC+ ' -Dtest=FlakyTest surefire:test'
        print(os.getcwd(), cmd)
        if not os.path.exists(log_dir + '/all'):
            os.mkdir(log_dir + '/all')
        subprocess.run(cmd, shell=True, stdout=open(log_dir + '/all/' + '0.log', 'w+'),
                       stderr=subprocess.STDOUT, timeout=90)
        for i in range(1, RERUN_TIMES):
            subprocess.run(cmd2, shell=True, stdout=open(log_dir + '/all/' + str(i) + '.log', 'w+'),
                           stderr=subprocess.STDOUT, timeout=90)


def collect_flaky():
    # for project in flaky_projects:
    csv_log = SUMMARY_LOG + '/flaky_rerun.csv'
    with open(csv_log, 'w+', newline='') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(['project','sha','test','line','message'])
        for dir, subpath, files in os.walk(RANDOOP_GENERATED_DIRECTORY):
                if dir.endswith('/all'):
                    for log_file in files:
                        project_name = dir.split('/')[-5]
                        project_sha = dir.split('/')[-4]
                        project_to_sha[project_name] = project_sha
                        with open(dir + '/' + log_file, 'r+') as f:
                            log_content = f.read()
                            # 提取test部分的信息

                            test_results = re.findall(r'FlakyTest.(.*?)\:(\d+)\s+(.*?)$', log_content, re.MULTILINE)
                            for test_result in test_results:
                                test_name = test_result[0]
                                line_number = test_result[1]
                                error_message = test_result[2]

                                writer.writerow([project_name,project_sha,test_name, line_number, error_message])


def statistic_flaky():
    # flaky_sta = dict()
    with open(SUMMARY_LOG+'flaky_rerun.csv','r+') as f:
        reader = csv.reader(f)
        next(reader)
        for row in reader:
            name = row[0]
            if name not in flaky_sta:
                flaky_sta[name] = dict()
                flaky_sta[name]['name'] = name
                flaky_sta[name]['test_sta'] = dict()
                flaky_sta[name]['sha'] = row[1]
            flaky_project = flaky_sta[name]
            test_name = row[2]
            if test_name not in flaky_project['test_sta']:
                flaky_project['test_sta'][test_name] = dict()
                flaky_project['test_sta'][test_name]['line'] = row[3]
                flaky_project['test_sta'][test_name]['wrong_times'] = 0
            flaky_project['test_sta'][test_name]['wrong_times']+= 1
    with open(SUMMARY_LOG + 'flaky_rerun_all.csv', 'w+',newline='') as wf:
        writer = csv.writer(wf)
        writer.writerow(['project', 'sha', 'test', 'line', 'run_times', 'wrong_times', 'is_flaky','line_content'])
        for name in flaky_sta:
            flaky_num = 0
            sha = flaky_sta[name]['sha']
            for test in flaky_sta[name]['test_sta']:
                wrong_times = flaky_sta[name]['test_sta'][test]['wrong_times']
                line = flaky_sta[name]['test_sta'][test]['line']
                is_flaky = "flaky" if wrong_times != RERUN_TIMES else "not flaky"
                if is_flaky == 'flaky':
                    flaky_num +=1
                writer.writerow([name,sha,test,line,RERUN_TIMES,wrong_times,is_flaky,line_content[name+'_'+test.split('.')[-1]]])
            flaky_sta[name]['flaky_num'] = flaky_num

    for project in flaky_projects:
        print(project,"original flaky test number: ", len(flaky_tests_per_project[project]) )
        if project in flaky_sta:
            print(" now the flaky test number ",len(flaky_sta[project]['test_sta']),"real flaky test number ",flaky_sta[project]['flaky_num'])
        else:
            print("no test was tested in project:",project)

def make_flaky_table():
    with open(SUMMARY_LOG + 'flaky_per_project.csv', 'w+', newline='') as wf:
        writer = csv.writer(wf)
        writer.writerow(['project','commit','test_num','flaky_num'])
        for project in flaky_tests_per_project:
            fp = flaky_tests_per_project[project]
            writer.writerow([project.replace('-','/',1),str(project_to_sha[project])[0:7],normal_test_num_per_project[project],len(fp)])



if __name__ == '__main__':
    os.environ['JAVA_HOME'] = JAVA_HOME
    os.environ['MAVEN_HOME'] = MVN_LOC
    projects_info = read_dataset()
    # os.environ['PATH'] += os.pathsep+'/Library/Java/JavaVirtualMachines/zulu-8.jdk/Contents/Home/bin'+os.pathsep+'/Users/yhcrown/Documents/tools/apache-maven-3.9.5/bin'
    # print(os.environ['PATH'])

    os.system('mvn -v')
    subprocess.run(MVN_LOC+ " -v", executable='/bin/zsh', shell=True,
                   stderr=subprocess.STDOUT, timeout=90)
    if not os.path.exists(PROJECTS_DIRECTORY):
        os.mkdir(PROJECTS_DIRECTORY)
    for index, project in projects_info.iterrows():
        project_name = project['Project_Name']
        target_dir = PROJECTS_DIRECTORY + project_name
        if not os.path.exists(target_dir):
            download_project(project, target_dir)
        if not os.path.exists(target_dir + '/build.log'):
            build_project(target_dir)
        else:
            shutil.copy(target_dir + '/build.log',
                        RANDOOP_GENERATED_DIRECTORY + project['Project_Name'] + '/' + project[
                            'Project_Hash'] + '/alltests/build.log')
        # print(os.listdir(target_dir))
        # if "edwardcapriolo-teknek-core" == project_name or "mbknor-dropwizard-activemq-bundle" == project_name:
        #     continue

        # run_randoop(project,target_dir)
        # search_error_cause()
        # break
        os.chdir(PROJECTS_DIRECTORY + project_name)
        # print(os.getcwd())
    find_flaky()
    copy_and_run()
    collect_flaky()
    statistic_flaky()
    make_flaky_table()
    # search_build_error()
    # search_error_cause()
    # print(generate_fails.intersection(build_fails))
    print("total",total_test_num)
    print("flaky",total_flaky_num)
    print(len(generate_fails), generate_fails)
    print(len(generate_fails - build_fails), "build but not generate:", generate_fails - build_fails)
    print(len(build_fails - generate_fails), "generate but build fails", build_fails - generate_fails)
    # print(generate_fails.discard(generate_fails.intersection(build_fails)))
    print(len(build_fails), build_fails)
    print(len(build_fails.intersection(generate_fails)))
    print("error case #:", error_case_num)
    print(len(evosuite_flaky_projects), evosuite_flaky_projects)
    print(len(flaky_projects), flaky_projects)
    for project in evosuite_flaky_projects:
        print(project)


    print("sum", len(flaky_projects | evosuite_flaky_projects))
    print("only evosuite:", len(evosuite_flaky_projects - flaky_projects), evosuite_flaky_projects - flaky_projects)
    print("only randoop:", len(flaky_projects - evosuite_flaky_projects), flaky_projects - evosuite_flaky_projects)
    print(len(flaky_projects.intersection(evosuite_flaky_projects)),
          flaky_projects.intersection(evosuite_flaky_projects))