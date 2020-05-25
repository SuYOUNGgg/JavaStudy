colors = ['white','red','green','blue']
print(colors)
colors.sort()
print(colors)
print(sorted(['white','red','green','blue']))

def mysort(x):
    return x[-1]

print(mysort('white'),mysort('red'))

colors2 = ['white','red','green','blue']
colors2.sort(key=mysort)
print(mysort('white'),mysort('red'),mysort('green'),mysort('blue'))
colors2.sort(key=len)
print(colors2)

a = 10
b = 'test'
c = ['1234','1234','222']
def test():
    return 0
d= test
d()

#얕은복사, 깊은 복사
a1 = 1
b1 = a1
print(a1,b1)
list1 = [1,2,3]
list2 = list1
print(list1,list2)
print(id(list1),id(list2))
print(id(a1), id(b1))

# shallow copy
s = list1[:]
print(list1, s)
s.append([5,5])
print(list1,s)
s[0] = [1,2,3]
print(list1, s)


