# a = int(input("첫번째 숫자 : "))
# b = int(input("두번째 숫자 : "))
# c = int(input("세번째 숫자 : "))
# if a > b and a > c:
#     print("a는 가장 크다.")
# if b > a and b > c:
#     print("b는 가장 크다.")
# if c > a and c > a:
#     print("c는 가장 크다.")

# 

# name = input("당신의 이름을 입력해주세요. : ")
# if name == "홍길동":
#     print("당신은 홍길동이군요.")
# elif name =="이순신":
#     print("당신은 이순신입니다.")
# elif name == "강감찬":
#     print("당신은 강감찬입니다.")
# else:
#     print("누구세요?")


# #숫자를 입력받아서 해당하는 구구단을 출력하시오.
i=1
num = int(input("숫자를 입력해주세요."))
while i <= 9:
    print("%d * %d = %d \n" % (num, i, num*i))
    i = i +1   
    
import time
while True:
    n = int(input("Choice the number : "))
    if n == 0:
        print("Sleep 3 seconds from now on ...")
        time.sleep(2)
        print("Terminated")
        break



