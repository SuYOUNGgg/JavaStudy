package com.test0416;

class Student {
//인스턴스 변수선언
//	private String name; //private접근지시자는 클래스 내에서만 접근 가능
	protected String name;
	protected int age; //protected접근지시자는 상속된 관계에서만 접근 가능
//생성자	
	public Student() { //public접근지시자는 어디서든 접근 가능
		this.name = "홍길동";
		this.age = 20;
	}
//생성자를 오버로딩 한 경우
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
//메소드 선언
	public void studying() {
		System.out.println("Student studying");
	}
//메소드를 오버로딩 한 경우
	public void studying(String msg) {
		System.out.println("Student studying"+ msg);
	}
}

class MiddleStudent extends Student {
	int grade;
	public MiddleStudent() {
		this.age = 40;
		this.grade = 50;

		
	}
	public MiddleStudent(String name, int age, int grade) {
		this.age = age;
		this.grade = grade;
	}
	public void playingGame() {
		System.out.println("MiddleStudent playingGame");
	}
}

public class Test1 {

	public static void main(String[] args) {  //void는 메소드 선언할 떄 return값이 없을 겨우 사용
//		Student stu = new Student(); //인스턴스 생성
//		MiddleStudent midStu = new MiddleStudent();
		MiddleStudent midStu2 = new MiddleStudent("강감찬", 30, 50);
		midStu2.studying();
		midStu2.playingGame();
		
		Student Stu3 = new MiddleStudent("권율", 50, 60); //하위를 상위로 선언한것
		Stu3.studying("권율");
		Stu3.studying();
		MiddleStudent stu3 = (MiddleStudent)Stu3; //상위를 하위로 선언한 것
		stu3.playingGame();
		
	}

}
