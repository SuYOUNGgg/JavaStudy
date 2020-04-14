package com.test2;
class A {
	//final void aMethod() {System.out.println("aMethod");}
	void aMethod() { System.out.println("aMethod");}
}
class B extends A {
	void bMethod() { System.out.println("bMethod");}
	void aMethod() { System.out.println("aMethod on B Class");}
}
class C extends B {
	void cMethod() { System.out.println("bMethod");}
	void aMethod() { System.out.println("aMethod on C Class");}
}
public class Test1 {

	public static void main(String[] args) {
		A a = new C();
		a.aMethod(); // 결론적으로 오버라이딩된 부분이 산출된다.

	}

}
