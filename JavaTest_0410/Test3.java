class Student2{
	private String name;//위치 뒤로가도 상관없음
	public Student2() { //(생성자!!!클래스이름 동일하고, public이고, return안하면 생성자임. 메소드와 구분됨. 초기화할 때 사용)
		System.out.println("Default Constructor"); //초기값 호출
		
	}
	public void setName(String nm) { //로컬변수들을 조건에 맞게 특정변수만 접근할 수 있게 해줌 ex) stu.setName("OOO"); 이런 식으로
		name = nm;
	}
	public String getName() {
		return name;                                                                   
	}
	public void gotoSchool() {
		System.out.println(name + "이 학교에 간다.");
	}
	
}
public class Test3 {

	public static void main(String[] args) {
		Student2 stu = new Student2();
		stu.setName("이순신");//name을 선언할 때 private을 안붙일 경우 그냥 stu.name = "이순신"; 이라고 쓰면됨
		stu.gotoSchool();
		Student2 stu2;
		stu2 = new Student2();
		stu2.setName("강감찬");
		stu2.gotoSchool();
		execute(stu2);						//Student2 t = execute(stu2);
											//t.gotoSchool();
		}									// }
		static void execute(Student2 s) {   //static Student2 execute(Student2 s) {
			s.gotoSchool();					//	
											// return s;        }  이런식으로 해도 같은 결과지만 메모리 많이 차지함.
		
		}
}
