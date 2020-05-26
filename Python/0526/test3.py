# a = 1
# def test(a):
#     a = a+1

# print(a, "첫번째")
# test(a)
# print(a,"두번째")

# a=1
# b=10
# def test(a):
#     a = a+1
#     print(b,"b변수")
#     return a

# print(a,"첫번째")
# a= test(a)
# print(a,'두번째')

# a=1
# def test():
#     global a
#     a = a+1

# test()
# print(a)

def add(a,b):
    """add function """
    return a+b
add.__doc__=""
help(add)

