package com.test2;

import java.util.Arrays;

class Student implements Comparable { //숫자형말고 다른 객체들의 정렬 기준을 만들 때 필요함
	int rollno;
	String name;
	int age;
	public Student(int rollno, String name, int age) {
		this.rollno =rollno;
		this.name = name;
		this.age = age;
	}
	public int compareTo(Object o) { //객체의 정렬 기준 만듦
		Student s = (Student)o;
		if(this.age == s.age)
			return 0;
		else if(this.age > s.age)
			return 1;
		else
			return -1;
	}
//	public String toString() {			이름으로 출력하고 싶을 때 주소로 안나오게 하려면 꼭 써줘야함.
//		return name;
//	}						
}

public class Test6Comparable {

	public static void main(String[] args) {
		Student[] stu = new Student[3];
		
		stu[0] = new Student(1, "홍길동", 21);
		stu[1] = new Student(2, "이순신", 11);
		stu[2] = new Student(3, "강감찬", 43);
		
		Arrays.sort(stu);
		for(Student s : stu) //조건함수는 함수 안에 한줄만 쓸 때는 {} 굳이 안써도 됨.
		System.out.println(s.age); // 나이를 기준으로 정렬하게 됨
//		System.out.println(s);
		
	}

}
