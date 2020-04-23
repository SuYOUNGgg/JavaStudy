package com.test2;
//이너클래스 만들기 (클래스 안에 클래스 만들 수 있음)
class School {
	private int m = 10; 
	class Student {
		void msg() {System.out.println(m);}
	}
}
class School2 {
	private static int n = 12; 
	static class Student2 {
		void msg() {System.out.println(n);}
	}
}

public class Test4 {

	public static void main(String[] args) {
		School s = new School();
//		School.Student s2 = new School.Student(); 이렇게 쓰면 안됨 밑에처럼 써야함 만약 Student앞에 static이 있으면 가능
		School.Student s3 = s.new Student();
		s3.msg();
		
		School2.Student2 s2 = new School2.Student2();
		s2.msg();
		
		

	}

}
