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


PROJECTS_DIRECTORY = "C:\\Users\\yhcro\\Documents\\FFprojects\\"
flakeflagger_project_to_sha = {}
MVN_LOC = 'C:\\Users\\yhcro\\Downloads\\apache-maven-3.8.8-bin\\apache-maven-3.8.8\\bin\\mvn'
JAVA_HOME = "C:\\Users\\yhcro\\IdeaProjects\\FlakyTracker\\OpenJDK8U-jdk_x64_windows_hotspot_8u402b06\\jdk8u402-b06\\jre\\"



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
def main():
    # flakeflagger_projects = read_flakeflagger()
    # flakeflagger_tests = flakeflagger_flaky_tests()

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

    for index, project in flakeflagger_projects.iterrows():
        project_name = project['Project_Name']
        target_dir = PROJECTS_DIRECTORY + project_name

        if project_name in [ 'square-okhttp', 'orbit-orbit', 'undertow-io-undertow', 'wildfly-wildfly', 'activiti-activiti', 'Alluxio-alluxio','apache-ambari', 'apache-incubator-dubbo', 'apache-hbase','togglz-togglz','square-okhttp','spring-projects-spring-boot','undertow-io-undertow']:
            continue


        report_dir = WORKSPACE + '/idflakies/' + file + '-flakeflagger/'
        if not os.path.exists(report_dir):
            os.makedirs(report_dir)
