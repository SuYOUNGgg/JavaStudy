package com.test0416;

abstract class Animal11 {
	public abstract void breath(); //�̰� �����ȵǾ� ���� DogŬ������ ������
	public void eat() {
		System.out.println("Animal eat");
		}
}
class Dog111 extends Animal11 {
	public void breath() {
		System.out.println("Dog breath");
		}
	}


public class Test5 {
	public static void main(String[] args) {
		Animal11 a = new Dog111();
		a.breath();
		a.eat();
		
	}
}
