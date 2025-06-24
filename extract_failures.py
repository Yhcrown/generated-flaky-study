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
import json
import tarfile
from collections import defaultdict
from difflib import SequenceMatcher

source_code_base = "/Users/yhcrown/Documents/flaky_java_projects_ff/"
ZIP_DIR = "/Users/yhcrown/Documents/GitHub/generated-flaky-study/flakeflagger_failing_log"
failures_for_analyze_dir = "/Users/yhcrown/Documents/GitHub/generated-flaky-study/failures_for_analyze/"
flakeflagger_input_dir = r"/Users/yhcrown/Documents/GitHub/generated-flaky-study/flakeflagger_input_data/original_tests/"

chaosi_report_dir = "/Users/yhcrown/Documents/GitHub/generated-flaky-study/chaosapi-experiments/"

base_directory = r"./flakeflagger_failing_log/"
test_to_message = dict()
already_annotated = set()
miss_tests = set()
same_set = set()
diff_set = set()

logs_by_test = defaultdict(lambda: defaultdict(lambda: defaultdict(list)))
test_messages = defaultdict(set)

same_cause_num = 0
diff_cause_num = 0


def normalize_string(s):
    return re.sub(r"\s+", "", s)


IGNORE_PREFIXES = (
    'sun.reflect.',
    'java.lang.reflect.',
    'org.apache.maven.surefire.',
    'org.apache.maven.surefire.util.',
    'org.apache.maven.surefire.booter.',
)


def extract_exception_type(trace: str) -> str:
    """
    Extract the exception type from the first line, removing the message part.
    """
    first_line = trace.strip().splitlines()[0]
    return first_line.split(':', 1)[0].strip()


def normalize_trace(trace: str, include_line_numbers: bool = False) -> list[str]:
    """
    Extract 'at Class.method(File.java:line)' frames.
    Filter out frames that start with ignored prefixes.
    If include_line_numbers is True, include '(File.java:line)' in the frame string.
    """
    pattern = re.compile(r'^\s*at\s+([\w.$]+)\(([\w.$]+:\d+)\)', re.MULTILINE)
    frames = []
    for method, location in pattern.findall(trace):
        frame = f"{method}({location})" if include_line_numbers else method
        if not any(frame.startswith(prefix) for prefix in IGNORE_PREFIXES):
            frames.append(frame)
    return frames


def compare_stack_traces(
        t1: str,
        t2: str,
        threshold: float = 1.0,
        include_line_numbers: bool = True,
        ignore_exception_message: bool = True
) -> bool:
    """
    Compare two stack traces for equality.
    ignore_exception_message: only compare exception types if True.
    include_line_numbers: treat line numbers as significant if True.
    threshold: minimum sequence similarity ratio (1.0 means exact match).
    """
    # Compare exception types if requested
    if ignore_exception_message:
        if extract_exception_type(t1) != extract_exception_type(t2):
            return False

    # Normalize and filter frames
    seq1 = normalize_trace(t1, include_line_numbers)
    seq2 = normalize_trace(t2, include_line_numbers)

    # If no meaningful frames found, fall back to raw text comparison (excluding first line)
    if not seq1 and not seq2:
        rest1 = '\n'.join(t1.strip().splitlines()[1:])
        rest2 = '\n'.join(t2.strip().splitlines()[1:])
        return rest1 == rest2

    # Compute similarity ratio
    ratio = SequenceMatcher(None, seq1, seq2).ratio()
    return ratio >= threshold


def process_tgz(tgz_path, project_name, project_info):
    """
    解压 tgz 文件并处理其中的 XML 文件
    """
    with tarfile.open(tgz_path, "r:gz") as tar:
        for member in tar.getmembers():
            if member.isfile() and member.name.endswith('.xml'):
                xml_file = tar.extractfile(member)
                if xml_file:
                    process_xml(xml_file, member.name, project_name)
                    # print(xml_file)


