package com.test2;
//�̳�Ŭ���� ����� (Ŭ���� �ȿ� Ŭ���� ���� �� ����)
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
//		School.Student s2 = new School.Student(); �̷��� ���� �ȵ� �ؿ�ó�� ����� ���� Student�տ� static�� ������ ����
		School.Student s3 = s.new Student();
		s3.msg();
		
		School2.Student2 s2 = new School2.Student2();
		s2.msg();
		
		

	}

}
