package com.test0416;

public class Test7 {

	public static void main(String[] args) {
		try {
//			int a =3;
//			int b = 0;
//			int c = a/b; //�и� 0�� �־ ������ ������ ���� �߻�.�̸� �ذ��ϱ� ���� try~catch���
			
			int a[] = new int[5];
		//	a[5] = 30 / 0;
			a[5] = 0;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		
		catch(ArithmeticException e) {
			System.out.println("0���� ���������ϴ�."); //�����߻��ϴ� �� try catch�ȿ� �ְ� �ƴ� �� �ٱ����� ����.
			System.out.println(e.getMessage());
			}
		catch(Exception e) {
			System.out.println("Exception");
		}
		

}
}