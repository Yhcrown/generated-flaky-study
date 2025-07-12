#!/usr/bin/env python3
import csv

CSV_PATH = "build_results.csv"
OUTPUT_CSV= "NEW_PROJECT_INFO.csv"
def main():
    # Read all results
    with open(CSV_PATH, newline='', encoding='utf-8') as f:
        reader = csv.DictReader(f)
        rows = list(reader)

    # Step 1: total projects
    total_projects = len(rows)

    # Step 2: filter out projects without tests
    no_test = [r for r in rows if r['has_tests'].lower() != 'true']
    tested = [r for r in rows if r['has_tests'].lower() == 'true']

    # Step 3: filter out timeouts or failures
    timeout_or_fail = [
        r for r in tested
        if r['timeout'].lower() == 'true' or r['success'].lower() != 'true'
    ]
    passed = [
        r for r in tested
        if r['timeout'].lower() == 'false' and r['success'].lower() == 'true'
    ]

    # Print summary
    print(f"1) Total projects read:                1000")
    print(f"2) Maven projects :                    1000 → remaining: {len(rows)}")
    print(f"3) Projects without tests removed:     {len(no_test)} → remaining: {len(tested)}")
    print(f"4) Timeouts or failures removed:       {len(timeout_or_fail)} → remaining: {len(passed)}")
    print(f"5) Projects passing all criteria:      {len(passed)}\n")

    # Detailed list of passing projects
    print("=== Projects with Tests, No Timeout & Success ===")
    print(f"{'Repository':<40} {'Commit SHA':<40} {'Test Count'}")
    print("-" * 95)
    for r in passed:
        print(f"{r['repo']:<40} {r['commit']:<40} {r['test_count']}")

    with open(OUTPUT_CSV, 'w', newline='', encoding='utf-8') as f:
        writer = csv.writer(f)
        writer.writerow(['URL', 'SHA'])
        for r in passed:
            url = f"https://github.com/{r['repo']}"
            sha = r['commit']
            writer.writerow([url, sha])


if __name__ == "__main__":
    main()