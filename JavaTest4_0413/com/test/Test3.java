package com.test;


class Calculator {
	int result;
	public Calculator() { //������, result�� �ϳ��� ������
		result = 0; //�ʱⰪ
		
	}
//	public Calculator(int r) { //���� ó���ص� �ǰ�, �̷������� �ص� Calculator()�ȿ� �ִ� ������ ���� ����Ǵ� ���� �޶��� : Overloading
//		result = r;  //result���� ȣ���ϱ� ����
//	}					
 	int add(int a, int b) {
		result = a + b; //�̷��Ŀ����� ����� �ϳ��� ���ۿ� �ȵ�
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
		int result = calc.add(a, b); //������ a,b�� main�ȿ����� ���Ǵ� �����ν�, ���� Calculator class���� ���� a,b�ʹ� �ٸ� ������
		System.out.println(result);
		
		int x = 1;
		int y = 3;
		int z = 4;
		result = calc.add(x, y, z);
		System.out.println(result);
		
		
		
	}

}
