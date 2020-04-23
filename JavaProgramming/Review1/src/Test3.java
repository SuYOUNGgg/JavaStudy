
class Student {
	private String name;
	private int age;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() { //getter는 자료형으로 주기 때문에 return! (getter는 인스턴스 변수의 값을 참조하는 메소드)
		return this.name;
	}
	public void setAge(int age) { //setter는 인스턴스 변수를 설정하는 메소드 따라서 자료형 아님 return 없고, void있음
		this.age =age;
	}
	public int getAge() {
		return this.age;
	}
	public void gotoSchool() {
		System.out.println(name + "이 학교에 간다.");
	}
	
	
	public Student(String name, int age) {
		this.name =name;
		this.age =age;
	}
}


public class Test3 {

	public static void main(String[] args) {
		Student stu = new Student("강갘찬",30);
		stu.gotoSchool();
		

	}

}
