package com.test0416;

import java.io.IOException;

class MyClass {
	void method() throws IOException {
		throw new IOException("device error");
	}
}

public class Test8 {

	public static void main(String[] args) throws IOException {
		MyClass c = new MyClass();
		c.method();
		
//		int a = 1;
//		int b = 0;
//		int c = a / b;
//		throws new ArithmeticException();  //throw는 만들어주는것, throws는 예외를 그냥 넘기겠다는 뜻

	}

}
