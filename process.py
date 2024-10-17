import pandas as pd
def read_idoft():
    path = './pr-data.csv'
    df = pd.read_csv(path)
    need_process_projects = df[['Project URL', 'SHA Detected']].loc[
        (df['Category'] == 'UD') |
        (df['Category'] == 'NOD') |
        (df['Category'] == 'NIO') |
        (df['Category'] == 'OSD')
        ].drop_duplicates(subset = ['Project URL'])
    need_process_projects = need_process_projects.rename(columns={'SHA Detected': 'Project_Hash','Project URL':'Project_URL'})
    need_process_projects['Project_Name'] = need_process_projects['Project_URL'].apply(lambda x : x.split('/')[-1])
    print(need_process_projects)

def get_tests_to_focus(df):
    need_process_projects = df[['Project URL', 'SHA Detected']].loc[
        (df['Category'] == 'UD') |
        (df['Category'] == 'NOD') |
        (df['Category'] == 'NIO') |
        (df['Category'] == 'OSD')
        ].drop_duplicates(subset = ['Project URL',''])

if __name__ == "__main__":
    read_idoft()