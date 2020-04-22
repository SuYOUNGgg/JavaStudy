
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

		Shape a = c; //c�� Shape�� Ÿ���� �ޱ� ����
		a.draw(); //������ �ν��Ͻ��� circle�� ����!
		
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
