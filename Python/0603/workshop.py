import numpy as np
import pandas as pd

data = pd.read_csv("C:\\Python37_Project\\0603\\student.csv")

data['bmi'] = data['weight'] / ((data['height']/100)*(data['height']/100))
print(data)

filter = data['sex'] =='male'
df_male = data[filter]
m = df_male['bmi']

filter2 = data['sex'] =='female'
df_female = data[filter2]
f = df_female['bmi']

print("###############남녀 평균 BMI지수################")
choice = int(input("알고 싶은 평균 BMI지수의 성별을 입력해주세요. 남자(1) 여자(2) : " ))
if choice ==1:
    print(sum(m)/len(m))
elif choice ==2:
    print(sum(f)/len(f))

       




