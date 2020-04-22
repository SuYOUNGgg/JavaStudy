
class Shape {
	void draw() {
		System.out.println("draw shape");		
	}
}
class Circle extends Shape {
	void draw() {
		System.out.println("draw Circle");
	}
}
class Rectangle extends Shape {
	void draw() {
		System.out.println("draw Rectangle");
	}
}

public class Test4 {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();

		Shape a = c; //c가 Shape의 타입을 받기 위해
		a.draw(); //하지만 인스턴스는 circle꺼 참조!
		
		Rectangle r = new Rectangle();
		r.draw();
		Shape a2 = r;
		a2.draw();
		
		Shape[] s3 = new Shape[3];
		s3[0] = new Shape();
		s3[1] = new Circle();
		s3[2] = new Rectangle();
		for(Shape s : s3) {
			s.draw();
			
		
		}
	}

}
