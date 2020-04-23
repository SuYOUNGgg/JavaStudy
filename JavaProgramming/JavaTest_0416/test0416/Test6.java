package com.test0416;
//abstract (추상클래스) : 하나 이상의 추상 메소드를 갖는 클래스
interface IAnimal {
	public void breath();
}
abstract class Dog2 implements IAnimal {
	public abstract void breath();// abstract안 써줄 경우 여기에 {} 해줘야함
}

class Dog3 extends Dog2 {
	public void breath() {
		System.out.println("Dog3 breath");
	}
}
public class Test6 {

	public static void main(String[] args) {
		IAnimal a = new Dog3();
		a.breath();

	}

}
