class Calculator:
    print("#########계 산 기#########")
    print("##########################")
    print("# 1. 덧셈")
    print("# 2. 뺄셈")
    print("# 3. 나눗셈")
    print("# 4. 곱셈")
    print("# 5. 종료")
    print("##########################")
    def __init__(self):
        pass
    def Cal(self):
        num = 0
        num = int(input("#원하는 메뉴를 선택해주세요. [1-5] : " ))
        a = int(input("첫번째 숫자를 입력해주세요. "))
        b = int(input("두번째 숫자를 입력해주세요. " ))
        if num ==1:
            print("결과는 %d입니다." %(a+b))
        elif num ==2:
            print("결과는 %d입니다." %(a-b))
        elif num ==3:
            print("결과는 %d입니다." %(a*b))
        elif num ==4 :
            print("결과는 %d입니다." %(a/b))
        else:
            print("종료")
c = Calculator()
c.Cal()







