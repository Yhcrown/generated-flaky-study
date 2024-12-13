import pandas as pd
import os
import subprocess
import datetime

PROJECTS_DIRECTORY = "C:\\Users\\yhcro\\Documents\\FFprojects\\"
flakeflagger_project_to_sha = {}
MVN_LOC = 'C:\\Users\\yhcro\\Downloads\\apache-maven-3.8.8-bin\\apache-maven-3.8.8\\bin\\mvn'
JAVA_HOME = "C:\\Users\\yhcro\\IdeaProjects\\FlakyTracker\\OpenJDK8U-jdk_x64_windows_hotspot_8u402b06\\jdk8u402-b06\\jre\\"

CHAOS_API_DIR = r"C:\Users\yhcro\Documents\Code\ChaosAPI\target\ChaosAPI-1.0-SNAPSHOT.jar"

WORKSPACE= os.getcwd()
SUMMARY_LOG = WORKSPACE + '/logs/'
FLAKEFLAGGER_TRACKER_GENERATED_DIRECTORY = SUMMARY_LOG + "/flakeflagger/"
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
    run_command(clean_cmd, target_dir)
    cmd = MVN_LOC + ' install -DskipTests -Ddependency-check.skip=true -Denforcer.skip=true -Drat.skip=true -Dmdep.analyze.skip=true -Dmaven.javadoc.skip=true -Dgpg.skip=true -Dlicense.skip=true -am  '
    print(target_dir, cmd)
    returncode, stdout, stderr = run_command(cmd, target_dir)
    build_log = target_dir + '/build.log'


    if returncode != 0:
        print("Build failed. See build.log for details.")
        ff_build_fail_projects.add(target_dir)

    with open(build_log, 'w', encoding='utf-8') as f:
        f.write(stdout)
        f.write(stderr)


def run_command(command, cwd):
    """Run a shell command and return (returncode, stdout, stderr)."""
    try:
        result = subprocess.run(command, cwd=cwd, shell=True,
                                stdout=subprocess.PIPE, stderr=subprocess.PIPE,
                                text=True, check=False)
        return result.returncode, result.stdout, result.stderr
    except Exception as e:
        return -1, '', str(e)

def run_chaosapi(target_dir, log_dir):
    cmd = MVN_LOC + f" test -Dsurefire.argLine=\"-javaagent:{CHAOS_API_DIR}\""
    returncode, stdout, stderr = run_command(cmd, target_dir)
    print(target_dir)
    print(cmd)

    if returncode != 0:
        print("TEST failed. See test.log for details.")


    with open(log_dir, 'w', encoding='utf-8') as f:
        f.write(stdout)
        f.write(stderr)


projects = {}
def main():
    flakeflagger_projects = read_flakeflagger()
    flakeflagger_tests = flakeflagger_flaky_tests()
    for index, project in flakeflagger_projects.iterrows():
        project_name = project['Project_Name']
        target_dir = PROJECTS_DIRECTORY + project_name
        build_project(target_dir)
        generated_dir = FLAKEFLAGGER_TRACKER_GENERATED_DIRECTORY+"/CHAOSAPI/"+project_name
        if not os.path.exists(generated_dir):
            os.makedirs(generated_dir)
        generated_log_path = generated_dir + '/chaos.log'
        if target_dir not in ff_build_fail_projects:
            print(ff_build_fail_projects)
            run_chaosapi(target_dir,generated_log_path)

if __name__ == '__main__':
    os.environ['JAVA_HOME'] = JAVA_HOME
    os.environ['MAVEN_HOME'] = MVN_LOC
    main()