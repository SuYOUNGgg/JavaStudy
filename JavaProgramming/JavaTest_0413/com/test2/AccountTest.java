package com.test2;

class Account{
	private String AccountNo;
	private String AccountName;
	private int Balance;
	public static double interest; //interst�� return���ϱ� ������ void�Ⱥ���.
	
	public Account(String ANo, String ANa, int Bal) {
		AccountNo = ANo;
		AccountName = ANa;
		Balance = Bal;
	
		}
	public void deposit(int a) {
		Balance += a;
	}
	public void withdraw(int b) {
		Balance -= b;
	}
	public int addInterest() {  //�����Լ����� addInterest()�� �Ķ���Ͱ� ���� ������ ������ ���� �������ش�.
		int a= Balance;  //balance = balabce + (balance*interest);
		double b=interest;
		Balance=(int)(a+a*b);
		return Balance;
	}
	public String getAccountNo() { 
		return AccountNo;
	}
	public String getAccountName() {
		return AccountName;
	}
	public int getBalance() {
		return Balance;
	}
	
}

		

public class AccountTest {

	public static void main(String[] args) {
		
		Account customer1=new Account("111-222-33333333","������",20000);
		Account customer2=new Account("555-666-77777777","���ſ�",100000);
		System.out.println("�⺻ ������");
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("�ѹ��� �����");
		customer1.deposit(1000000);
		customer2.withdraw(30000);
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("�������� ���"); 
		Account.interest=0.05;
		customer1.addInterest(); //����� �ݾ�=����+����*������
		customer2.addInterest();//����� �ݾ�=����+����*������
		printAccount(customer1);
		printAccount(customer2);
		
		}


	
static void printAccount(Account customer){
	System.out.println("���¹�ȣ:"+customer.getAccountNo());
	System.out.println("�������̸�:"+customer.getAccountName());
	System.out.println("�ܾ�:"+customer.getBalance());
	System.out.println();
	}
}
