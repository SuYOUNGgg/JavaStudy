package com.test;
class Animal2 {
	void move() {System.out.println("Animal move");}
	static void move2() {}
}
class Dog2 extends Animal2 {
	void move() { System.out.println("Dog move");}
	
}
class Cat2 extends Animal2 {
	void move() { System.out.println("Cat move");}
}
public class Test13 {
	static void goMove(Animal2 a) {
		a.move();
	}
	public static void main(String[] args) {
		Animal2 a = new Animal2();
		a.move();
		Dog2 d = new Dog2();
		d.move();
		Animal2 a2 = new Dog2();
		a2.move();
		goMove(a);
		goMove(d); //위에서 만든 함수 이렇게 쓰기
		Animal2.move2();
		

	}

}
