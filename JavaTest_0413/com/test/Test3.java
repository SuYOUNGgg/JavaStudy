package com.test;


class Calculator {
	int result;
	public Calculator() { //생성자, result를 하나로 통일함
		result = 0; //초기값
		
	}
//	public Calculator(int r) { //위에 처럼해도 되고, 이런식으로 해됨 Calculator()안에 넣는 변수에 따라 산출되는 값이 달라짐 : Overloading
//		result = r;  //result값을 호출하기 위함
//	}					
 	int add(int a, int b) {
		result = a + b; //이런식에서는 출력이 하나의 값밖에 안됨
		return result;
	}
	int substract(int a, int b) {
		result = a - b;
		return result;
	}
//Method Overloading
	int add(int a, int b, int c) {
		result = a+b+c;
		return result;
	}
}

public class Test3 {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int a = 1;
		int b = 2;
		int result = calc.add(a, b); //여기의 a,b는 main안에서만 사용되는 변수로써, 위의 Calculator class에서 사용된 a,b와는 다른 변수임
		System.out.println(result);
		
		int x = 1;
		int y = 3;
		int z = 4;
		result = calc.add(x, y, z);
		System.out.println(result);
		
		
		
	}

}
