package com.test;
class MyClass {
	static int count; //static을 뺴면 값이 증가하지 않음. 그냥 int count;일 경우는 해당 클래스 안에서만 의미가 있기 때문에 각자 산출되기 때문에 증가하지 않는 것이다.
	public MyClass() {
		count++;
		System.out.println(count);
	}
}

public class Test8 {

	public static void main(String[] args) {
		MyClass M = new MyClass();
		MyClass M2 = new MyClass();
		MyClass M3 = new MyClass();
		MyClass.count = 100;
		MyClass.count = 200;
	}

}
