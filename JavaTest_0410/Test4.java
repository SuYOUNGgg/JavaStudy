class Student3 {
	public Student3() {
		System.out.println("Default Constructor");
		name = "ȫ�浿";
		age = 20;
	}
	
	// Overloading(�����ε�): Ŭ���� �ȿ� ���Ǵ� ���� �� �̸��� �����ϰ� ���� �Ķ���� ������ ������ Ʋ�����
	public Student3(String nm, int ag) {
			name = nm;
			age=ag;
	}
	
	private String name;
	private int age;
	public void setName(String nm) {}
	public void setName(String nm, int ag) {}	
	public void setAge(int ag) {}
	public void gotoSchool() {
		System.out.println(name + "," +age + "�� �б��� ����.");
	}
}
public class Test4 {

	public static void main(String[] args) {
		Student3 stu = new Student3();
		stu.gotoSchool();  //�ʱⰪ�� �����߱� ������ ���� �ȳ־ �ʱⰪ�� (ȫ�浿,20)�� ����ȴ�.
		Student3 stu2 = new Student3("������",30);
		stu2.gotoSchool();
		
	}

}
