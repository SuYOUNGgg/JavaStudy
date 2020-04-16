package com.test0416;

interface Printable1 {
	void print(String doc); 
}

interface ColorPrintable extends Printable {
	void printCMYK(String doc);
}

class Prn909Drv implements ColorPrintable {
	public void print(String doc) {
	System.out.println("From MD-909 black & white ver");
	System.out.println(doc);
}
	
public void printCMYK(String doc) {
	System.out.println("From MD-909 CMYK ver");
	System.out.println(doc);
	}
}
class PrintDriverExtends {

	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		ColorPrintable prn = new Prn909Drv();
		prn.print(myDoc);
		System.out.println();
		prn.printCMYK(myDoc);
	}

}
