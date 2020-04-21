package com.test2;
interface Animal2 {
//	void breath();  람다는 인터페이스에서 한개만 가능!!
	String eat(String food); //람다가 타입으로 유추한다.
}
//class Dog2 implements Animal2 {
//	public void breath() {System.out.println("Dog");}
//}
//class Cat2 implements Animal2 {
//	public void breath() {System.out.println("Cat");}
//}

public class Test6 {

	public static void main(String[] args) {
//		Dog2 d = new Dog2();
//		d.breath();
//		Cat2 c = new Cat2();
//		c.breath();
//		Animal2 a1 = new Animal2() {
//			public void breath() {System.out.println("Dog");}
//		}; //무명클래스 : return new Animal2();를 생략한 것이라고 생각하면 됨
//		a1.breath();
		Animal2 a2 = (as) -> {System.out.println("Dog"); return "";};
		String str = a2.eat("저녁");
	}

}
