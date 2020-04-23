package com.test0416;
//class가 interface를 상속하는 행위는 '구현'
interface Animal {
	void breath();//추상메소드(몸체가 비어있음)
	
}

class Dog implements Animal {
	public void breath() {//구현메소드
		System.out.println("Dog breath");
	}
	public void bark() {
		System.out.println("Dog Bark");
	}
}

class Cat implements Animal {
	public void breath() {
		System.out.println("Cat breath");
	}
	public void meow() { 
		System.out.println("Cat meow");
	}
}


public class Test2 {
	static void test(Animal a) {
		a.breath();
	}

	public static void main(String[] args) {
//		Animal a = new Animal(); class에 interface와 똑같은 메소드가 구현되지 않으면 객체화 되지 않음.
		Dog d = new Dog(); 
		Animal a = d; //이런식으로 class먼저 호출한 다음에 해야함.
		a.breath();
		
		Animal c = new Cat(); //위의 두줄의 식을 한번에 적을 때
		c.breath();
		
		test(new Dog());
		test(new Cat());
	}

}
