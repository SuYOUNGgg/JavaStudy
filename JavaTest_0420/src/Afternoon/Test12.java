package Afternoon;
import java.util.List;
import java.util.ArrayList;

abstract class Shape{
	abstract void draw();
	
}
class Rectangle extends Shape {
	void draw() {System.out.println("drawing rectangle");}
}
class Circle extends Shape {
	void draw() {System.out.println("drawing Circle");}
}

public class Test12 {
	static void drawShapes(List<? extends Shape> lists) { //하한제한된 와일드카드: Shape에 상속된 클래스들만 적용됨
		for(Shape s : lists ) {
			s.draw();
		}
	}
	public static void main(String[] args) {
		List<Rectangle> list1 = new ArrayList<Rectangle>(); 
		list1.add(new Rectangle());
		List<Circle> list2 = new ArrayList<Circle>();
		list2.add(new Circle());
		drawShapes(list1);
		drawShapes(list2);
	}

}
