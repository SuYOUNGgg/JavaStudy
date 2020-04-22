package com.test;

class Dog{
	public Dog() {
		age = 1;
		color = "Black";
		System.out.println("Default Constructor Dog");
	}  //초기화해줌 
	public Dog(int ag, String clr) {
		age = ag;
		color = clr;
	}
	String breed;
	int age;
	String color;  //앞에 static이 있을 경우: 어느 클래서에서라도 접근할 수 있음
	void barking() {}
	int hungry() {int a =1; int b =2; int c = a + b; return c;}//여기서 c가 integer 형태기 때문에 hungry도 int로 바꿔준다.
	void steeping() {}

	
}  //이런식으로 메인클래스에서 분리시켜주면 그 밖에서도 쓸 수 있음

public class Test1 {

	public static void main(String[] args) {
		Dog d = new Dog();//이런식으로 호출하는 순간 메인에서 호출된 클래스를 메모리에 올림  d는 참조변수
		Dog d2 = new Dog(2, "땡칠이");
		d.hungry();//hungry를 호출하면 위로 올라가서 값이 산출됨
		//String s = d.hungry() 이렇게 쓰면 타입이 안맞아서 오류생김(hungry는 int이기 때문)
		int s = d.hungry();
	}

}
