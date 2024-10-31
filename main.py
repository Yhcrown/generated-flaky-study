import pandas as pd
import os
import shutil
import subprocess
import datetime
import time
import logging
import re
import csv
import xml.etree.ElementTree as ET
from collections import defaultdict


logging.basicConfig(format='%(asctime)s - %(message)s', level=logging.DEBUG)

# PROJECTS_DIRECTORY = "/Users/yhcrown/Documents/flaky_java_projects/"
PROJECTS_DIRECTORY = "/workspace/benchmarks/projects/"
CURRENT_DIRECTORY = os.getcwd()
# RANDOOP_GENERATED_DIRECTORY = "/Users/yhcrown/Documents/GitHub/generated-flaky-study/randoop_tests/"
RANDOOP_GENERATED_DIRECTORY = "/workspace/benchmarks/randoop_tests/"



WORKSPACE='/workspace/generated-flaky-study/'
# WORKSPACE= os.getcwd()
# WORKSPACE="/shared-data/generated-flaky-study/"

# TOOLS_DIRECTORY = "/Users/yhcrown/Documents/tools/"
TOOLS_DIRECTORY = "/shared-data/common-jar/"

RANDOOP_JAR = TOOLS_DIRECTORY + 'randoop-all-4.3.3.jar'
GUAVA_JAR = TOOLS_DIRECTORY + 'guava-33.0.0-jre.jar'
HAMCREST_JAR = TOOLS_DIRECTORY + 'hamcrest-core-2.2.jar'
JUNIT_JAR = TOOLS_DIRECTORY + 'junit-4.13.2.jar'
SUMMARY_LOG = WORKSPACE + '/logs/'
# SUMMARY_LOG = '/shared-data/generated-flaky/logs/'

# MVN_LOC = "/Users/yhcrown/Documents/tools/apache-maven-3.8.8/bin/mvn"
MVN_LOC = "/workspace/apache-maven-3.8.8/bin/mvn"

# JAVA_HOME = "/Library/Java/JavaVirtualMachines/zulu-8.jdk/Contents/Home"
JAVA_HOME = "/shared-data/jdk8u422-b05/"

# INSTRUMENTED_JAVA_HOME = "/Users/yhcrown/Library/Java/JavaVirtualMachines/java8-inst/"
INSTRUMENTED_JAVA_HOME = "/shared-data/jdk-inst/"

FLAKYTRACKER_JAR = "/shared-data/phosphor-flakyTracker/Phosphor/target/Phosphor-0.0.5-SNAPSHOT.jar"
# CONTROL_TRACK_JAVA_HOME = "/Users/yhcrown/Library/Java/JavaVirtualMachines/java8-inst-controltrack"
CONTROL_TRACK_JAVA_HOME = "/shared-data/jdk-inst-controltrack/"

IDOFT_TRACKER_GENERATED_DIRECTORY = SUMMARY_LOG + "/idoft_normal/"

FLAKEFLAGGER_TRACKER_GENERATED_DIRECTORY = SUMMARY_LOG + "/flakeflagger/"
generated_dataset_labeled_flaky_test = set()

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

randoop_flaky_test = set()
tracker_flaky_test = set()
tracker_randoop_flaky_test = set()
tracker_flaky_tests_except_randoop =  set()


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
    # print(developer_NOD_info)
    test_info = df.loc[df['flaky'] == 'NOD'].loc[
        df['language'] == 'Java'].loc[df['test_type'] == 'developer-written']
    test_info =  test_info[test_info['Project_Name'].isin(developer_NOD_projects)]
    # print(len(test_info))
    # print(df['test_type'].unique())  ## ['evosuite_Default' 'evosuite_NoFlakinessSuppression' 'developer-written' 'generated']
    # print(df['flaky'].unique())  ## not flaky, NOD,  OD
    # print(developer_NOD_projects, len(developer_NOD_projects))  ## 105, same as paper
    evo = df['Project_Name'].loc[df['flaky'] == 'NOD'].loc[df['language'] == 'Java'].loc[
        df['test_type'] == 'evosuite_Default'].unique()
    for p in evo:
        if p in developer_NOD_projects:
            evosuite_flaky_projects.add(p)
    # print("evosuite:", len(df['Project_Name'].loc[df['flaky'] == 'NOD'].loc[df['language'] == 'Java'].loc[
    #                            df['test_type'] == 'evosuite_NoFlakinessSuppression'].unique()))
    
    filtered_df = df[(df['language'] == 'Java') & (df['test_type'] == 'developer-written') & (df['flaky'] == 'NOD')]
    print(filtered_df)

    return developer_NOD_info, filtered_df


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


