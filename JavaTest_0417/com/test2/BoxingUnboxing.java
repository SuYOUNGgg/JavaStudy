package com.test2;

class BoxingUnboxing {

	public static void main(String[] args) {
		Integer iObj = new Integer(10);  //박싱: 값을 인스턴스에 감싸는 행위
		Double dObj = new Double(3.14);
		System.out.println(iObj);
		System.out.println(dObj);
		System.out.println();
		
		int num1 = iObj.intValue();  //언박싱: 인스턴스에 저장된 값을 꺼내는 행위
		double num2 = dObj.doubleValue();
		System.out.println(num1);
		System.out.println(num2);
		System.out.println();
		
		iObj = new Integer(iObj.intValue() +10);
		dObj = new Double(dObj.doubleValue() +1.2);
		System.out.println(iObj);
		System.out.println(dObj);

	}

}
