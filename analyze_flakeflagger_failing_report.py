import os
import shutil
import tarfile
import xml.etree.ElementTree as ET
import re

base_directory = r".\flakeflagger_failing_log"
flakeflagger_input_dir = r".\f"

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


def process_xml(xml_file, xml_path):
    """
    处理 XML 文件
    """
    base_log_file = base_directory + './flakeflagger_assertion_failing_log/'
    try:
        tree = ET.parse(xml_file)
        root = tree.getroot()
        # 解析 Surefire 报告
        for testcase in root.findall(".//testcase"):
            test_name = testcase.attrib.get("name")
            classname = testcase.attrib.get("classname")

            # 查找失败的测试信息
            failure = testcase.find("failure")
            if failure is not None:
                message = failure.attrib.get("message", "")
                # print(message)
                # 检查错误是否为 AssertionError
                if "AssertionError" in failure.text:
                    log_dir = base_log_file + "/".join(xml_path.replace("failingLogs", "").split("/")[:-1])
                    if not os.path.exists(log_dir):
                        os.makedirs(log_dir)
                    log_file = log_dir + "/" + xml_path.split("/")[-1]
                    # print(xml_path)
                    simple_class_name = classname.split(".")[-1]
                    process_error_log(failure.text, simple_class_name, None,xml_path)
                    with open(log_file, "w+") as f:
                        f.write(f"AssertionError in test: {test_name}, Class: {classname}, Message: {message} \n")
                        f.write(f"{failure.text}")
                    # 如果需要记录，可以写入文件或保存到数据结构中
    except ET.ParseError as e:
        print(f"Failed to parse XML: {xml_path}, Error: {e}")


already_annotated = {}

def process_error_log(error_log, classname, source_code_base, path):
    """
    从错误日志中提取行号和方法名，并标注源码
    """
    # 提取堆栈信息：类名、方法名、行号
    match = re.search(rf'at (\S+)\.(\w+)\({classname}.java:(\d+)\)', error_log)
    if match:
        full_class = match.group(1)
        method_name = match.group(2)
        # file_name = match.group(3)
        line_number = int(match.group(3))
        # print(full_class, method_name, line_number)
    else:
        print(f"error parsing{path}")
    # 查找源码文件
    # java_file_path = os.path.join(source_code_base, full_class.replace('.', os.sep) + ".java")
    # if os.path.exists(java_file_path):
    #     print(f"Found issue in {java_file_path}:{line_number}, Method: {method_name}")
    #     annotate_source_file(java_file_path, line_number, method_name)

def annotate_source_file(file_path, line_number, message):
    """
    在源码文件中标注出问题行
    """
    try:
        with open(file_path, 'r') as file:
            lines = file.readlines()

        # 插入标注信息
        if 0 < line_number <= len(lines):
            lines[line_number - 1] = f"// --> : AssertionError occurred here: {message}  " + lines[line_number - 1]

        # 写回文件
        with open(file_path, 'w') as file:
            file.writelines(lines)
        print(f"Annotated {file_path}:{line_number}")
    except Exception as e:
        print(f"Failed to annotate {file_path}:{line_number}, Error: {e}")



if __name__ == "__main__":
    # base_directory = r"C:\Users\yhcro\Documents\GitHub\generated-flaky-study\flakeflagger_failing_log"
    extract_and_process_tgz(base_directory)
