import pandas as pd
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
    print(need_process_projects)
    get_tests_to_focus(df)

def get_tests_to_focus(df):
    need_process_projects = df[['Project URL', 'SHA Detected','Module Path', 'Fully-Qualified Test Name (packageName.ClassName.methodName)']].loc[
        (df['Category'] == 'UD') |
        (df['Category'] == 'NOD') |
        # (df['Category'] == 'NIO') |
        (df['Category'] == 'OSD')]
    need_process_projects = need_process_projects.rename(columns = {'SHA Detected': 'Project_Hash','Project URL':'Project_URL','Module Path':'Module', 'Fully-Qualified Test Name (packageName.ClassName.methodName)':'testname'})
    need_process_projects['Project_Name'] = need_process_projects['Project_URL'].apply(lambda x: "-".join(x.split('/')[-2:]))
    need_process_projects = need_process_projects.drop(columns = ['Project_URL'])
    print(need_process_projects)



flakeflagger_project_to_sha = {}
def read_flakeflagger():
    path = './Project_Info.csv'
    df = pd.read_csv(path)
    need_process_projects = df.rename(columns={'SHA': 'Project_Hash','URL':'Project_URL'})
    need_process_projects['Project_Name'] = need_process_projects['Project_URL'].apply(lambda x: "-".join(x.split('/')[-2:]))
    for index, project in need_process_projects.iterrows():
        flakeflagger_project_to_sha[project['Project_Name']] = project['Project_Hash']
    print(need_process_projects)
def flakeflagger_flaky_tests():
    path = './test_results.csv'
    df = pd.read_csv(path)
    flaky_tests = df[["Project","Test"]].loc[df["IsFlaky"]==1]
    flaky_tests = flaky_tests.rename(columns={'Project':'Project_Name','Test':'testname'})
    flaky_tests["Project_Hash"] = flaky_tests['Project_Name'].apply(lambda x:flakeflagger_project_to_sha[x])
    print(flaky_tests)

if __name__ == "__main__":
    # read_idoft()
    read_flakeflagger()
    flakeflagger_flaky_tests()
    # get_tests_to_focus()
