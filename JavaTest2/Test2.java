
class Employee{
	String name;
	int age;
	void gotoWork() {
		System.out.println(name + "," + age + "�� ����� ���� �Ѵ�.");
	}
}

public class Test2 {

	public static void main(String[] args) {
		// value-type(��Ÿ��) vs reference-type(����Ÿ��)
		// JVM
		// stack, heap
		
		int a = 1;
		int b = a;
		Employee emp = new Employee();//new�� ���ؼ� referenceŸ������ ������ �� emp.OOO����, Employee()�� �ǹ̴� EmployeeŬ����
		emp.gotoWork();
		emp.name = "�̼���";
		emp.age = 20;
		emp.gotoWork(); //�������� gotoWork�� �ؾ� ���� ���ԵǸ鼭 ȣ��ȴ�.
		
		Employee emp2 = emp;
		emp2.gotoWork();
		Employee emp3 = new Employee();
		
	}

}
//static�� instance���� �� ������ ������, �뷮�� ���� ����