def process_error_log(error_log, classname, project, message, method_dir, write_path):
    """
    从错误日志中提取行号和方法名，并标注源码
    """
    # 提取堆栈信息：类名、方法名、行号
    classname = classname.split('.')[-1]
    match = re.search(rf'at (\S+)\.(\w+)\({classname}.java:(\d+)\)', error_log)
    if match:
        full_class = match.group(1)
        method_name = match.group(2)
        # file_name = match.group(3)
        line_number = int(match.group(3))
        # print(full_class, method_name, line_number)
        # source_dir2 = None
        for dir, subpath, files in os.walk(source_code_base + "/" + project):
            for file in files:
                if file == classname + ".java":
                    source_dir = dir + "/" + file

        test_messages[project + '#' + classname + '#' + str(line_number)].add(message)
        if not (method_dir + '#' + str(line_number) + '#' + message in already_annotated):
            # annotate_source_file(source_dir, test_path, line_number, project,classname)
            already_annotated.add(method_dir + '#' + str(line_number) + '#' + message)

            shutil.copy(method_dir, write_path)
            try:
                with open(source_dir, 'r') as file:
                    lines = file.readlines()

                with open(write_path, 'r') as test:
                    test_lines = test.readlines()
                # 插入标注信息
                if 0 < line_number <= len(lines):
                    original_line = lines[line_number - 1]
                    new_line = f"// --> Flaky here: possible message: "
                    for message in test_messages[project + '#' + classname + '#' + str(line_number)]:
                        new_line += f"{message}; "
                    new_line += lines[line_number - 1]

                    for i in range(0, len(test_lines)):
                        if normalize_string(original_line) in normalize_string(test_lines[i]):
                            test_lines[i] = new_line
                    # 写回文件
                    #     write_path = base_directory+'/assertion_original_tests/'
                    with open(write_path, 'w+') as test:
                        test.writelines(test_lines)
                print(f"Annotated {write_path}:{line_number}")
            except Exception as e:
                print(f"Failed to annotate {source_dir}:{line_number}, Error: {e}")
    else:
        print(f"error parsing {error_log}")


def process_xml(xml_file, xml_path, project_name):
    try:
        tree = ET.parse(xml_file)
        root = tree.getroot()
        # 解析 Surefire 报告
        for testcase in root.findall(".//testcase"):
            test_name = testcase.attrib.get("name")
            classname = testcase.attrib.get("classname")
            full_name = classname + '#' + test_name
            # 查找失败的测试信息
            failure = testcase.find("error")
            if failure is None:
                failure = testcase.find("failure")
            if failure is None:
                continue
            message = failure.text
            target_dir = failures_for_analyze_dir + '/' + project_name + '/' + full_name + '/'
            ff_message_file = target_dir + 'original_failure_message'
            if not os.path.exists(target_dir):
                os.makedirs(target_dir)
            if full_name not in test_to_message:
                test_to_message[full_name] = set()

            # exist = False
            # for m in test_to_message[full_name]:
            #     if compare_stack_traces(m,message):
            #         exist = True
            #         break
            if message not in test_to_message[full_name]:
                # if not exist:
                test_to_message[full_name].add(message)
                with open(ff_message_file + str(len(test_to_message[full_name])), 'w+') as f:
                    f.write(message)

            if not os.path.exists(target_dir + '/original_test.java'):
                if project_name == 'jknack-handlebars.java':
                    # project_name = 'jknack-handlebars'
                    continue
                original_test_path = flakeflagger_input_dir + '/' + project_name + '/flakyMethods/' + full_name.replace(
                    '#', '-') + '.java'
                if os.path.exists(original_test_path):

                    write_path = target_dir + '/original_test.java'
                    process_error_log(failure.text, classname, project_name, failure.attrib.get("message", ""),
                                      original_test_path, write_path)
                    # shutil.copy(original_test_path, target_dir + '/original_test.java')

                else:
                    miss_tests.add(full_name)



    except ET.ParseError as e:
        print(f"Failed to parse XML: {xml_path}, Error: {e}")


def process_chaos_xml(xml_file, project_name, config):
    try:
        tree = ET.parse(xml_file)
        root = tree.getroot()
        # 解析 Surefire 报告
        for testcase in root.findall(".//testcase"):
            test_name = testcase.attrib.get("name")
            classname = testcase.attrib.get("classname")
            full_name = classname + '#' + test_name
            # 查找失败的测试信息
            failure = testcase.find("error")
            if failure is None:
                failure = testcase.find("failure")
            if failure is None:
                continue
            message = failure.text
            target_dir = failures_for_analyze_dir + '/' + project_name + '/' + full_name + '/'
            if (full_name not in project_dict[project_name]['flaky_tests']) and (
                    full_name in project_dict[project_name]['chaos_failed_tests']):
                target_dir = failures_for_analyze_dir + '/' + project_name + '/noLabeled/' + full_name + '/'
                if not os.path.exists(target_dir):
                    os.makedirs(target_dir)
                original_test_path = flakeflagger_input_dir + '/' + project_name + '/nonFlakyMethods/' + full_name.replace(
                    '#', '-') + '.java'
                if os.path.exists(original_test_path):
                    write_path = target_dir + '/original_test.java'
                    # process_error_log(failure.text, classname, project_name, failure.attrib.get("message", ""),
                    #                   original_test_path, write_path)
                    shutil.copy(original_test_path, write_path)
                else:
                    miss_tests.add(full_name)

            ff_message_file = target_dir + 'original_failure_message'
            chaos_message_file = target_dir + config + '_failure_message'

            index = 1
            find = True
            while os.path.exists(ff_message_file + str(index)):
                with open(ff_message_file + str(index), 'r+') as f:
                    original_message = f.read()
                # print(ff_message_file+str(index))
                index += 1
                if compare_stack_traces(original_message, message):
                    # if normalize_string("\n".join(normalize_trace(original_message))) == normalize_string("\n".join(normalize_trace(message))):#may need more fine-grained match strategy
                    chaos_message_file = chaos_message_file + '-same'
                    if project_name + '#' + full_name in diff_set:
                        diff_set.remove(project_name + '#' + full_name)
                    same_set.add(project_name + '#' + full_name)
                    find = True
                    break
                else:
                    find = False
            if not find:
                chaos_message_file = chaos_message_file + '-diff'
                # print(f"fnote-- different cause: {chaos_message_file}")
                if project_name + '#' + full_name not in same_set:
                    diff_set.add(project_name + '#' + full_name)

            if full_name in logs_by_test[project_name]:
                if config in logs_by_test[project_name][full_name]:
                    log = logs_by_test[project_name][full_name][config]
                    test_log_path = target_dir + config + '.agentlog'

                    with open(test_log_path, 'w+') as f:
                        f.writelines(log)

            # else:
            #     print(full_name)

            with open(chaos_message_file, 'w+') as f:
                f.write(message)
    except ET.ParseError as e:
        print(f"Failed to parse XML: {xml_file}, Error: {e}")


