package com.test1;
import java.util.Arrays;
import java.util.*;

class Student2 implements Comparable {
	public int age;
	public Student2(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Object o) {
		Student2 stu = (Student2)o;
		if(this.age > stu.age)
			return 1;
		else if(this.age < stu.age)
			return -1;
		else 
			return 0;
	}
}

public class Test2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		Student2[] stuArr = new Student2[3];
		stuArr[0] = new Student2(1);
		stuArr[1] = new Student2(3);
		stuArr[2] = new Student2(2);
		
		for(int inx=0; inx<stuArr.length; inx++) {
			Student2 s = stuArr[inx];
			System.out.println(s.age);
		}
		System.out.println("");
		for(Student2 s : stuArr) {
			System.out.println(s.age);
		}
		Arrays.sort(stuArr);
		for(Student2 s : stuArr) {
			System.out.println(s.age);
		}
		
		List<Student2> stu2 = new ArrayList<>();
		stu2.add(new Student2(1));
		stu2.add(new Student2(3));
		stu2.add(new Student2(2));
		
		for(int jnx=0; jnx<stu2.size(); jnx++) {
			System.out.println(stu2.get(jnx).age);
		}
		for(Student2 s : stu2) {
			System.out.println(s.age);
		}
		Iterator<Student2> ltr = stu2.iterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next().age);
		}
		
		Collections.sort(stu2);
		for(Student2 s : stu2) {
			System.out.println(s.age);
		}
	}

}
