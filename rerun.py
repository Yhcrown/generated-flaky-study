import os
import subprocess
import xml.etree.ElementTree as ET
from collections import defaultdict


PROJECTS_DIRECTORY = "/shared-data/generated-flaky/projects/"
JAVA_HOME = "/shared-data/jdk8u422-b05/"
MVN_LOC = "/workspace/apache-maven-3.8.8/bin/mvn"

flaky_projects = {'huchengming-In-Memory-Counter', 'bennidi-lab', 'apifortress-apif-faker', 'ThaliaBuecherGmbH-thalia-junit-postgres', 'rolfl-MicroBench', 'julman99-gson-fire', 'j256-simplemetrics', 'graphaware-reco', '819548945-tool-encryptionAndDecryption-core', 'jembi-openhim-mediator-engine-java', 'yankeguo-xlog-java', 'j256-simplejmx', 'swiftech-swifttime', 'StefaniniInspiring-pugtsdb', 'goldolphin-cate', 'spullara-java-future-jdk8', 'stoyanr-Evictor', 'daniel-frak-dummy4j', 'DataONEorg-d1-cn-common', 'DiUS-java-faker', 'projectodd-sockjs-servlet', 'michaelmosmann-embedmongo-flapdoodle-de', 'kestreldigital-data-conjuror', 'BriteSnow-jomni', 'TareqK-Jesse', 'fabric8io-zjsonpatch', 'alipay-sofa-common-tools', 'seasarorg-mayaa', 'fluent-fluent-logger-java', 'maxonrow-mxw-sdk-java', 'testinfected-time', 'anitechcs-resting', 'itsajskid-jrgen', 'krka-mockachino', 'edgar615-util', 'myzhan-locust4j'}
# flaky_projects = {'goldolphin-cate'}
true_projects = set()

verified_flaky_tests = defaultdict(lambda: defaultdict(int))

# Function to run Maven test command
def run_maven_test(project_dir, test_class, report_dir):
    os.chdir(project_dir)
    
    command = f"{MVN_LOC} -Dtest={test_class} -Dsurefire.reportNameSuffix={report_dir} test"
    result = subprocess.run(command, shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    return result.returncode

# Function to parse Surefire reports and check for flaky tests
def check_flaky_tests(project, test_class, report_dir, runs = 10):
    print(report_dir)
    for root, _, files in os.walk(report_dir):
        for file in files:
            if file.endswith(".xml") and test_class in file:
                print(root, file)
                file_path = os.path.join(root, file)
                tree = ET.parse(file_path)
                xml_root = tree.getroot()

                for testcase in xml_root.findall('testcase'):
                    name = testcase.get('name')
                    if testcase.find('failure') is not None or testcase.find('error') is not None:
                        verified_flaky_tests[project][name] += 1

    return {test: count for test, count in verified_flaky_tests[project].items() if count > 1 and count < runs}

# Main function to run the test class multiple times and check for flakiness
def main_check(test_class, project, runs=10 ):
    project_dir = PROJECTS_DIRECTORY + project
    base_report_dir= project_dir + "/target/surefire-reports"
    for i in range(runs):
        run_dir = f"run_{i+1}"
    #     report_dir = os.path.join(base_report_dir, run_dir)
    #     # os.makedirs(report_dir, exist_ok=True)

    #     print(f"Running test {i+1}/{runs} of project {project} ...")
        result_code = run_maven_test(project_dir, test_class, run_dir)
        # if result_code != 0:
            # print(f"Test run {i+1} failed with return code {result_code}")

    verified_flaky_tests = check_flaky_tests(project, test_class, base_report_dir)
    
    if verified_flaky_tests:
        print("Flaky tests found:")
        true_projects.add(project)
        for test, count in verified_flaky_tests.items():
            print(f"Test {test} failed {count} times")
    else:
        print("No flaky tests found.")



def check_randoop_flaky():
    test_class = "flaky.FlakyTest"
    for flaky_project in flaky_projects:
        main_check(test_class, project = flaky_project)


if __name__ == "__main__":
    # test_class = "com.example.YourTestClass"  # Replace with your test class
    os.environ['JAVA_HOME'] = JAVA_HOME
    os.environ['MAVEN_HOME'] = MVN_LOC
    print(len(flaky_projects))
    check_randoop_flaky()
    print(len(true_projects), true_projects)