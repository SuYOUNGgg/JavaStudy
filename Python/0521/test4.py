dict1 = {'Name':'홍길동', 'Age':30}
print(dict1)
print(dict1["Name"])
dict1["Age"]=40
print(dict1)
dict1["Hobby"]="복싱"
print(dict1)
del dict1["Age"]
print(dict1)

for i in dict1: #key
    print(i)

for i in dict1: #value
    print(dict1[i])