def process_log_file(file_path, project_name, config):
    current_test = None

    # 匹配 full_test_key
    test_pattern = re.compile(r"at Test:([^\s-]+)")

    with open(file_path, encoding='utf-8') as f:
        for line in f:
            line = line.rstrip('\n')
            m = test_pattern.search(line)
            if m:
                current_test = m.group(1)
                logs_by_test[project_name][current_test][config].append(line + '\n')
            elif current_test:
                logs_by_test[project_name][current_test][config].append(line + '\n')


if __name__ == '__main__':
    with open('project_dict.json', 'r', encoding='utf-8') as f:
        project_dict = json.load(f)
    maual_inspection_true = {""}

    manual_inspection_false = {'qos-ch-logback#ch.qos.logback.core.net.DefaultSocketConnectorTest#testConnectionFails',
                               "tootallnate-java-websocket#org.java_websocket.issues.Issue256Test#runReconnectBlockingScenario0",
                               }

    manual_inspection_same_true = {
        'wro4j-wro4j#ro.isdc.wro.extensions.processor.TestBourbonCssProcessor#shouldBeThreadSafe'
        , 'wro4j-wro4j#ro.isdc.wro.extensions.processor.TestRubySassCssProcessor#shouldBeThreadSafe'
        , 'zxing-zxing#com.google.zxing.pdf417.decoder.ec.ErrorCorrectionTestCase#testTooManyErrors'
        , 'joel-costigliola-assertj-core#org.assertj.core.api.date.DateAssert_with_string_based_date_representation_Test#date_assertion_should_support_timestamp_string_representation'
        , 'hector-client-hector#me.prettyprint.cassandra.utils.TimeUUIDUtilsTest#testTimeUUIDWithClockResolution'
        , 'apache-commons-exec#org.apache.commons.exec.DefaultExecutorTest#testExecuteAsyncWithProcessDestroyer'}

    manual_inspection_true = {}
    for project_name, project in project_dict.items():
        if project_name in ['Alluxio-alluxio', 'square-okhttp', 'orbit-orbit', 'undertow-io-undertow',
                            'wildfly-wildfly']:
            continue
        if len(project['chaos_failed_tests']) == 0 and project_name != 'kevinsawicki-http-request':
            continue
        else:
            for root, dirs, files in os.walk(base_directory):
                for file in files:
                    if file.endswith('.tgz'):
                        if project_name in file:
                            tgz_path = os.path.join(root, file)
                            # print(f"Processing: {tgz_path}")
                            process_tgz(tgz_path, project_name, project)

    for project_name, project in project_dict.items():
        if project_name in ['Alluxio-alluxio', 'square-okhttp', 'orbit-orbit', 'undertow-io-undertow',
                            'wildfly-wildfly']:
            continue
        if len(project['chaos_failed_tests']) == 0 and project_name != 'kevinsawicki-http-request':
            continue
        for root, dirs, files in os.walk(chaosi_report_dir):
            for dir in dirs:
                if dir == project_name:
                    config = root.split('/')[-1]
                    log_file = root + '/' + 'chaoslog/' + project_name + '.agentlog'
                    if config not in logs_by_test[project_name] and project_name != 'apache-incubator-dubbo':
                        process_log_file(log_file, project_name, config)

                    for root2, dirs2, files2 in os.walk(root + '/' + dir):
                        for file in files2:
                            if file.endswith(".xml"):
                                process_chaos_xml(root2 + '/' + file, project_name, config)

    print("same : ", len(same_set), same_set)
    print("diff : ", len(diff_set), sorted(diff_set))

    # print(miss_tests)
