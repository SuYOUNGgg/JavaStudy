package com.test2;

import java.util.Arrays;

class Student implements Comparable { //���������� �ٸ� ��ü���� ���� ������ ���� �� �ʿ���
	int rollno;
	String name;
	int age;
	public Student(int rollno, String name, int age) {
		this.rollno =rollno;
		this.name = name;
		this.age = age;
	}
	public int compareTo(Object o) { //��ü�� ���� ���� ����
		Student s = (Student)o;
		if(this.age == s.age)
			return 0;
		else if(this.age > s.age)
			return 1;
		else
			return -1;
	}
//	public String toString() {			�̸����� ����ϰ� ���� �� �ּҷ� �ȳ����� �Ϸ��� �� �������.
//		return name;
//	}						
}

public class Test6Comparable {

	public static void main(String[] args) {
		Student[] stu = new Student[3];
		
		stu[0] = new Student(1, "ȫ�浿", 21);
		stu[1] = new Student(2, "�̼���", 11);
		stu[2] = new Student(3, "������", 43);
		
		Arrays.sort(stu);
		for(Student s : stu) //�����Լ��� �Լ� �ȿ� ���ٸ� �� ���� {} ���� �Ƚᵵ ��.
		System.out.println(s.age); // ���̸� �������� �����ϰ� ��
//		System.out.println(s);
		
	}

}
