package com.test2;
import java.util.Arrays;

class Person implements Comparable {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int compareTo(Object o) {
	Person p = (Person)o;
		if(this.name.length() > p.name.length())
			return 1;
		else if(this.name.length() < p.name.length())
			return -1;
		else
			return 0;
	}
	public String toString() {
		return name + ": " + age;
	}
}

class ArrayObjSort {

	public static void main(String[] args) {
			Person[] ar = new Person[3];
			ar[0] = new Person("Le", 29);
			ar[1] = new Person("Goo", 15);
			ar[2] = new Person("Sooo", 37);
			
			Arrays.sort(ar);
			for(Person p : ar)
				System.out.println(p);

	}

}
