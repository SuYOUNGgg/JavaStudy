package com.test2;

class Data {
	void open() { System.out.println("Data open");}
}
class Excel extends Data {
	void open() { System.out.println("Excel open"); }
}
class Word extends Data {
	void open() { System.out.println("Word open");}
}
class TestModule {
	public void testMethod() {
		Data d = new Word();
		d.open();
	}
}
public class Test4 {

	public static void main(String[] args) {
		Excel e = new Excel();
		e.open();
		Data d = new Word();
		d.open();
	}

}
