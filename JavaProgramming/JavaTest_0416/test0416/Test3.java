package com.test0416;

interface IShape {
	void draw(int x, int y);  //�߻�޼ҵ�
}
class Circle implements IShape {
	public void draw(int a, int b) { //�����޼ҵ�
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
		d2.draw(1,2);  //���� ����� ����. IShape �޼ҵ带 Circle�� �������̵��ϴ� ������ DrawManager�� �����߱� ����.
		
		DrawManager d1 = new DrawManager(new Rectangle());
		d1.draw(2, 2);
	}

}
