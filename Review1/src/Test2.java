class Calc {
	public int add(int a, int b) {
		return a+b;
	}
	public static int substract(int a, int b) { //static있으면 객체화 과정 없어도 호출된다.
		return a - b;
	}
}


public class Test2 {
	static int add2(int x, int y) {
		return x+y;
	}

	public static void main(String[] args) {
		Calc c = new Calc();
		int d = c.add(4, 5); //int d 새로 선언 안하면 c 출력할 떄 결과값이 아니라 주소가 나옴
		System.out.println(d);
		
		int d1 = Calc.substract(3,4);
		System.out.println(d1);
		c.substract(3,4);

		Test2.add2(3, 5);
		add2(3,4);
	}

}
