package com.test2;

public class Test4 {

	public static void main(String[] args) {
		String str ="test";
		String str1 = "test";
		if(str==str1) {
			System.out.println("O.K");
		}
		String str2 = new String("test");
		String str3 = new String("test");
		if(str2 == str3) {  // '==' �� �ּҸ� ���ϴ� ���̰�, equals�� ���� ���Ѵ�.
			System.out.println("O.K2");
		}
		if(str2.equals(str3)) {
			System.out.println("O.K3");
		}
	}

}
