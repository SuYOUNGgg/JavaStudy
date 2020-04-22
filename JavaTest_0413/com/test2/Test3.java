package com.test2;

interface Cakee{
	public void showCakeSize();
}
class CheeseCakee implements Cakee {
	public void showCakeSize() {
		System.out.println("CheeseCake");
	}
}
public class Test3 {

	public static void main(String[] args) {
		CheeseCakee c = new CheeseCakee();
		c.showCakeSize();
		Cakee c2 = new CheeseCakee();
		c2.showCakeSize();

	}

}
