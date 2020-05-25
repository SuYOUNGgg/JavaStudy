print(list(range(10)))
print(list(range(2,10)))

while True:
    print("1. 덧셈")
    print("2. 뺼셈")
    print("3. 곱셈")
    print("4. 나눗셈")
    print("종료")

num = int(input("메뉴를 선택해주세요."))

if num == 1:
    print("덧셈입니다.")
    a = int(input("첫번째 숫자를 입력해주세요. "))
    b = int(input("두번째 숫자를 입력해주세요. " ))
    print("결과는 %d입니다." %(a+b))

elif num ==2:
    print("뺄셈입니다.")
    a = int(input("첫번째 숫자를 입력해주세요. "))
    b = int(input("두번째 숫자를 입력해주세요. " ))
    print("결과는 %d입니다." %(a-b))
elif num ==3:
    print("곱셈입니다.")
    a = int(input("첫번째 숫자를 입력해주세요. "))
    b = int(input("두번째 숫자를 입력해주세요. " ))
    print("결과는 %d입니다." %(a*b))
elif num ==4 :
    print("나눗셈입니다.")
    a = int(input("첫번째 숫자를 입력해주세요. "))
    b = int(input("두번째 숫자를 입력해주세요. " ))
    print("결과는 %d입니다." %(a/b))
else:
    print("종료")