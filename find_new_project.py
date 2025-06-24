import subprocess
import time
import os
import sys
import csv
import re

MVN_CMD = "/Users/yhcrown/Documents/tools/apache-maven-3.9.5/bin/mvn"
PROJECT_LIST = '/Users/yhcrown/Documents/GitHub/experiment-utils/project-utils/project_list'
JAVA_HOME = "/Library/Java/JavaVirtualMachines/jdk8u442-b06/Contents/Home/"
def parse_test_count(output):
    """
    从 mvn 输出中提取 "Tests run: X" 里的 X。
    """
    m = re.search(r"Tests run:\s*(\d+)", output)
    return int(m.group(1)) if m else 0

def main():
    # 读取项目列表
    with open(PROJECT_LIST, 'r') as f:
        repos = [line.strip() for line in f if line.strip()]

    base_dir = '/Users/yhcrown/Documents/temp-projects/'
    logs_dir = './temp-project-logs/'
    os.makedirs(base_dir, exist_ok=True)
    os.makedirs(logs_dir, exist_ok=True)

    results = []

    for repo in repos:
        # 跳过特定项目
        if "iluwatar_java-design-patterns" in repo:
            continue

        print(f"\n==> Processing {repo}")
        safe_name = repo.replace("/", "_")
        clone_dir = os.path.join(base_dir, safe_name)
        git_url = f"https://github.com/{repo}.git"

        # 克隆仓库
        ret = subprocess.run(
            ["git", "clone", git_url, clone_dir],
            stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True
        )
        if ret.returncode != 0:
            print(f"[ERROR] clone failed: {repo}")
            log_path = os.path.join(logs_dir, f"{safe_name}_clone.log")
            with open(log_path, 'w') as logf:
                logf.write(ret.stdout + ret.stderr)
            # 记录失败
            results.append((repo, False, 0.0, 0, log_path))
            continue

        # 运行 mvn test 并计时、计数
        try:
            start = time.time()
            ret = subprocess.run(
                [MVN_CMD, "test", "-q"],
                cwd=clone_dir,
                stdout=subprocess.PIPE, stderr=subprocess.PIPE,
                text=True,
                timeout=600  # 10分钟
            )
            elapsed = time.time() - start
            output = ret.stdout + ret.stderr
            test_count = parse_test_count(output)
            success = (ret.returncode == 0)

            log_path = ""
            if not success:
                log_path = os.path.join(logs_dir, f"{safe_name}.log")
                with open(log_path, 'w') as logf:
                    logf.write(output)

            status = "SUCCESS" if success else "FAILURE"
            print(f"[{status}] {repo} | tests: {test_count} | time: {elapsed:.2f}s")

        except subprocess.TimeoutExpired as e:
            elapsed = 600.0
            success = False
            test_count = 0
            log_path = os.path.join(logs_dir, f"{safe_name}_timeout.log")
            # 如果是 bytes，就解码；否则直接使用
            out = e.stdout.decode('utf-8', errors='replace') if isinstance(e.stdout, bytes) else (e.stdout or "")
            err = e.stderr.decode('utf-8', errors='replace') if isinstance(e.stderr, bytes) else (e.stderr or "")
            with open(log_path, 'w') as logf:
                logf.write(out + "\n" + err)
            print(f"[TIMEOUT] {repo} after 600s")
            print(f"[TIMEOUT] {repo} after 600s")

        results.append((repo, success, elapsed, test_count, log_path))

    # 输出 CSV
    out_csv = "build_results.csv"
    with open(out_csv, "w+", newline="") as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(["repo", "success", "time_sec", "test_count", "log_file"])
        for repo, success, elapsed, test_count, log_path in results:
            writer.writerow([repo, success, f"{elapsed:.2f}", test_count, log_path])

    print(f"\nAll done. Results written to {out_csv}")
    print(f"Logs are in: {logs_dir}")

if __name__ == "__main__":
    os.environ['JAVA_HOME'] = JAVA_HOME
    # os.environ['MAVEN_HOME'] = MVN_LOC
    main()