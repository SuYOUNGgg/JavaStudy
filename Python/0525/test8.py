a = 1
b = 2
def add(x,y):
    return x + y
add(1,2)

print(dir(__builtins__))

def test(*a):
    print(type(a))

test(1)
test("2")
test(1,2)

def add_and_subtract(a,b):
    return a+b, a-b
print(add_and_subtract(2,1))
x,y = add_and_subtract(4,3)
print(x,y)

def msg(str):
    if str =="ok":
        return
    print("next ok")

msg("good")
msg("ok")