package com.test;
class Student4 {
	String name;
	public Student4(String name) {
		this.name = name;
		
	}
}
class MiddleStudent4 extends Student4 {
	int age;
	public MiddleStudent4(String name, int age) {
		//this.name = name;
		super(name);
		this.age = age;
		System.out.println(name + "," + age);
	}
	
}

public class Test7 {

	public static void main(String[] args) {
		MiddleStudent4 stu = new MiddleStudent4("ȫ�浿", 20);
		
	}

}
//�ڹٴ� ���ϻ�Ӹ� ����