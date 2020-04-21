package com.test2;

public class Test2 {

	public static void main(String[] args) {
		for(Menu m : Menu.values()) {
			System.out.println(m.value);
		}
		int value = Menu.valueOf("Pizza").value;
		System.out.println(value);

	}

}
