package com.test2;
interface Calculator {
	int add(int x, int y);
}
public class Test7 {

	public static void main(String[] args) {
		Calculator c = (a,b) -> {
			int r = a+b;
			return r;
		};  //Calculator c = (a,b) ->{ int r = a+b; , return r; }
		int r2 = c.add(1, 2);
		System.out.println(r2);

	}

}
