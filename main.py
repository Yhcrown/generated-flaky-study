import pandas as pd
import os
import shutil
import subprocess
import datetime
import time
import logging

logging.basicConfig(format='%(asctime)s - %(message)s', level=logging.DEBUG)

PROJECTS_DIRECTORY = "/Users/yhcrown/Documents/flaky_java_projects/"
CURRENT_DIRECTORY = os.getcwd()
RANDOOP_GENERATED_DIRECTORY = "/Users/yhcrown/Documents/randoop_tests/"
TOOLS_DIRECTORY = "/Users/yhcrown/Documents/tools/"
RANDOOP_JAR = TOOLS_DIRECTORY + 'randoop-all-4.3.2.jar'
GUAVA_JAR = TOOLS_DIRECTORY + 'guava-32.1.3-jre.jar'
HAMCREST_JAR = TOOLS_DIRECTORY + 'hamcrest-core-1.3.jar'
JUNIT_JAR = TOOLS_DIRECTORY + 'junit-4.13.2.jar'

def read_dataset():
    path = "./dataset.csv"
    df = pd.read_csv(path)
    developer_NOD_projects = df['Project_Name'].loc[df['flaky'] == 'NOD'].loc[df['language'] == 'Java'].loc[df['test_type'] == 'developer-written'].unique()
    cols_to_keep = ['Project_Name', 'Project_URL','Project_Hash']
    developer_NOD_info = pd.DataFrame (df[df['Project_Name'].isin(developer_NOD_projects)][cols_to_keep].drop_duplicates())
    developer_NOD_info.to_csv('./developer_NOD_projects_info.csv')
    print(developer_NOD_info)
    test_info = df[['Project_Name','Project_URL','Project_Hash','Test_name']].loc[df['flaky'] == 'NOD'].loc[df['language'] == 'Java'].loc[df['test_type'] == 'developer-written']
    print(df['test_type'].unique()) ## ['evosuite_Default' 'evosuite_NoFlakinessSuppression' 'developer-written' 'generated']
    print(df['flaky'].unique()) ## not flaky, NOD,  OD
    print(developer_NOD_projects,len(developer_NOD_projects)) ## 105, same as paper

    return developer_NOD_info

def download_project(project,target_dir):
    cwd=os.getcwd()
    url = project['Project_URL']
    name = project['Project_Name']
    commit = project['Project_Hash']
    if os.path.isdir(target_dir):
        shutil.rmtree(target_dir)
    os.chdir(PROJECTS_DIRECTORY)
    subprocess.run('git clone '+url+' '+ name,shell=True, stdout=open(os.devnull, 'w'), stderr=subprocess.STDOUT)
    os.chdir(target_dir)
    subprocess.run('git checkout '+commit,shell=True, stdout=open(os.devnull, 'w'), stderr=subprocess.STDOUT)
    os.chdir(cwd)

def build_project(target_dir):
    cwd = os.getcwd()
    os.chdir(target_dir)
    build_log = target_dir+'/build.log'
    start_time = time.time()
    print('Building client ... ' + str(datetime.datetime.now()))
    subprocess.run('mvn install -DskipTests -Ddetector.detector_type=random-class-method -Ddt.randomize.rounds=10 -Ddt.detector.original_order.all_must_pass=false -Ddependency-check.skip=true -Denforcer.skip=true -Drat.skip=true -Dmdep.analyze.skip=true -Dmaven.javadoc.skip=true -Dgpg.skip -Dlicense.skip=true -am  ', shell=True, stdout=open(build_log, 'w'), stderr=subprocess.STDOUT)
    end_time = time.time()
    insertTimeInLog(start_time, end_time, build_log)
    os.chdir(cwd)



def run_randoop(project,target_dir):
    cwd = os.getcwd()
    os.chdir(target_dir)
    if os.path.isdir('/tmp/jars'):
        shutil.rmtree('/tmp/jars')
    os.mkdir('/tmp/jars')

    start_time = time.time()

    subprocess.run('mvn dependency:copy-dependencies', shell=True,  stdout=open(os.devnull, 'w'), stderr=subprocess.STDOUT)
    for dir,subdir,files in os.walk(target_dir):
        if "dependency" in subdir:
            for file in os.listdir(dir+"/dependency"):
                if file.endswith(".jar"):
                    shutil.copy(dir+"/dependency/"+file,"/tmp/jars")
    os.chdir(target_dir)


    ## Linux platform
    # concat_class_path = '$(find ' + target_dir + ' -name \"classes\" -type d | paste -sd :)'
    # concat_class_path += ':$(find ' + target_dir + ' -name \"test-classes\" -type d | paste -sd :)'
    # concat_class_path += ':$(find /tmp/jars -name \"*.jar\" -type f | paste -sd :):'

    ## Mac os platform

    concat_class_path = '$(find ' + target_dir + ' -name "classes" -type d | xargs echo | tr \' \' \':\')'
    concat_class_path += ':$(find ' + target_dir + ' -name "test-classes" -type d | xargs echo | tr \' \' \':\')'
    concat_class_path += ':$(find /tmp/jars -name "*.jar" -type f | xargs echo | tr \' \' \':\'):'

    generated_dir = RANDOOP_GENERATED_DIRECTORY + project['Project_Name']+ '/'+ project['Project_Hash']+'/alltests/'
    if not os.path.exists(generated_dir):
        os.makedirs(generated_dir)
    literals_file = generated_dir+'literal.log'
    test_method_num_limit = 500
    test_method_max_size = 100
    class_list_file = '/tmp/classes.txt'
    all_classes = []
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


    randoop_cmd = 'java -ea -classpath ' + concat_class_path + \
                  ' randoop.main.Main gentests' \
                  + ' --classlist=' + class_list_file \
                  + ' --output-limit=' + str(test_method_num_limit) \
                  + ' --time-limit=60' \
                  + ' --junit-output-dir=' + generated_dir \
                  + ' --regression-test-basename=TestGroup' \
                  + str(test_method_max_size) + 'Case' \
                  # + ' --literals-file=' + literals_file \
                  # + ' --literals-level=ALL'
    logging.info(randoop_cmd)
    test_gen_log = generated_dir + '/testgen.txt'
    subprocess.run(randoop_cmd,shell=True,stdout=open(test_gen_log,'w'),stderr=subprocess.STDOUT)
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



if __name__ == '__main__':
    projects_info = read_dataset()
    if not os.path.exists(PROJECTS_DIRECTORY):
        os.mkdir(PROJECTS_DIRECTORY)
    for index,project in projects_info.iterrows():
        project_name = project['Project_Name']
        target_dir = PROJECTS_DIRECTORY+project_name
        if not os.path.exists(target_dir):
            download_project(project,target_dir)
        if not os.path.exists(target_dir+'/build.log'):
            build_project(target_dir)
        # print(os.listdir(target_dir))
        run_randoop(project,target_dir)
        # break
        # os.chdir(PROJECTS_DIRECTORY+project_name)
        # print(os.getcwd())
# See PyCharm help at https://www.jetbrains.com/help/pycharm/
