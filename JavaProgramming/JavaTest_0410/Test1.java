/*
 * 학생
 * - 이름, 나이, 키... (객체)
 * - 공부한다. 집에 간다...
 */

class Student{ //class는 틀을 짜기 위한 청사진
	String name;  //객체
	int age;
	int height;
	void study() {System.out.println(name + "," + age + "," + height);} 
	void gotoHome() {};
}
/*
 * 학교
 * - 위치, 명수
 * - 수업한다.
 * 
 */
class School{
	String location;
	int qty;
	void teaching() {};
}

public class Test1 {
	
	
	public static void main(String[] args) {
		Student stu = new Student(); //Student class호출하는 것 ,class의 명(Student)을 stu로 선언함
		stu.name ="이순신";
		stu.study();
		Student stu2 = new Student();
		stu2.name = "홍길동";
		stu2.study();
		School s = new School();
		s.location = "서울";
		s.teaching(); //모듈라이제이션: 이  public class안에 선언하면 이 안에서만 쓸 수 있기 때문에 따로 밖에 모듈로 만드는 것
		Student stu3 = stu;
		Test(stu); //밑에서 Test함수에서 Student클래스의 변수를 임시로 s라고 했으니까, 여기서는 stu를 변수로 했기 때문에 stu=s라는 의미가 됨.
		
	}
	static void Test(Student s) { // Student s = stu; 객체의 장점: Student stu2 = new Student();으로 선언하면 계속 메모리를 늘려야 하지만, static void Test(Student s) 이런 식으로 객체를 만들어주면 이걸로 계속 쓸 수 있다. 
	}


}
