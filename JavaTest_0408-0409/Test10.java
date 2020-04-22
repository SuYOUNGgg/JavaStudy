
public class Test10 {

	static int add(int x, int y) {
		int z = x+y;
		return z;
		
	}
	static int add(int x, int y, int z) {
		int s = x + y + z;
		return s;
	}
	static String add(String a) {
		return "";
	}


	public static void main(String[] args) {
		add(1,2);
		add(1,2,4);
		add("test");
		
	}
}

//메소드 오버로딩: 같은 함수여도 매개변수의 수와 형이 다른 것에 따라 값이 산출되는 것