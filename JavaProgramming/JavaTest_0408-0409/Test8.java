// method, function, procedure
//�޼ҵ�, �Լ�, ���ν���
public class Test8 {
	static int add(int x, int y) { //void�� ���� ������ ��ȯ�� ����
		int z = x + y; 
		return z;//�Է��� int�� �߱� ������ ��µ� int�� �ؾ���
	}
	public static void main(String[] args) { //void�� ��ȯ�� ����
//		int a = 1;//�Է�
//		int b = 2;//�Է�
//		int c = a+ b;//���
//		
//		int a1 = 2;
//		int b1 = 3;
//		int c1 = a1+ b1;
		
		int c2 = add(1,2);
		int c3 = add(3,4); //�̷��� ������ ���� ������ �Ƚᵵ��
		System.out.println(c2 + "," + c3);
	}

}
