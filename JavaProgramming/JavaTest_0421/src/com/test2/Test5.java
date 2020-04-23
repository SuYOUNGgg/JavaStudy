package com.test2;
interface Animal1 {
	void breath();
}
class Dog implements Animal1 {
	@Override
	public void breath() {
		System.out.println("Dog breath");
	}
}

public class Test5 {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.breath();
		Animal1 a = new Animal1() {
			public void breath() {System.out.println("No");
		}
		};		
			a.breath();

	}

}