def build_project(target_dir):
    cwd = os.getcwd()
    os.chdir(target_dir)
    build_log = target_dir + '/build.log'
    start_time = time.time()
    print('Building client ... ' + str(datetime.datetime.now()))
    os.environ['JAVA_HOME'] = JAVA_HOME
    subprocess.run(
        MVN_LOC + ' install -DskipTests -Ddependency-check.skip=true -Denforcer.skip=true -Drat.skip=true -Dmdep.analyze.skip=true -Dmaven.javadoc.skip=true -Dgpg.skip=true -Dlicense.skip=true -am  ',
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
    os.environ['PATH'] = f"{JAVA_HOME}/bin:{os.environ['PATH']}"
    randoop_cmd = JAVA_HOME+'/bin/java -ea -classpath ' + concat_class_path + \
                  ' randoop.main.Main gentests' \
                  + ' --classlist=' + class_list_file \
                  + ' --output-limit=' + str(test_method_num_limit) \
                  + ' --time-limit=60' \
                  + ' --junit-output-dir=' + generated_dir \
                  + ' --regression-test-basename=TestGroup' \
                  + str(test_method_max_size) + 'Case' \
                  + ' --jvm-max-memory=1024m ' \
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



def run_flaky_tracker_on_one_test(Test):
    target_dir = PROJECTS_DIRECTORY + '/' + Test['Project_Name']
    os.chdir(target_dir)
    if Test['Module'] and Test['Module'] != '.':
        if os.path.exists( target_dir + '/' + Test['Module']):
            target_dir = target_dir + '/' + Test['Module']
    commit = Test['Project_Hash']
    subprocess.run('git checkout ' + commit, shell=True, stdout=open(os.devnull, 'w'), stderr=subprocess.STDOUT)
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
            shutil.rmtree(dir+"/dependency/")
            break
    os.chdir(target_dir)

    ## Linux platform
    concat_class_path = '$(find ' + target_dir + ' -name \"classes\" -type d | paste -sd :)'
    concat_class_path += ':$(find ' + target_dir + ' -name \"test-classes\" -type d | paste -sd :)'
    concat_class_path += ':$(find /tmp/jars -name \"*.jar\" -type f | paste -sd :):'
    concat_class_path += ':$(find '+target_dir+' -name \"dependency\" -type d | paste -sd :):'
    # print(concat_class_path)
    ## Mac os platform

    # concat_class_path = '$(find ' + target_dir + ' -name "classes" -type d | xargs echo | tr \' \' \':\')'
    # concat_class_path += ':$(find ' + target_dir + ' -name "test-classes" -type d | xargs echo | tr \' \' \':\')'
    # concat_class_path += ':$(find /tmp/jars -name "*.jar" -type f | xargs echo | tr \' \' \':\'):'



    generated_dir = FLAKEFLAGGER_TRACKER_GENERATED_DIRECTORY+'/' + Test['Project_Name'] + '/' + Test['Project_Hash'][0:6] + '/'



    if not os.path.exists(generated_dir):
        os.makedirs(generated_dir)
    class_list_file = '/tmp/classes.txt'
    all_classes = []

    for dir_path, subpaths, files in os.walk(target_dir):
        for f in files:

            if f.endswith('.class') and ('/classes/' in dir_path or '/test-classes/' in dir_path):
                clz = (dir_path + '/' + f.split('.')[0]).split('/classes/')[-1].replace('/', '.')
                if clz not in all_classes:
                    all_classes.append(clz)

    with open(class_list_file, 'w') as fw:
        for clz in all_classes:
            if '$' in clz:
                clz = clz.split('$')[0]
            fw.write(clz + '\n')

    concat_class_path += RANDOOP_JAR + ':'
    concat_class_path += JUNIT_JAR + ':'
    concat_class_path += HAMCREST_JAR + ':'
    concat_class_path += GUAVA_JAR

    # os.environ['JAVA_HOME'] = JAVA_HOME

    build_log = target_dir + '/buildFlaky.log'
    # start_time = time.time()
    os.environ['JAVA_HOME'] = JAVA_HOME
    # os.environ['MAVEN_OPT'] = "-Xbootclasspath/a:" + FLAKYTRACKER_JAR + " -javaagent:"+FLAKYTRACKER_JAR
    os.chdir(target_dir)
    # subprocess.run(MVN_LOC+ ' -version', executable='/bin/zsh', shell=True, stdout=subprocess.STDOUT, stderr=subprocess.STDOUT)
    # subprocess.run(JAVA_HOME+'/bin/javac -cp '+concat_class_path+' '+target_dir+'/src/test/java/flaky/FlakyTest.java', executable='/bin/zsh', shell=True,
    #                stderr=subprocess.STDOUT, timeout=90, stdout=open(build_log, 'w'))
    # print(JAVA_HOME+'/bin/javac -cp '+concat_class_path+' '+target_dir+'/src/test/java/flaky/FlakyTest.java')
    subprocess.run(
        MVN_LOC + ' install -DskipTests -Ddependency-check.skip=true -Denforcer.skip=true -Drat.skip=true -Dmdep.analyze.skip=true -Dmaven.javadoc.skip=true -Dgpg.skip=true -Dlicense.skip=true ',
        shell=True, stdout=open(build_log, 'w'), stderr=subprocess.STDOUT)
    # if os.path.exists(generated_dir+'/flakyTracker/'):
    #     shutil.rmtree(generated_dir+'/flakyTracker/')
    #find all test-classes

    target_testclass = ".".join(Test['testname'].split('.')[:-1])
    class_name = Test['testname'].split('.')[-2]
    # print(target_testclass)
    for dir, subpath, files in os.walk(target_dir+'/target/test-classes'):
        for file in files:
            if class_name in file:   #change here to '.class' to make it run all classes
                flaky_tracker_cmd = CONTROL_TRACK_JAVA_HOME + "/bin/java -javaagent:" + FLAKYTRACKER_JAR + " -Xbootclasspath/a:" + FLAKYTRACKER_JAR + "  -cp " + concat_class_path + " org.junit.runner.JUnitCore "+ target_testclass
                # flaky_tracker_cmd = JAVA_HOME + "/bin/java " +" -cp " + concat_class_path + " org.junit.runner.JUnitCore "+ target_testclass
                flaky_tracker_log = generated_dir + '/flakyTracker/' + target_testclass.replace('.','/')+'.trackerlog'
                flaky_tracker_dir = '/'.join(flaky_tracker_log.split('/')[0:len(flaky_tracker_log.split('/'))-1])
                # os.path.dirname(flaky_tracker_log)
                # print(flaky_tracker_log)
                # print(flaky_tracker_cmd)
                if not os.path.exists(flaky_tracker_dir):
                    os.makedirs(flaky_tracker_dir)
                try:
                    subprocess.run(flaky_tracker_cmd, shell=True, stdout=open(flaky_tracker_log, 'w'),
                                   stderr=subprocess.STDOUT, timeout=600)
                except subprocess.TimeoutExpired as e:
                    with open(flaky_tracker_log, "a+") as f:
                        f.write(str(e))
                    print(Test['Project_Name'], e)


def run_flaky_tracker(project, target_dir, module = None):
    cwd = os.getcwd()
    os.chdir(target_dir)

    commit = project['Project_Hash']
    subprocess.run('git checkout ' + commit, shell=True, stdout=open(os.devnull, 'w'), stderr=subprocess.STDOUT)

    if module:
        os.chdir(target_dir + '/' + module)
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
            shutil.rmtree(dir+"/dependency/")
                  
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

    concat_class_path += RANDOOP_JAR + ':'
    concat_class_path += JUNIT_JAR + ':'
    concat_class_path += HAMCREST_JAR + ':'
    concat_class_path += GUAVA_JAR

    # os.environ['JAVA_HOME'] = JAVA_HOME
    test_dir = target_dir + '/src/test/java/flaky'

    for dir, subpath, files in os.walk(RANDOOP_GENERATED_DIRECTORY+project['Project_Name']):
        for file in files:
            if file == 'TestGroup100Case0.java':
                # os.remove(dir+'/'+'flaky_tests.java')
                with open(dir + '/' + file, 'r+') as f:
                    original_lines = f.readlines()
                    new_lines = []
                    new_lines.append("package flaky; \n")
                    for line in original_lines:
                        if "import org.junit.FixMethodOrder;" in line  or "import org.junit.runners.MethodSorters;" in line or "@FixMethodOrder(MethodSorters.NAME_ASCENDING)" in line:
                            continue
                        if line.startswith("public class"):
                            new_lines.append("public class RandoopTest{")
                        else:
                            # maybe more process
                            new_lines.append(line)
                    new_class = "\n".join(new_lines)
                with open(dir + '/RandoopTest.java', 'w+') as f:
                    f.write(new_class)
                if not os.path.exists(test_dir):
                    os.mkdir(test_dir)
                shutil.copy(dir+ '/RandoopTest.java', target_dir+'/src/test/java/flaky/RandoopTest.java')
            if file == 'FlakyTest.java':
                if not os.path.exists(test_dir):
                    os.mkdir(test_dir)
                shutil.copy(dir+ '/FlakyTest.java', target_dir+'/src/test/java/flaky/FlakyTest.java')

    build_log = target_dir + '/buildFlaky.log'
    # start_time = time.time()
    os.environ['JAVA_HOME'] = JAVA_HOME
    # os.environ['MAVEN_OPT'] = "-Xbootclasspath/a:" + FLAKYTRACKER_JAR + " -javaagent:"+FLAKYTRACKER_JAR
    os.chdir(target_dir)
    # subprocess.run(MVN_LOC+ ' -version', executable='/bin/zsh', shell=True, stdout=subprocess.STDOUT, stderr=subprocess.STDOUT)
    # subprocess.run(JAVA_HOME+'/bin/javac -cp '+concat_class_path+' '+target_dir+'/src/test/java/flaky/FlakyTest.java', executable='/bin/zsh', shell=True,
    #                stderr=subprocess.STDOUT, timeout=90, stdout=open(build_log, 'w'))
    # print(JAVA_HOME+'/bin/javac -cp '+concat_class_path+' '+target_dir+'/src/test/java/flaky/FlakyTest.java')
    subprocess.run(
        MVN_LOC + ' install -DskipTests -Ddependency-check.skip=true -Denforcer.skip=true -Drat.skip=true -Dmdep.analyze.skip=true -Dmaven.javadoc.skip=true -Dgpg.skip=true -Dlicense.skip=true ',
        shell=True, stdout=open(build_log, 'w'), stderr=subprocess.STDOUT)
    if os.path.exists(generated_dir+'/flakyTracker/'):
        shutil.rmtree(generated_dir+'/flakyTracker/')
    #find all test-classes
    for dir, subpath, files in os.walk(target_dir+'/target/test-classes'):
        for file in files:
            if file.endswith(".class"):   #change here to '.class' to make it run all classes
                class_name = os.path.join(dir, file)
                class_name = class_name.replace(target_dir+'/target/test-classes/','').replace('/', '.').replace('\\', '.').replace('.class', '')
                # print(class_name)
                flaky_tracker_cmd = CONTROL_TRACK_JAVA_HOME + "/bin/java -javaagent:" + FLAKYTRACKER_JAR + " -Xbootclasspath/a:" + FLAKYTRACKER_JAR + "  -cp " + concat_class_path + " org.junit.runner.JUnitCore "+class_name

                # flaky_tracker_dir =

                flaky_tracker_log = generated_dir + '/flakyTracker/' + class_name.replace('.','/')+'.trackerlog'
                flaky_tracker_dir = '/'.join(flaky_tracker_log.split('/')[0:len(flaky_tracker_log.split('/'))-1])
                # os.path.dirname(flaky_tracker_log)
                print(flaky_tracker_log)
                if not os.path.exists(flaky_tracker_dir):
                    os.makedirs(flaky_tracker_dir)
                try:
                    subprocess.run(flaky_tracker_cmd, shell=True, stdout=open(flaky_tracker_log, 'w'),
                                   stderr=subprocess.STDOUT, timeout=600)
                except subprocess.TimeoutExpired as e:
                    with open(flaky_tracker_log, "a+") as f:
                        f.write(str(e))
                    print(project['Project_Name'], e)
                # print(flaky_tracker_cmd)

                # break

tracker_data = []
random_num = 0
time_num = 0

tracker_data_set = set()

# 创建新元素的哈希标识


def parseTrackerLog(log_path, output_dir = "tracker_analysis.csv"):
    for dir, subpath, files in os.walk(log_path):
        for file in files:
            if file.endswith(".trackerlog"):
                # index = dir.find(RANDOOP_GENERATED_DIRECTORY)
                subdir = dir[len(log_path):]
                info = subdir.split('/')
                project_name = info[0]
                hash = info[1]
                class_name = os.path.join(dir, file)
                class_name = class_name.split("/flakyTracker/")[1].replace('/', '.').replace('\\', '.').replace('.trackerlog', '')
                # class_name = class_name.replace(target_dir+'/target/test-classes/','')
   
         
                # if os.path.exists(dir+file):
                #     shutil
                with open(dir+'/'+file,"r+") as f:
                    lines = f.readlines()
                    pattern = re.compile(
                        r'FlakyTracker Log: (\S+)\s+may be flaky:\s+FlakyTaintLabel{type=(\S+),\s+cause=(\S+),\s+file=(\S+),\s+line=(-?\d+),\s+label=(\d+)}')
                    matches = pattern.findall('\n'.join(lines))
                    randoop_test_pattern = r'^test\d+(_\d+)$'
                    for match in matches:
                        test_name, flaky_type, cause, file, line, label = match
                        test_name = re.sub(r'^[\.E]+', '', test_name)  ## old version
                        if 'flaky.FlakyTest' in class_name or 'flaky.RandoopTest' in class_name: ## is randoop test
                            tracker_randoop_flaky_test.add(project_name+'#'+test_name)
                        else:
                            tracker_flaky_tests_except_randoop.add(project_name+'#'+class_name+'.'+test_name)
                            
                            
                        global random_num
                        global time_num
                        if project_name+'#'+test_name not in tracker_flaky_test:
                            if 'RANDOM' in flaky_type:
                                random_num = random_num + 1
                            if 'TIME' in flaky_type:
                                time_num = time_num + 1
                            tracker_flaky_test.add(project_name+'#'+test_name)

                        new_entry_hash = (project_name, hash, test_name, flaky_type, cause, file, int(line), int(label))

                        if  ('flaky.FlakyTest' in class_name or 'flaky.RandoopTest' in class_name): ## is randoop test
                            continue
                        if new_entry_hash not in tracker_data_set:
                            tracker_data.append({
                                'Project Name': project_name,
                                'sha': hash,
                                'Test Name': test_name,
                                'Type': flaky_type,
                                'Cause': cause,
                                'File': file,
                                'Line': int(line),
                                'Label': int(label)
                            })
                            # 同时将哈希标识添加到集合中 
                            tracker_data_set.add(new_entry_hash)

    df = pd.DataFrame(tracker_data)
    print(df)
    df.to_csv(SUMMARY_LOG+ output_dir)
    # with open(SUMMARY_LOG + 'tracker_analysis.csv', 'w+', newline='') as wf:
    #     writer = csv.writer(wf)
    #     writer.writerow(['project','commit','Test','type','cause','file','line','label'])
    #     for entry in df:
    #         fp = df[entry]
    #         writer.writerow([project.replace('-','/',1),str(project_to_sha[project])[0:7],normal_test_num_per_project[project],len(fp)])


# def make_tracker_table():




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
    pattern = r'@Test.*?// flaky\s*"\d+\)\s+\w+\(\w+\)"\s*:.*?(?=@Test|\Z)'

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
                        if 'DiUS' in project:
                            print()
                        last_test = java_code.strip().split('@Test')[-1]
                        for line in last_test.split('\n'):
                            if re.search(r'// flaky\s*"\d+\)\s+\w+\(\w+\)"\s*:', line):
                                flaky_tests_per_project[project][-1] = flaky_tests_per_project[project][-1][:-2]
                                break   ##remove the duplicate }
                                # if project not in flaky_tests_per_project:
                                #     flaky_tests_per_project[project] = list()
                                # flaky_tests_per_project[project].append(last_test)





def uncomment_tests():
    for flaky_project in flaky_projects:
        tests = flaky_tests_per_project[flaky_project]
        modified_flaky_tests_per_project[flaky_project] = list()

        for test_code in tests:
            versions = []
            lines = test_code.split('\n')
            flaky_lines = [i for i, line in enumerate(lines) if re.search(r'// flaky\s*"\d+\)\s+\w+\(\w+\)"\s*:', line)]
            for i, line_num in enumerate(flaky_lines):
                version = lines.copy()
                version[line_num] = re.sub(r'// flaky\s*"\d+\)\s+\w+\(\w+\)"\s*:\s*', '', version[line_num])
                new_code = '\n'.join(version)
                test_name = re.search(r'public void\s+(\w+)\s*\(', test_code).group(1)
                modified_test_name = f"{test_name}_{i + 1}"

                randoop_flaky_test.add(flaky_project+'#'+modified_test_name)

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
                            if "import org.junit.FixMethodOrder;" in line  or "import org.junit.runners.MethodSorters;" in line or "@FixMethodOrder(MethodSorters.NAME_ASCENDING)" in line:
                                continue
                            if line.startswith("import") or "public static boolean debug = false;" in line:
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

        # cmd = MVN_LOC+ ' -Dtest=FlakyTest test '
        # cmd2 = MVN_LOC+ ' -Dtest=FlakyTest surefire:test'
        # print(os.getcwd(), cmd)
        # if not os.path.exists(log_dir + '/all'):
        #     os.mkdir(log_dir + '/all')
        # subprocess.run(cmd, shell=True, stdout=open(log_dir + '/all/' + '0.log', 'w+'),
        #                stderr=subprocess.STDOUT, timeout=90)
        # for i in range(1, RERUN_TIMES):
        #     subprocess.run(cmd2, shell=True, stdout=open(log_dir + '/all/' + str(i) + '.log', 'w+'),
        #                    stderr=subprocess.STDOUT, timeout=90)


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


verified_flaky_tests = defaultdict(lambda: defaultdict(int))
verified_tests_set = set()
# Function to run Maven test command
def run_maven_test(project_dir, test_class, report_dir):
    os.chdir(project_dir)
    
    command = f"{MVN_LOC} -Dtest={test_class} -Dsurefire.reportNameSuffix={report_dir} test"
    command = f"{MVN_LOC} -Dsurefire.reportNameSuffix={report_dir} test"
    result = subprocess.run(command, shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    return result.returncode




fail_runs = []

# Function to parse Surefire reports and check for flaky tests
def check_flaky_tests(project, test_class, report_dir, runs = 10):

    for root, _, files in os.walk(report_dir):
        for file in files:
            if file.endswith(".xml") and test_class in file:
                file_path = os.path.join(root, file)
                tree = ET.parse(file_path)
                xml_root = tree.getroot()

                for testcase in xml_root.findall('testcase'):
                    name = testcase.get('name')
                    name = project + '#' + test_class + '#' + name
                    if testcase.find('failure') is not None or testcase.find('error') is not None:
                        randoop_test_pattern = r'^test\d+(_\d+)$'
                        if 'RandoopTest' in test_class or 'FlakyTest' in test_class:
                            verified_flaky_tests[project][name] = 0 
                            # print(testcase.get('name'))
                        else:
                            verified_flaky_tests[project][name] += 1
                            fail_runs.append(file)
    print(fail_runs)
    return {test: count for test, count in verified_flaky_tests[project].items() if count > 1 and count < runs}

# Main function to run the test class multiple times and check for flakiness
def main_check(test_class, project, runs=10 ):

    project_dir = PROJECTS_DIRECTORY + project
    base_report_dir= project_dir + "/target/surefire-reports/"

    for i in range(runs):
        run_dir = f"run_{i+1}"
        # report_dir = os.path.join(base_report_dir, run_dir)
        # os.makedirs(report_dir, exist_ok=True)

        print(f"Running test {i+1}/{runs} of project {project} ...")
        # result_code = run_maven_test(project_dir, test_class, run_dir)

        if result_code != 0:
            print(f"Test run {i+1} failed with return code {result_code}")
            fail_runs.add(run_dir)
    verified_flaky_tests = check_flaky_tests(project, test_class, base_report_dir)

    if verified_flaky_tests:
        print("Flaky tests found:")

        for test, count in verified_flaky_tests.items():
            verified_tests_set.add(test)
            print(f"Test {test} failed {count} times")
    else:
        print("No flaky tests found.")



def check_randoop_flaky():
    test_class = "flaky.FlakyTest"
    for flaky_project in flaky_projects:
        main_check(test_class, project = flaky_project)


def check_all_flaky(project_name):
    target_dir =  PROJECTS_DIRECTORY + project_name
    for dir, subpath, files in os.walk(target_dir+'/target/test-classes'):
        for file in files:
            if file.endswith(".class"):   #change here to '.class' to make it run all classes
                class_name = os.path.join(dir, file)
                class_name = class_name.replace(target_dir+'/target/test-classes/','').replace('/', '.').replace('\\', '.').replace('.class', '')
                print("start rerun {project}, {class_name}")
                main_check(class_name, project = project_name)

def check_all_flaky_by_single_run(project_name):
    main_check("haha", project = project_name)
    
    
def find_verified_flaky(project_name):
    # global fail_runs
    fail_runs.clear()
    fail_log_dir = SUMMARY_LOG+'/verified_fail_log/'


    target_dir =  PROJECTS_DIRECTORY + project_name
    for dir, subpath, files in os.walk(target_dir+'/target/test-classes'):
        for file in files:
            if file.endswith(".class"):   #change here to '.class' to make it run all classes
                class_name = os.path.join(dir, file)
                class_name = class_name.replace(target_dir+'/target/test-classes/','').replace('/', '.').replace('\\', '.').replace('.class', '')
                base_report_dir= target_dir + "/target/surefire-reports/"
                verified_flaky_tests = check_flaky_tests(project_name, class_name, base_report_dir)
                if verified_flaky_tests:
                    if not os.path.exists(fail_log_dir+'/'+project_name):
                        os.mkdir(fail_log_dir +'/'+project_name)
                    print(fail_runs)
                    for run in fail_runs:
                        print(base_report_dir+"/" + run.replace('.xml','.txt'))
                        shutil.copy(base_report_dir+"/" + run.replace('.xml','.txt').replace('TEST-','') , fail_log_dir +project_name+'/')
                    for test, count in verified_flaky_tests.items():
                        verified_tests_set.add(test)

    
analyzed_projects = set()


def read_idoft():
    path = './pr-data.csv'
    df = pd.read_csv(path)
    need_process_projects = df[['Project URL', 'SHA Detected']].loc[
        (df['Category'] == 'UD') |
        (df['Category'] == 'NOD') |
        # (df['Category'] == 'NIO') |
        (df['Category'] == 'OSD')
        ].drop_duplicates()
    need_process_projects = need_process_projects.rename(columns={'SHA Detected': 'Project_Hash','Project URL':'Project_URL'})
    need_process_projects['Project_Name'] = need_process_projects['Project_URL'].apply(lambda x : x.split('/')[-1])
    # print(need_process_projects)
    return need_process_projects, get_tests_to_focus(df)

def get_tests_to_focus(df):
    need_process_projects = df[['Project URL', 'SHA Detected','Module Path', 'Fully-Qualified Test Name (packageName.ClassName.methodName)', 'Category']].loc[
        (df['Category'] == 'UD') |
        (df['Category'] == 'NOD') |
        # (df['Category'] == 'NIO') |
        (df['Category'] == 'OSD')]
    need_process_projects = need_process_projects.rename(columns = {'SHA Detected': 'Project_Hash','Project URL':'Project_URL','Module Path':'Module', 'Fully-Qualified Test Name (packageName.ClassName.methodName)':'testname'})
    need_process_projects['Project_Name'] = need_process_projects['Project_URL'].apply(lambda x: x.split('/')[-1])
    need_process_projects = need_process_projects.drop(columns = ['Project_URL'])
    print(need_process_projects)
    return need_process_projects


idoft_tested_class = set()
idoft_flaky_tests = set()
idoft_ud_tests = set()

def test_idoft():
    idoft_projects, idoft_tests = read_idoft()

    for index, project in idoft_projects.iterrows():
        project_name = project['Project_Name']
        if project_name == 'aletheia':
            continue
        target_dir = PROJECTS_DIRECTORY + project_name
        if not os.path.exists(target_dir):
            download_project(project, target_dir)
        # if not os.path.exists(target_dir + '/build.log'):
            build_project(target_dir)
    for index, Test in idoft_tests.iterrows():
        if Test['Project_Name'] == 'aletheia':
            continue
        idoft_flaky_tests.add(Test["Project_Name"]+'#'+Test["testname"])
        if Test['Category'] == 'UD':
            idoft_ud_tests.add(Test["Project_Name"]+'#'+Test["testname"])
        target_testclass = ".".join(Test['testname'].split('.')[:-1])
        # print(Test['testname'])
        generated_dir = IDOFT_TRACKER_GENERATED_DIRECTORY+'/' + Test['Project_Name'] + '/' + Test['Project_Hash'][0:6] + '/'
        flaky_tracker_log = generated_dir + '/flakyTracker/' + target_testclass.replace('.','/')+'.trackerlog'
        if os.path.exists(flaky_tracker_log):
            print(f"already analyzed {target_testclass}")
            continue
        # if Test['Project_Name'] + '#' + target_testclass not in idoft_tested_class: 
        #     print(Test['testname'].split('.')[-2])
        run_flaky_tracker_on_one_test(Test)
        #     idoft_tested_class.add(Test['Project_Name'] + '#' + target_testclass)
    # parseTrackerLog(IDOFT_TRACKER_GENERATED_DIRECTORY, "idoft_tracker_no_control_summary.csv")
    # print("ground truth", len(idoft_flaky_tests),idoft_flaky_tests)
    print('true positive:',len(idoft_flaky_tests.intersection(tracker_flaky_tests_except_randoop)),'\n--------------------\n', sorted(idoft_flaky_tests.intersection(tracker_flaky_tests_except_randoop)))
    print('false positive:?', len(tracker_flaky_tests_except_randoop-idoft_flaky_tests),'\n--------------------\n',sorted(tracker_flaky_tests_except_randoop-idoft_flaky_tests))
    print('UD true positive:?', len(idoft_ud_tests.intersection(tracker_flaky_tests_except_randoop)),'\n--------------------\n', sorted(idoft_ud_tests.intersection(tracker_flaky_tests_except_randoop)))
    
flakeflagger_project_to_sha = {}
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

def test_flakeflagger():
    flakeflagger_projects  = read_idoft()
    flakeflagger_tests = flakeflagger_flaky_tests()
    for index, project in flakeflagger_projects.iterrows():
        project_name = project['Project_Name']
        # if project_name == 'aletheia':
        #     continue
        target_dir = PROJECTS_DIRECTORY + project_name
        if not os.path.exists(target_dir):
            download_project(project, target_dir)
            # if not os.path.exists(target_dir + '/build.log'):
            build_project(target_dir)

    for index, Test in flakeflagger_tests.iterrows():
        # if Test['Project_Name'] == 'aletheia':
        #     continue
        # idoft_flaky_tests.add(Test["Project_Name"]+'#'+Test["testname"])
        if Test['Category'] == 'UD':
            idoft_ud_tests.add(Test["Project_Name"]+'#'+Test["testname"])
        target_testclass = ".".join(Test['testname'].split('.')[:-1])
        # print(Test['testname'])
        generated_dir = FLAKEFLAGGER_TRACKER_GENERATED_DIRECTORY+'/' + Test['Project_Name'] + '/' + Test['Project_Hash'][0:6] + '/'
        flaky_tracker_log = generated_dir + '/flakyTracker/' + target_testclass.replace('.','/')+'.trackerlog'
        if os.path.exists(flaky_tracker_log):
            print(f"already analyzed {target_testclass}")
            continue
        # if Test['Project_Name'] + '#' + target_testclass not in idoft_tested_class:
        #     print(Test['testname'].split('.')[-2])
        run_flaky_tracker_on_one_test(Test)

if __name__ == '__main__':
    os.environ['JAVA_HOME'] = JAVA_HOME
    os.environ['MAVEN_HOME'] = MVN_LOC
    projects_info, filtered_df= read_dataset()




    # os.environ['PATH'] += JAVA_HOME+'/bin/'
    # # print(os.environ['PATH'])

    # # os.system('mvn -v')
    subprocess.run(MVN_LOC+ " -v", executable='/bin/zsh', shell=True,
                   stderr=subprocess.STDOUT, timeout=90)
    test_idoft()
    # test_project = 'yankeguo-xlog-java'
    # if not os.path.exists(PROJECTS_DIRECTORY):
    #     os.mkdir(PROJECTS_DIRECTORY)
    temp_test_project_list = {'kestreldigital-data-conjuror','DiUS-java-faker','lemire-externalsortinginjava'}
    temp_test_project_list = {'kestreldigital-data-conjuror'}
 
    # for index, project in projects_info.iterrows():
        # project_name = project['Project_Name']

        # target_dir = PROJECTS_DIRECTORY + project_name
    #     if not os.path.exists(target_dir):
    #         download_project(project, target_dir)
    #     if not os.path.exists(target_dir + '/build.log'):
        # build_project(target_dir)
    #     else:
    #         shutil.copy(target_dir + '/build.log',
    #                     RANDOOP_GENERATED_DIRECTORY + project['Project_Name'] + '/' + project[
    #                         'Project_Hash'] + '/alltests/build.log')

    #     # print(os.listdir(target_dir))
        # if "edwardcapriolo-teknek-core" == project_name or "mbknor-dropwizard-activemq-bundle" == project_name:
        #     continue
      
        # run_randoop(project,target_dir)


    #     # search_error_cause()
    #     # break
    #     # os.chdir(PROJECTS_DIRECTORY + project_name)
    #     # print(os.getcwd())
    # search_error_cause()
    find_flaky()
    # print('sadasdkasds')
    # print(flaky_projects)
    # uncomment_tests()
    # generate_new_testclass()
    # copy_and_run()
    # collect_flaky()
    # statistic_flaky()

    # make_flaky_table()
    # target_project = 'BriteSnow-jomni'
    # for project_name in temp_test_project_list:
    fail_log_dir = SUMMARY_LOG+'/verified_fail_log/'
    # if not os.path.exists(fail_log_dir):
    #     os.mkdir(fail_log_dir)
    
    
    # turcate = False
    # for index, project in projects_info.iterrows():
    #     project_name = project['Project_Name']
    #     # if os.path.exists(RANDOOP_GENERATED_DIRECTORY + project['Project_Name'] + '/' + project['Project_Hash']+'/alltests/FlakyTest.java'):
    #     if project_name != 'StefaniniInspiring-pugtsdb':
    #         print(project_name)
    #         if project_name == 'mitoma-ponto':
    #             turcate = True
    #             break
    #             #  if not os.path.exists(RANDOOP_GENERATED_DIRECTORY + project['Project_Name'] + '/' + project['Project_Hash']+'/alltests/flakyTracker'):
    #         # if project_name == test_project:
    # #     #     #         print(project_name)
    #         if not turcate:
    #             for dir, subpath, files in os.walk(RANDOOP_GENERATED_DIRECTORY + project['Project_Name'] + '/' + project['Project_Hash']+'/alltests/flakyTracker'):
                
    #                 for file in files:
    #                       #see if flakytracker can run something
    #                     if file.endswith('.trackerlog'):
    #                         analyzed_projects.add(project_name)
    #                         break
    #         #     run_flaky_tracker(project, PROJECTS_DIRECTORY + project_name)
    #             # check_all_flaky_by_single_run(project_name)
    #             if project_name in analyzed_projects:
    #                 find_verified_flaky(project_name)
    # parseTrackerLog(RANDOOP_GENERATED_DIRECTORY)
    # check_randoop_flaky()
    # print(verified_flaky_tests)
    # print(analyzed_projects)
    for idx, test in filtered_df.iterrows():
        if test['Project_Name'] in analyzed_projects:
            flaky_name = test['Project_Name'] + '#' + test['Test_class'] + '#' + test ['Test_name']
            generated_dataset_labeled_flaky_test.add(flaky_name)
    # print('randoop len' ,len(randoop_flaky_test))
    # print('tracker len' ,len(tracker_randoop_flaky_test))
    # print('verified len', len(verified_tests_set))
    # print('random num', random_num)
    # print('time num', time_num)
    # print('true positive:',len(randoop_flaky_test.intersection(tracker_randoop_flaky_test)),'\n--------------------\n', sorted(randoop_flaky_test.intersection(tracker_randoop_flaky_test)))
    # print('false positive:?', len(tracker_randoop_flaky_test-randoop_flaky_test),'\n--------------------\n',sorted(tracker_randoop_flaky_test-randoop_flaky_test))
    # print('false negative:',len(randoop_flaky_test-tracker_randoop_flaky_test),'\n--------------------\n',sorted(randoop_flaky_test-tracker_randoop_flaky_test))
    # print("ground truth", len(verified_tests_set),verified_tests_set)
    # print('true positive:',len(verified_tests_set.intersection(tracker_flaky_tests_except_randoop)),'\n--------------------\n', sorted(verified_tests_set.intersection(tracker_flaky_tests_except_randoop)))
    # print('false positive:?', len(tracker_flaky_tests_except_randoop-verified_tests_set),'\n--------------------\n',sorted(tracker_flaky_tests_except_randoop-verified_tests_set))
    # print('false negative:',len(verified_tests_set-tracker_flaky_tests_except_randoop),'\n--------------------\n',sorted(verified_tests_set-tracker_flaky_tests_except_randoop))

    # print("true positive labeled",len(generated_dataset_labeled_flaky_test.intersection(tracker_flaky_tests_except_randoop)),'\n--------------------\n', sorted(generated_dataset_labeled_flaky_test.intersection(tracker_flaky_tests_except_randoop)))
    # print("false positive labeled", len(tracker_flaky_tests_except_randoop - generated_dataset_labeled_flaky_test ),'\n--------------------\n', sorted(tracker_flaky_tests_except_randoop - generated_dataset_labeled_flaky_test ))
    # print("false nagative labeled",len(generated_dataset_labeled_flaky_test - tracker_flaky_tests_except_randoop),'\n--------------------\n', sorted(generated_dataset_labeled_flaky_test - tracker_flaky_tests_except_randoop))
    
    # print(flaky_projects)

    # search_build_error()
    # search_error_cause()
    # print(generate_fails.intersection(build_fails))
    # print("total",total_test_num)
    # print("flaky",total_flaky_num)
    # print(len(generate_fails), generate_fails)
    # print(len(generate_fails - build_fails), "build but not generate:", generate_fails - build_fails)
    # print(len(build_fails - generate_fails), "generate but build fails", build_fails - generate_fails)
    # # print(generate_fails.discard(generate_fails.intersection(build_fails)))
    # print(len(build_fails), build_fails)
    # print(len(build_fails.intersection(generate_fails)))
    # print("error case #:", error_case_num)
    # print(len(evosuite_flaky_projects), evosuite_flaky_projects)
    # print(len(flaky_projects), flaky_projects)
    # for project in evosuite_flaky_projects:
    #     print(project)
    #
    #
    # print("sum", len(flaky_projects | evosuite_flaky_projects))
    # print("only evosuite:", len(evosuite_flaky_projects - flaky_projects), evosuite_flaky_projects - flaky_projects)
    # print("only randoop:", len(flaky_projects - evosuite_flaky_projects), flaky_projects - evosuite_flaky_projects)
    # print(len(flaky_projects.intersection(evosuite_flaky_projects)),
    #       flaky_projects.intersection(evosuite_flaky_projects))