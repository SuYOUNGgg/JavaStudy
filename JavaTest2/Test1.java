//Local variable �Լ��ȿ� ���Ǵ� ����. ���⼭�� str�̳� a2���� �͵�
//Instance variable ��� �޼ҵ忡�� ���� ���� �������� ���ϴ� �� ���⼭�� A  
//static variable 
class A{
	int data = 50; //instance����
	static int m = 100; //static����
	void method() {
		int n = 90; //local����
	}
}

class Student{
	public String name;
	public int age;
	public void goSchool() {
		System.out.println(name + "�� �б��� ����.");
	}
}
public class Test1 {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "�̼���";
		stu.age= 20;
		stu.goSchool();

		System.out.println(A.m);
		A.m =200; //���� �޼ҵ忡�� ������ ���� �� �ٲٱ�
		System.out.println(A.m); 
		A a2 = new A();
		System.out.println(a2.data);
		
		String str = "1234";
		int a = Integer.parseInt(str);
		Integer a3 = new Integer(a); // Wrapper Class
		String str2 = a3.toString(); // lookup
		System.out.println(a);
}
}
