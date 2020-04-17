package com.test2;

public class Test1 {

	public static void main(String[] args) {
		try {
			int a = 1/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("End");
		}

	}

}
