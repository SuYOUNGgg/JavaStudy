package com.test;
class MyClass {
	String m;
	void mMethod() {}
}

public class Test3 {

	public static void main(String[] args) {
		int[] arr; //참조변수 선언
		arr =  new int[3]; //int형 값 3개를 저장할 수 있는 인스턴스 생성
		
		int[] arr2 = new int[3];  //위에 쓴걸 다르게 표현한 것. 결론적으로 같음.
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		
		for(int inx = 0; inx < arr2.length; inx++) {
			System.out.println(arr2[inx]);
		}
		
		MyClass[] arr3;
		arr3 = new MyClass[3];
		arr3[0] = new MyClass();
		arr3[1] = new MyClass();
		arr3[2] = new MyClass();
		arr3[0].m = "홍길동";
		System.out.println(arr3[0].m);
	}

}
