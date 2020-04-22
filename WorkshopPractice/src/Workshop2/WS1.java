package Workshop2;

class Account {
	private String AccountNum;
	private String AccountName;
	private double Balance;
	static double interest;
	
	public Account(String AccountNum,String AccountName,int Balance) {
		this.AccountNum =AccountNum;
		this.AccountName=AccountName;
		this.Balance=Balance;
	}
	public void deposit(int mDeposit) {
		this.Balance += mDeposit;
	}
	public void withdraw(int mWithdraw) {
		this.Balance -= mWithdraw;
	}
	public void addInterest() {
		Balance = Balance+(Balance*interest);
	}
	public String getAccountNo() {
		return this.AccountNum;
	}
	public String getAccountName() {
		return this.AccountName;
	}
	public double getBalance() {
		return this.Balance;
	}
		
}

public class WS1 {
public static void main(String[] args){
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

