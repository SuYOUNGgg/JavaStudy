package com.test0416;

class MyException extends Exception {
	public MyException() {
		super("���� ����ó���Դϴ�.");
	}
}
//���� ����ó�� ���� ���� ���
public class Test9 {

	public static void main(String[] args) throws MyException {
		int n =3;
		if(n == 3) {
			throw new MyException();
		}

	}

}
//try catch ���� ���
//public class Test9 {
//
//	public static void main(String[] args) {
//		int n =3;
//		if(n == 3) {
//			try {
//				throw new MyException();
//			} catch (MyException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}