/*
 * �л�
 * - �̸�, ����, Ű... (��ü)
 * - �����Ѵ�. ���� ����...
 */

class Student{ //class�� Ʋ�� ¥�� ���� û����
	String name;  //��ü
	int age;
	int height;
	void study() {System.out.println(name + "," + age + "," + height);} 
	void gotoHome() {};
}
/*
 * �б�
 * - ��ġ, ���
 * - �����Ѵ�.
 * 
 */
class School{
	String location;
	int qty;
	void teaching() {};
}

public class Test1 {
	
	
	public static void main(String[] args) {
		Student stu = new Student(); //Student classȣ���ϴ� �� ,class�� ��(Student)�� stu�� ������
		stu.name ="�̼���";
		stu.study();
		Student stu2 = new Student();
		stu2.name = "ȫ�浿";
		stu2.study();
		School s = new School();
		s.location = "����";
		s.teaching(); //���������̼�: ��  public class�ȿ� �����ϸ� �� �ȿ����� �� �� �ֱ� ������ ���� �ۿ� ���� ����� ��
		Student stu3 = stu;
		Test(stu); //�ؿ��� Test�Լ����� StudentŬ������ ������ �ӽ÷� s��� �����ϱ�, ���⼭�� stu�� ������ �߱� ������ stu=s��� �ǹ̰� ��.
		
	}
	static void Test(Student s) { // Student s = stu; ��ü�� ����: Student stu2 = new Student();���� �����ϸ� ��� �޸𸮸� �÷��� ������, static void Test(Student s) �̷� ������ ��ü�� ������ָ� �̰ɷ� ��� �� �� �ִ�. 
	}


}
