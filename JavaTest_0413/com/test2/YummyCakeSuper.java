package com.test2;
class Cake {
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}
class CheeseCake extends Cake {
	public void yummy() {
		super.yummy();
		System.out.println("Yummy Cheese Cake");
	}
	public void tasty() {
		super.yummy(); //super때문에 하위클래스를 불렀어도 상위클래스가 먼저 산출된 뒤에 하위클래스가 산출된 것임.
		System.out.println("Yummy Tasty Cake");
	}
}
class YummyCakeSuper {

	public static void main(String[] args) {
		CheeseCake cake = new CheeseCake();
		cake.tasty();

	}

}
