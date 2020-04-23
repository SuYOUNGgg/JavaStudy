package com.test0416;

interface Animal2 {
	void breath();
}
interface Insect2 {
	void breath();
}
//class Beetle extends Animal2, Insect2 {} 이런식으로 불가능 한번에 한개씩만 상속 가능
	
class Beetle implements Animal2, Insect2 {
	public void breath() {
		System.out.println("Breath Beetle");
	}
}

public class Test4 {

	public static void main(String[] args) {
		Animal2 a = new Beetle();
		a.breath();
		Insect2 a1 = new Beetle();
		a1.breath();

	}

}
