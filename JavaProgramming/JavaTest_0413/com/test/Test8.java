package com.test;
class MyClass {
	static int count; //static�� ���� ���� �������� ����. �׳� int count;�� ���� �ش� Ŭ���� �ȿ����� �ǹ̰� �ֱ� ������ ���� ����Ǳ� ������ �������� �ʴ� ���̴�.
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
