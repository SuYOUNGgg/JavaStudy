package com.test;

public abstract class Shape { //추상클래스(상속개념) : 구현하는 것을 상속클래스에서 하는 것
	public abstract void draw(int x, int y);
	public void clear() {System.out.println("Clear");}
	}

