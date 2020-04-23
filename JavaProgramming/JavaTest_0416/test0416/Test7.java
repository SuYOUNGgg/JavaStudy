package com.test0416;

public class Test7 {

	public static void main(String[] args) {
		try {
//			int a =3;
//			int b = 0;
//			int c = a/b; //분모에 0을 넣어서 나눴기 때문에 오류 발생.이를 해결하기 위해 try~catch사용
			
			int a[] = new int[5];
		//	a[5] = 30 / 0;
			a[5] = 0;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		
		catch(ArithmeticException e) {
			System.out.println("0으로 나누었습니다."); //오류발생하는 건 try catch안에 넣고 아닌 건 바깥으로 뺀다.
			System.out.println(e.getMessage());
			}
		catch(Exception e) {
			System.out.println("Exception");
		}
		

}
}