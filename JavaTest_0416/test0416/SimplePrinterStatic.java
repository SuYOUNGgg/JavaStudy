package com.test0416;

interface Printableee {
	static void printLine(String str) {
		System.out.println(str);
	}
	default void print(String doc) {
		printLine(doc); //인터페이스의 static메소드 호출
	}
}
class Printer implements Printableee {}

class SimplePrinterStatic {

	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		Printableee prn = new Printer();
		prn.print(myDoc);
		Printableee.printLine("end of line");
	}

}
