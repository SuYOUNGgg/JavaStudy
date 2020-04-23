package com.test0416;

class MyException extends Exception {
	public MyException() {
		super("나의 예외처리입니다.");
	}
}
//나의 예외처리 문구 넣은 경우
public class Test9 {

	public static void main(String[] args) throws MyException {
		int n =3;
		if(n == 3) {
			throw new MyException();
		}

	}

}
//try catch 넣은 경우
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