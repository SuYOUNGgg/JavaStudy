package com.test;
class Animal {}
class Dog extends Animal {
	

}
public class Test2 {

	public static void main(String[] args) {
		Animal a = new Dog();
		if(a instanceof Dog) {  //Ȯ���� ��
			Dog d = (Dog)a;
		}
	}

}
