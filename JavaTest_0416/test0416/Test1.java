package com.test0416;

class Student {
//�ν��Ͻ� ��������
//	private String name; //private���������ڴ� Ŭ���� �������� ���� ����
	protected String name;
	protected int age; //protected���������ڴ� ��ӵ� ���迡���� ���� ����
//������	
	public Student() { //public���������ڴ� ��𼭵� ���� ����
		this.name = "ȫ�浿";
		this.age = 20;
	}
//�����ڸ� �����ε� �� ���
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
//�޼ҵ� ����
	public void studying() {
		System.out.println("Student studying");
	}
//�޼ҵ带 �����ε� �� ���
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

	public static void main(String[] args) {  //void�� �޼ҵ� ������ �� return���� ���� �ܿ� ���
//		Student stu = new Student(); //�ν��Ͻ� ����
//		MiddleStudent midStu = new MiddleStudent();
		MiddleStudent midStu2 = new MiddleStudent("������", 30, 50);
		midStu2.studying();
		midStu2.playingGame();
		
		Student Stu3 = new MiddleStudent("����", 50, 60); //������ ������ �����Ѱ�
		Stu3.studying("����");
		Stu3.studying();
		MiddleStudent stu3 = (MiddleStudent)Stu3; //������ ������ ������ ��
		stu3.playingGame();
		
	}

}
