class Calc {
	public int add(int a, int b) {
		return a+b;
	}
	public static int substract(int a, int b) { //static������ ��üȭ ���� ��� ȣ��ȴ�.
		return a - b;
	}
}


public class Test2 {
	static int add2(int x, int y) {
		return x+y;
	}

	public static void main(String[] args) {
		Calc c = new Calc();
		int d = c.add(4, 5); //int d ���� ���� ���ϸ� c ����� �� ������� �ƴ϶� �ּҰ� ����
		System.out.println(d);
		
		int d1 = Calc.substract(3,4);
		System.out.println(d1);
		c.substract(3,4);

		Test2.add2(3, 5);
		add2(3,4);
	}

}
