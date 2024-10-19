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
    need_process_projects['Project_Name'] = need_process_projects['Project_URL'].apply(lambda x: x.split('/')[-1])
    need_process_projects = need_process_projects.drop(columns = ['Project_URL'])
    print(need_process_projects)


if __name__ == "__main__":
    read_idoft()
    # get_tests_to_focus()
