package com.test;

class Dog{
	public Dog() {
		age = 1;
		color = "Black";
		System.out.println("Default Constructor Dog");
	}  //�ʱ�ȭ���� 
	public Dog(int ag, String clr) {
		age = ag;
		color = clr;
	}
	String breed;
	int age;
	String color;  //�տ� static�� ���� ���: ��� Ŭ���������� ������ �� ����
	void barking() {}
	int hungry() {int a =1; int b =2; int c = a + b; return c;}//���⼭ c�� integer ���±� ������ hungry�� int�� �ٲ��ش�.
	void steeping() {}

	
}  //�̷������� ����Ŭ�������� �и������ָ� �� �ۿ����� �� �� ����

public class Test1 {

	public static void main(String[] args) {
		Dog d = new Dog();//�̷������� ȣ���ϴ� ���� ���ο��� ȣ��� Ŭ������ �޸𸮿� �ø�  d�� ��������
		Dog d2 = new Dog(2, "��ĥ��");
		d.hungry();//hungry�� ȣ���ϸ� ���� �ö󰡼� ���� �����
		//String s = d.hungry() �̷��� ���� Ÿ���� �ȸ¾Ƽ� ��������(hungry�� int�̱� ����)
		int s = d.hungry();
	}

}
