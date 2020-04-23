package com.test2;
class Outer {
	private static int num =0; 
	static class Nested1 {   //이너클래스에 static 있음
		void add(int n) {
			num += n;
		}
	}
	static class Nested2 {
		int get() {
			return num; 
		}
	}
}
class StaticNested {

	public static void main(String[] args) {
		Outer.Nested1 nst1 = new Outer.Nested1(); //static 때문에 바로 참조 가능.
		nst1.add(5);
		
		Outer.Nested2 nst2 = new Outer.Nested2();
		System.out.println(nst2.get());

	}

}
