
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

//�޼ҵ� �����ε�: ���� �Լ����� �Ű������� ���� ���� �ٸ� �Ϳ� ���� ���� ����Ǵ� ��