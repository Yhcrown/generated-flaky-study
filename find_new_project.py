
import subprocess
import time
import os
import sys
import csv
import re

# 配置常量
MVN_CMD = "/Users/yhcrown/Documents/tools/apache-maven-3.9.5/bin/mvn"
PROJECT_LIST = '/Users/yhcrown/Documents/GitHub/experiment-utils/project-utils/project_list'
JAVA_HOME = "/Library/Java/JavaVirtualMachines/jdk8u442-b06/Contents/Home/"


def parse_test_count(output: str) -> int:
    """
    从 mvn 输出中提取 "Tests run: X" 里的 X。
    """
    m = re.search(r"Tests run:\s*(\d+)", output)
    return int(m.group(1)) if m else 0


def compiled_tests_exist(root_dir: str) -> bool:
    """
    在各模块的 target/test-classes 目录下查找已编译的测试类。
    如果存在任何 .class 文件，则认为有测试。
    """
    for dirpath, _, files in os.walk(root_dir):
        # 匹配 .../target/test-classes
        if os.path.sep + os.path.join('target', 'test-classes') in dirpath:
            for f in files:
                if f.endswith('.class'):
                    return True
    return False


def main():
    # 设置 JAVA_HOME
    os.environ['JAVA_HOME'] = JAVA_HOME

    # 读取项目列表
    with open(PROJECT_LIST, 'r') as f:
        repos = [line.strip() for line in f if line.strip()]

    base_dir = '/Users/yhcrown/Documents/temp-projects2/'
    logs_dir = './temp-project-logs/'
    os.makedirs(base_dir, exist_ok=True)
    os.makedirs(logs_dir, exist_ok=True)

    results = []

    for repo in repos:
        # 根据需要跳过某些仓库
        if "iluwatar_java-design-patterns" in repo:
            continue

        print(f"\n==> Processing {repo}")
        safe_name = repo.replace('/', '_')
        clone_dir = os.path.join(base_dir, safe_name)
        git_url = f"https://github.com/{repo}.git"

        # 克隆最新 commit
        clone = subprocess.run(
            ['git', 'clone', '--depth', '1', git_url, clone_dir],
            stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True
        )
        if clone.returncode != 0:
            print(f"[ERROR] clone failed: {repo}")
            log_path = os.path.join(logs_dir, f"{safe_name}_clone.log")
            with open(log_path, 'w') as lf:
                lf.write(clone.stdout + clone.stderr)
            results.append((repo, '', False, False, False, 0.0, 0, log_path))
            continue

        # 获取当前 commit 哈希
        commit = subprocess.run(
            ['git', '-C', clone_dir, 'rev-parse', 'HEAD'],
            stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True
        ).stdout.strip()

        # 尝试编译测试 (快速检测)
        compile_proc = subprocess.run(
            [MVN_CMD, 'test-compile', '-q'],
            cwd=clone_dir,
            stdout=subprocess.PIPE, stderr=subprocess.PIPE,
            text=True
        )
        has_tests = compiled_tests_exist(clone_dir)
        if not has_tests:
            print(f"[SKIP] no tests compiled in {repo}")
            # 跳过测试执行
            results.append((repo, commit, False, False, False, 0.0, 0, ''))
            continue

        # 运行 mvn test 并计时、计数
        timeout_flag = False
        try:
            start = time.time()
            test_proc = subprocess.run(
                [MVN_CMD, 'test'],  # 完整执行测试
                cwd=clone_dir,
                stdout=subprocess.PIPE, stderr=subprocess.PIPE,
                text=True,
                timeout=600  # 10 分钟
            )
            elapsed = time.time() - start
            output = test_proc.stdout + test_proc.stderr
            test_count = parse_test_count(output)
            success = (test_proc.returncode == 0)

            log_file = ''
            if not success:
                log_file = os.path.join(logs_dir, f"{safe_name}.log")
                with open(log_file, 'w') as lf:
                    lf.write(output)

            status = 'SUCCESS' if success else 'FAILURE'
            print(f"[{status}] {repo} | tests: {test_count} | time: {elapsed:.2f}s")

        except subprocess.TimeoutExpired as e:
            timeout_flag = True
            elapsed = 600.0
            success = False
            test_count = 0
            log_file = os.path.join(logs_dir, f"{safe_name}_timeout.log")
            raw_out = e.stdout or ""
            if isinstance(raw_out, bytes):
                out = raw_out.decode('utf-8', 'replace')
            else:
                out = raw_out

            raw_err = e.stderr or ""
            if isinstance(raw_err, bytes):
                err = raw_err.decode('utf-8', 'replace')
            else:
                err = raw_err

            with open(log_file, 'w') as lf:
                lf.write(out + '\n' + err)
            print(f"[TIMEOUT] {repo} after 600s")

        # 收集结果
        results.append((repo, commit, True, timeout_flag, success, elapsed, test_count, log_file))

    # 输出 CSV
    out_csv = 'build_results.csv'
    with open(out_csv, 'w', newline='') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(['repo', 'commit', 'has_tests', 'timeout', 'success', 'time_sec', 'test_count', 'log_file'])
        for row in results:
            writer.writerow(row)

    print(f"\nAll done. Results written to {out_csv}")
    print(f"Logs directory: {logs_dir}")


if __name__ == '__main__':
    main()