package com.test2;

public class Test1 {
	enum Season {
		WINTER, SPRING, SUMMER, FALL
	}
	enum Light {
		ON, OFF
	}
	
	public static void main(String[] args) {
		for(Season s : Season.values()) {
			System.out.println(s);
		}
		Season s = Season.WINTER;
		Season s2 = Season.SPRING;
		System.out.println(s);
		System.out.println(s2);
		
		System.out.println(Season.valueOf("WINTER"));
		System.out.println(Season.valueOf("WINTER").ordinal()); //WINTER의 값이 출력 됨. 0번째이기 때문에 0 출력
	}

}
