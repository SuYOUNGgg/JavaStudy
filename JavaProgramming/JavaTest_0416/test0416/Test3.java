package com.test0416;

interface IShape {
	void draw(int x, int y);  //추상메소드
}
class Circle implements IShape {
	public void draw(int a, int b) { //구현메소드
		System.out.println("Draw a Circle : "+ a + ", "+ b);
	}
}

class Rectangle implements IShape{
	public void draw(int a, int b) {
		System.out.println("Draw a Rectangle : "+ a + ", "+ b);
	}
}
class DrawManager {
	IShape s; //IShape s = new Circle();
	public DrawManager(IShape s) {
		this.s = s;
	}
	public void draw(int s , int t) {
		this.s.draw(s, t);
	}
}
public class Test3 {

	public static void main(String[] args) {
		DrawManager d = new DrawManager(new Circle());
		d.draw(1, 2);
		IShape d2 = new Circle();
		d2.draw(1,2);  //위의 결과와 같음. IShape 메소드를 Circle로 오버라이딩하는 과정을 DrawManager로 선언했기 때문.
		
		DrawManager d1 = new DrawManager(new Rectangle());
		d1.draw(2, 2);
	}

}
