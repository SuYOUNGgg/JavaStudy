package com.test;

public class Test2 {

	public static void main(String[] args) {
		String str =new String("test");
		String str1 = "test";
		String str2 = "test";
		String str3 = "test";
		if(str == str1) {
			System.out.println("Ok");
		}
		if(str1 == str2) {
			System.out.println("Ok2");
		}
		if(str.equals(str1)) {
			System.out.println("Ok3");
		}
	}

}
