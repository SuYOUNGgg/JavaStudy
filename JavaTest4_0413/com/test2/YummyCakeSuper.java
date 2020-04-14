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
		super.yummy(); //super������ ����Ŭ������ �ҷ�� ����Ŭ������ ���� ����� �ڿ� ����Ŭ������ ����� ����.
		System.out.println("Yummy Tasty Cake");
	}
}
class YummyCakeSuper {

	public static void main(String[] args) {
		CheeseCake cake = new CheeseCake();
		cake.tasty();

	}

}
