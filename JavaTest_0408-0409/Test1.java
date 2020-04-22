//Local variable 함수안에 사용되는 변수. 여기서는 str이나 a2같은 것들
//Instance variable 모든 메소드에서 쓰고 싶은 변수들을 정하는 것 여기서는 A  
//static variable 
class A{
	int data = 50; //instance변수
	static int m = 100; //static변수
	void method() {
		int n = 90; //local변수
	}
}

class Student{
	public String name;
	public int age;
	public void goSchool() {
		System.out.println(name + "이 학교에 가다.");
	}
}
public class Test1 {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "이순신";
		stu.age= 20;
		stu.goSchool();

		System.out.println(A.m);
		A.m =200; //위의 메소드에서 선언한 변수 값 바꾸기
		System.out.println(A.m); 
		A a2 = new A();
		System.out.println(a2.data);
		
		String str = "1234";
		int a = Integer.parseInt(str);
		Integer a3 = new Integer(a); // Wrapper Class
		String str2 = a3.toString(); // lookup
		System.out.println(a);
}
}
