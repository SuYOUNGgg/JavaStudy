package com.test;
//class정의는 public, default만 가능
public class MyClass {
// public, private, protected, default
	public int a; 
	private int b; //
	protected int c; //하위에서만 접근가능, 
	int d; //아무것도 접근자 안쓰면 default: 패키지에서만 접근가능
	public void aMethod() {}
	private void bMethod() {}
	protected void cmethod() {}
	void dMethod() {}

	}

