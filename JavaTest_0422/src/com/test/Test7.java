package com.test;
import java.util.function.Predicate;  //boolean일떄의 인터페이스 (이거 import하면 밑에 인터페이스 안써도됨)
interface CheckValue{
	boolean test2(Integer a);
}

public class Test7 {
	static void check(Predicate<Integer> s, int a) {
		System.out.println(s.test(a));
		}
	
	public static void main(String[] args) {
		CheckValue c = (a)-> {
			return(a>18);
		};
		System.out.println(c.test2(20));

		
		
		Predicate<Integer> p = (a) -> (a>18);
		System.out.println(p.test(10));
		
		check((a) -> (a>18), 20);
		
		
	}
}