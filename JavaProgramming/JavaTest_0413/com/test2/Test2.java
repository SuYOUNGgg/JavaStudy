package com.test2;
class Cake3 {
	void showCakeSize3() {
		System.out.println("CakeSize");
		
	}
	void showCake3() { System.out.println("CakeSize");
}
class CheeseCake3 extends Cake3 {
	void showCakeSize3() {
		System.out.println("CheeseCakeSize");
	}
}
public class Test2 {

	public void main(String[] args) {
		CheeseCake3 c = new CheeseCake3();
		c.showCakeSize3(); 
		Cake3 c2 = new CheeseCake3();
		c2.showCake3();
	}
}
}


