class Student2{
	private String name;//��ġ �ڷΰ��� �������
	public Student2() { //(������!!!Ŭ�����̸� �����ϰ�, public�̰�, return���ϸ� ��������. �޼ҵ�� ���е�. �ʱ�ȭ�� �� ���)
		System.out.println("Default Constructor"); //�ʱⰪ ȣ��
		
	}
	public void setName(String nm) { //���ú������� ���ǿ� �°� Ư�������� ������ �� �ְ� ���� ex) stu.setName("OOO"); �̷� ������
		name = nm;
	}
	public String getName() {
		return name;                                                                   
	}
	public void gotoSchool() {
		System.out.println(name + "�� �б��� ����.");
	}
	
}
public class Test3 {

	public static void main(String[] args) {
		Student2 stu = new Student2();
		stu.setName("�̼���");//name�� ������ �� private�� �Ⱥ��� ��� �׳� stu.name = "�̼���"; �̶�� �����
		stu.gotoSchool();
		Student2 stu2;
		stu2 = new Student2();
		stu2.setName("������");
		stu2.gotoSchool();
		execute(stu2);						//Student2 t = execute(stu2);
											//t.gotoSchool();
		}									// }
		static void execute(Student2 s) {   //static Student2 execute(Student2 s) {
			s.gotoSchool();					//	
											// return s;        }  �̷������� �ص� ���� ������� �޸� ���� ������.
		
		}
}
