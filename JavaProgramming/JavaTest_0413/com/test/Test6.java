package com.test;

class A {
	int aValue;
	public A() {
		System.out.println("Default Constructor A");
		this.aValue = 10;
	}
	public A(int aValue) {
		System.out.println("Constructor A");
		this.aValue = 10;
		
		}
	}

class B extends A {
	int bValue;
	public B() {
		System.out.println("Default Constructor B");
		this.bValue = 100;
	}
	public B(int bValue) {
		super(300); //super 상위클래스 지칭
		this.bValue = bValue;
		System.out.println("Constructor B " + bValue + "," + this.aValue);
	}
}

public class Test6 {

	public static void main(String[] args) {
//		A a = new A();
//		B b = new B();
		A c = new B();   //이거랑 밑에꺼랑 둘다 상위 생성자는 무조건 산출된다.
		B b1 = new B(20);
		
		

	}

}
