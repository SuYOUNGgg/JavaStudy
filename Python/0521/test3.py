str = "%10s" % "hi" #s자리에 hi가 들어가고 hi를 포함해서 10자리라는 의미
print(str)
print(len(str))

str2 = "%-10sjain" % "hi" #-때문에 반대에 위치함
print(str2)

str3 = "%10.4f" % 3.42134234 #소수점4자리까지 출력하는데 전체 10자리가 되어야하기 때문에 나머지는 공백으로
print(str3)
print(len(str3))

str4 = "%0.4f" % 3.42134234
print(str4)  #소수점4자리까지 출력
print(len(str4))

str5 = "I am a korean"
str6 = str5.split()
print(str6)
print(type(str6)) #list형 : 값의 나열

list1 = ["홍길동", 100, 200]
print(list1)
list2 = [1,2,3]
print(list2)
print(list1[0], list1[1], list1[2])
str6 = "%s는 %d원과 %d를 가지고 있습니다." % (list1[0], list1[1], list1[2])
print(str6)

list3 = [0,1,2,3,4,5]
print(list3[0:])
print(list3[:])
print(list3[2:4])

list4=['짜장면', '짬뽕', '탕수육','볶음밥','군만두']
print(list4)
list4[0]='팔보채'
print(list4)
list5=[1,2,[1,2,3],4,[1,2]]
print(list5)
print(list5[2])
del list5[0]
print(list5)
list5[0:1] =[10,11,12]
print(list5)

list6=[1,[1,2,3],4,[1,2,[1,2,3]]]
print(list6)
print(list6[1])
print(list6[1][2]) #list[1]에 해당하는 [1,2,3]에서 [2]인 '3'출력
print(list6[3][2][2])
print(list6[-4:3])

colors=['red','green','gold']
print(colors)
print(type(colors))
colors.append('blue')
print(colors)
colors.insert(1,'black')
print(colors)
colors.extend(['white','gray'])
print(colors)
colors += ['red']
print(colors)
colors +='red'
print(colors)
colors.index('red')
print(colors)
print(colors.index('red'))
print(colors.index('red',1))
print(colors.count('red'))
print(colors.pop())
print(colors.pop(1))
print(colors)
print(colors.remove('gold'))
print(colors.remove('red'))
print(colors)
colors.sort()
print(colors)
colors.reverse()
print(colors)
def mysort(x):
    return x[-1]
colors.sort(key=mysort)
print(colors)
colors.sort(key=mysort,reverse=True)
print(colors)

def add(a,b):  #def들어가는 건 함수
    return a+b
c=add(1,2)
print(c)

list7 =[1,2,3,4,6]
for i in list7:
    print(i)

tu1 = (100,"홍길동",20)
print(tu1)
print(tu1[0])


add(1,2)
d=add(1,2)
print(d)

tu2 = (1,2,3,4,5)
print(tu2[0],tu2[0:2]) #튜플에서는 데이터 추가나 삭제 불가능 list사용해야함

tu3=[1,(10,"영업부",100),(20,"회계부",300)]
tu4=(1,(10,20),(30,40,50))
print(tu4)
for i in tu3:
    print(i)




