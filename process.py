import pandas as pd
def read_idoft():
    path = './pr-data.csv'
    df = pd.read_csv(path)
    need_process_projects = df['Project URL'].loc[df['Category'] == 'UD' or df['Category'] == 'NOD' or df['Category'] == 'NIO' or df['Category'] == 'OSD']
    print(need_process_projects)

if __name__ == "__main__":
    read_idoft()