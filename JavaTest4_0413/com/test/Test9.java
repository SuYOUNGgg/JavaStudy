package com.test;
class MyClass3 {
	int a;
	static int b;
	public MyClass3() {
	}
	public static void setAValue(int x) {
		b = x;
		
	}
	public void setBValue(int y) {
		a = y;
		setAValue(10);
		//this.b�� �Ұ��� b�� static�̱� ����, setAValue �� static������ �޼ҵ忩�� ����
	}
}

public class Test9 {

	public static void main(String[] args) {
		MyClass3.b = 20;
		MyClass3 m= new MyClass3();
		m.a = 10;  //a�� ������ ���� ���� �ܺκ����� �����;� �����ϴ�. 
		m.b =20;
		

	}

}
