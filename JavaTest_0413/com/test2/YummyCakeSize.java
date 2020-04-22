package com.test2;
class Cake2 {
	public int size;

public Cake2(int sz) {
	size = sz;
}
public void showCakeSize() {
	System.out.println("Bread Ounces: "+ size);
	}
}

class CheeseCake2 extends Cake2 {
	public int size;
	public CheeseCake2(int sz1, int sz2) {
		super(sz1);
		size = sz2;
	}
	public void showCakeSize() {
		System.out.println("Bread Ounces: "+ super.size);
		System.out.println("Cheese Ounces: "+ super.size);
	}
}
class YummyCakeSize {

	public static void main(String[] args) {
		CheeseCake2 ca1 = new CheeseCake2(5,7);
		Cake2 ca2 = ca1;
		
		System.out.println("Bread Ounces: " + ca2.size);
		System.out.println("Cheese Ounces: " + ca1.size);
		System.out.println();
		
		ca1.showCakeSize();
		System.out.println();
		ca2.showCakeSize();
	}

}


