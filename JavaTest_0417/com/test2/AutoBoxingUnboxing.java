package com.test2;

public class AutoBoxingUnboxing {

	public static void main(String[] args) {
		Integer iObj = 10; //오토박싱 진행
		Double dObj = 3.14;
		System.out.println(iObj);
		System.out.println(dObj);
		System.out.println();
		
		int num1 = iObj; //오토언박싱 진행
		double num2 = dObj;
		System.out.println(num1);
		System.out.println(num2);

	}

}
