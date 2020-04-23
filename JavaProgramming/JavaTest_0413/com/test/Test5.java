package com.test;

class Student2 {
	String name;
	int age;
	public void setName(String name) {
//		name = name; 이렇게 쓸 경우 충돌할 수 있음. 따라서 밑에 처럼 this를 붙인다.
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
		
	}
}

public class Test5 {

	public static void main(String[] args) {
		Student2 stu = new Student2();
		stu.setName("홍길동");
		stu.setAge(30);
		
		
	}

}
