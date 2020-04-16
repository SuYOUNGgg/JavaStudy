package com.test0416;

abstract class Animal11 {
	public abstract void breath(); //이건 구현안되어 있음 Dog클래스에 구현됨
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
