package com.test2;

public class Test3 {
	
//array와 가변인자의 차이는 무엇일까?
	static void test1(String[] str) { //String[] str = a;
		for(int inx = 0; inx < str.length; inx++) {
			System.out.println(str[inx]);
		}
	}
	static void test2(String...str2) { //String[] str2 = {"1","2","3","4"}
		for(int inx = 0; inx < str2.length; inx++) {
		System.out.println(str2[inx]);
		}
	}
	public static void main(String[] args) {
		String[] a = {"1","2","3","4"};
//		test1("1","2","3","4"); 위에처럼 호출해야한다.이렇게 쓰면 array가 아니기 때문
		test2("1","2","3"); //가변인자는 이렇게 값만 주면 자동으로 어레이된다.

	}

}
