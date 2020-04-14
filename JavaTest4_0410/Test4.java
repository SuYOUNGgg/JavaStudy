class Student3 {
	public Student3() {
		System.out.println("Default Constructor");
		name = "홍길동";
		age = 20;
	}
	
	// Overloading(오버로딩): 클래스 안에 사용되는 변수 중 이름을 동일하게 쓰고 파라미터 갯수와 종류가 틀린경우
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
		System.out.println(name + "," +age + "가 학교에 간다.");
	}
}
public class Test4 {

	public static void main(String[] args) {
		Student3 stu = new Student3();
		stu.gotoSchool();  //초기값을 설정했기 때문에 값을 안넣어도 초기값인 (홍길동,20)이 산출된다.
		Student3 stu2 = new Student3("강감찬",30);
		stu2.gotoSchool();
		
	}

}
