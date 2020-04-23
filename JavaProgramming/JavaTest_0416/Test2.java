package com.test;
class Animal {}
class Dog extends Animal {
	

}
public class Test2 {

	public static void main(String[] args) {
		Animal a = new Dog();
		if(a instanceof Dog) {  //확인할 때
			Dog d = (Dog)a;
		}
	}

}
