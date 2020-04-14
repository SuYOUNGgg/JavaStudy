package com.test;

class Student5 {
	String name;
	int grade;
	int age;
	public Student5(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
}
class HighStudent5 extends Student5 {
	public HighStudent5(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}
	void setNameAge(String name, int age) {
		
	}
	void study() {
		System.out.println(name + "," + age + "," + grade);
	}
}

public class Test11 {

	public static void main(String[] args) {
		HighStudent5 stu = new HighStudent5("ȫ�浿", 20, 1);
		stu.study();
		
	}

}
