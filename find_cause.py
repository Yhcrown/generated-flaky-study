import pandas as pd
import os
import shutil
import subprocess
import datetime
import time
import logging
import re
import csv


PROJECTS_DIRECTORY = "/shared-data/generated-flaky/projects/"
RANDOOP_GENERATED_DIRECTORY = "/shared-data/generated-flaky/randoop_tests/"

projects = set()
build_fail_projects = set()
randoop_fail_projects = set()
tracker_fail_projects = set()
def search_build_error():
    # log = open(SUMMARY_LOG + 'build_summary.log', 'w+')
    # global error_case_num
    for dir, subpath, files in os.walk(PROJECTS_DIRECTORY):
        for file in files:
            if file == 'build.log':
                projects.add(dir.split('/')[-1])
                with open(dir + '/' + file, 'r') as f:
                    lines = f.readlines()
                    for line in lines:
                        if '[INFO] BUILD FAILURE' in line:
                            # log.write(dir.split("/")[-1] + ', BUILD FAILURE\n')
                            build_fail_projects.add(dir.split('/')[-1])
                            break
                            # error_case_num = error_case_num +1
                        # if '[ERROR]' in line:
                        #     log.write(line)
                            
def search_randoop_error():
    for dir, subpath, files in os.walk(RANDOOP_GENERATED_DIRECTORY):
        for file in files:
            if file == "testgen.txt":
                if "TestGroup100Case0.java" not in files:
                    randoop_fail_projects.add(dir.split("/")[-3])
                    
def search_tarcker_error():
    for dir, subpath, files in os.walk(RANDOOP_GENERATED_DIRECTORY):
        for file in files:
            if file.endswith(".trackerlog"):
                with open(dir + '/' + file, 'r') as f:
                    lines = f.readlines()
                    for line in lines:
                        if 'java.lang.VerifyError' in line:      
                            tracker_fail_projects.add(dir.split("/")[4])
                            
if __name__ == '__main__':
    search_build_error()
    search_randoop_error()
    search_tarcker_error()
    print(len(projects))
    print("build fail", len(build_fail_projects), build_fail_projects)
    print("randoop fail", len(randoop_fail_projects), randoop_fail_projects)
    print("tracker fail", len(tracker_fail_projects), tracker_fail_projects)