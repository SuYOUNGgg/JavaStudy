package com.test0416;

interface Printablee {
	void print(String doc);
	default void printCMYK(String doc) {}
	
}

class Prn731Drvv implements Printablee {
	public void print(String doc) {
		System.out.println("From MD-731 printer");
		System.out.println(doc);
		
	}
}
class Prn909Drvv implements Printablee {
	public void print(String doc) {
		System.out.println("From MD-909 black & white ver");
	}
	public void printCMYK(String doc) {
		System.out.println("From MD-909 CMYK ver");
		System.out.println(doc);
	}
}

class PrinterDriverDefault {

	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		Printablee prn1 = new Prn731Drvv();
		prn1.print(myDoc);
		System.out.println();
		
		Printablee prn2 = new Prn909Drvv();
		prn2.print(myDoc);
		

	}

}
