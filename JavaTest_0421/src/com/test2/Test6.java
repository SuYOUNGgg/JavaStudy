package com.test2;
interface Animal2 {
//	void breath();  ���ٴ� �������̽����� �Ѱ��� ����!!
	String eat(String food); //���ٰ� Ÿ������ �����Ѵ�.
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
//		}; //����Ŭ���� : return new Animal2();�� ������ ���̶�� �����ϸ� ��
//		a1.breath();
		Animal2 a2 = (as) -> {System.out.println("Dog"); return "";};
		String str = a2.eat("����");
	}

}
