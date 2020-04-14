package com.test;
class AA{
	void aMethod() {System.out.println("aMethod");}
	
}
class BB extends AA {
	void bMethod() {System.out.println("bMethod");}
	void aMethod() {System.out.println("aMethod on BB Class");}
}
class CC extends AA {
	void cMethod() {System.out.println("cMethod");}
	void aMethod() {System.out.println("aMethod on CC Class");}
}
public class Test12 {
	static void callMethod(BB b) {
		b.aMethod();
	}
	static void callMethod(CC c) {
		c.aMethod();
	}
	static void callMethod2(AA a) {
		a.aMethod();
	}
	public static void main(String[] args) {
		callMethod(new BB());
		callMethod(new CC());
		callMethod2(new AA());
		callMethod2(new BB());
		callMethod2(new CC());
		BB b = new BB();
		b.aMethod();
		b.bMethod();
		AA a = b;
		a.aMethod();
		BB b1 = (BB)a; //상위에서 다시 하위로 내려옴
		b1.aMethod();
		b1.bMethod();
		
		AA a1 = new BB(); //이렇게 많이 씀.
		a1.aMethod();
		
		AA a2 = new CC();
		a2.aMethod();
		
		CC c = new CC();
		c.aMethod();
		c.cMethod();
		AA a3 = c;
		a3.aMethod();
		CC c2 = (CC)a3;//상위에서 다시 하위로 내려옴
		c2.aMethod();
		c2.cMethod();
		
		
		

	}

}
