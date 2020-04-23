package com.test0416;
//class�� interface�� ����ϴ� ������ '����'
interface Animal {
	void breath();//�߻�޼ҵ�(��ü�� �������)
	
}

class Dog implements Animal {
	public void breath() {//�����޼ҵ�
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
//		Animal a = new Animal(); class�� interface�� �Ȱ��� �޼ҵ尡 �������� ������ ��üȭ ���� ����.
		Dog d = new Dog(); 
		Animal a = d; //�̷������� class���� ȣ���� ������ �ؾ���.
		a.breath();
		
		Animal c = new Cat(); //���� ������ ���� �ѹ��� ���� ��
		c.breath();
		
		test(new Dog());
		test(new Cat());
	}

}
