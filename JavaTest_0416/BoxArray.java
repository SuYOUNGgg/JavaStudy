package com.test;
class Boxx  extends Object{ 
	private String conts;
	
	Boxx(String cont) {
		this.conts =cont;
	}
	public String toString() {  //�� �κ��� ������ ���� �ּҷ� ����ȴ�.  �����Լ� �ٷ� ���� static void println2(Object O) {
		return conts;			//											System.out.println(o.toString());
								//										�̷��� �ᵵ ���� ���
	}
}

class BoxArray {

	public static void main(String[] args) {
		Boxx[] ar = new Boxx[3];
		
		ar[0] = new Boxx("First");
		ar[1] = new Boxx("Second");
		ar[2] = new Boxx("Thirs"); //������ �ϴ� ��
	
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		
		String[] arr = {"1","2","3"}; //������ �ʱ�ȭ ���� �ϴ� ��
		System.out.println(arr[0]);
		Object o = new Object();
		
	}

}
