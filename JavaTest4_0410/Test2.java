
public class Test2 {
	// public, private, protected, default(x)
	
	void test() {}  //static�� ������ ��üȭ�� �ȵǾ �ν��Ͻ��� �ƴϱ� ������ �̰� �� �� ����
	static void test2() {}
	public static void main(String[] args) {
		Test2.test2();
		test2(); //���� �� �� ����
		Test2 t = new Test2();
		t.test();

	}

}
