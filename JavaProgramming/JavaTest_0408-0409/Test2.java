
class Employee{
	String name;
	int age;
	void gotoWork() {
		System.out.println(name + "," + age + "인 사람이 일을 한다.");
	}
}

public class Test2 {

	public static void main(String[] args) {
		// value-type(값타입) vs reference-type(참조타입)
		// JVM
		// stack, heap
		
		int a = 1;
		int b = a;
		Employee emp = new Employee();//new를 통해서 reference타입으로 접근할 때 emp.OOO으로, Employee()의 의미는 Employee클래스
		emp.gotoWork();
		emp.name = "이순신";
		emp.age = 20;
		emp.gotoWork(); //마지막에 gotoWork를 해야 값이 대입되면서 호출된다.
		
		Employee emp2 = emp;
		emp2.gotoWork();
		Employee emp3 = new Employee();
		
	}

}
//static이 instance보다 더 빠르고 좋지만, 용량이 많이 들음