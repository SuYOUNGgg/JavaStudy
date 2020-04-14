
public class Test2 {
	// public, private, protected, default(x)
	
	void test() {}  //static이 없으면 객체화가 안되어서 인스턴스가 아니기 때문에 이건 쓸 수 없음
	static void test2() {}
	public static void main(String[] args) {
		Test2.test2();
		test2(); //위에 둘 다 가능
		Test2 t = new Test2();
		t.test();

	}

}
