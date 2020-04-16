package com.test;

public class Test4 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		for(int inx = 0; inx < arr.length; inx++) {
			System.out.println(arr[inx]);
		}
		for(int a : arr ) {
			System.out.println(a);
		}
		String[] strs = {"이순신", "홍길동", "강감찬"	};
		for(String nm : strs) {
			System.out.println(nm);
		}

}
}
