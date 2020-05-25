# def helloFunc():
#     print("Hello Function")

# helloFunc()

# def add(x,y):
#     z = x+y
#     return z

# print(add(1,2))

# a = int(input("a : "))
# b = int(input("b : "))
# print("sum = ", add(a,b))

#Call by Reference
def test_list(list1):
    list1.append(20)
    list1.append(30)
    print("Inside list1 = ",list1)

list2 = [10,30, 40, 50]
print(list2)
test_list(list2)
print("Outside list = ", id(list2), list2)

def add(x,y):
    return x+y
print(add(x = 2, y =20))
print(add(2, y=4))
print(add(y=2,x =4))

def subtract(x=0,y=0):
    return x-y
print(subtract(x=10))

def printName(*names):
    print(type(names))
    for name in names:
        print(name)

printName("이순신","홍길동","권율")

print(globals())