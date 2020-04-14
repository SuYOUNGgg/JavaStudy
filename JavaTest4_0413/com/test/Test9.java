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
		//this.b는 불가능 b만 static이기 때문, setAValue 는 static이지만 메소드여서 가능
	}
}

public class Test9 {

	public static void main(String[] args) {
		MyClass3.b = 20;
		MyClass3 m= new MyClass3();
		m.a = 10;  //a를 쓰려면 위와 같이 외부변수를 가져와야 가능하다. 
		m.b =20;
		

	}

}
