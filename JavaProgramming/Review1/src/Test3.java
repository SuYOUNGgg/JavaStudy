
class Student {
	private String name;
	private int age;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() { //getter�� �ڷ������� �ֱ� ������ return! (getter�� �ν��Ͻ� ������ ���� �����ϴ� �޼ҵ�)
		return this.name;
	}
	public void setAge(int age) { //setter�� �ν��Ͻ� ������ �����ϴ� �޼ҵ� ���� �ڷ��� �ƴ� return ����, void����
		this.age =age;
	}
	public int getAge() {
		return this.age;
	}
	public void gotoSchool() {
		System.out.println(name + "�� �б��� ����.");
	}
	
	
	public Student(String name, int age) {
		this.name =name;
		this.age =age;
	}
}


public class Test3 {

	public static void main(String[] args) {
		Student stu = new Student("���J��",30);
		stu.gotoSchool();
		

	}

}
