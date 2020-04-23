package Workshop2;

class SubscriberInfo {
	public String name;
	public String id;
	public String password;
	public String phoneNo;
	public String address;
	
	public SubscriberInfo() {}
	
	public SubscriberInfo(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}
	public SubscriberInfo(String name,String id, String password, String phoneNo, String address) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
}

public class WS2 {

	public static void main(String[] args) {
		SubscriberInfo obj1, obj2,obj3;
		obj1=new SubscriberInfo("������","1017db","daewi");
		obj2=new SubscriberInfo("���","baekom","white", 			"200-000-0000","north pole");
		obj3=new SubscriberInfo();
		printSubscriberInfo(obj1);
		printSubscriberInfo(obj2);
		printSubscriberInfo(obj3);
		obj1.setAddress("������1����");
		obj1.setPhoneNo("133-1234-5678");
		printSubscriberInfo(obj1);
	}
	static void printSubscriberInfo(SubscriberInfo obj){
		System.out.println("�̸�:"+obj.name);
		System.out.println("���̵�:"+obj.id);
		System.out.println("�н�����:"+obj.password);
		System.out.println("��ȭ��ȣ:"+obj.phoneNo);
		System.out.println("�ּ�:"+obj.address);
		System.out.println();


	}

}