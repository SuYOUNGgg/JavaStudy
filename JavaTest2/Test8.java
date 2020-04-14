// method, function, procedure
//메소드, 함수, 프로시져
public class Test8 {
	static int add(int x, int y) { //void가 없기 때문에 반환이 있음
		int z = x + y; 
		return z;//입력을 int로 했기 때문에 출력도 int로 해야함
	}
	public static void main(String[] args) { //void는 반환이 없음
//		int a = 1;//입력
//		int b = 2;//입력
//		int c = a+ b;//출력
//		
//		int a1 = 2;
//		int b1 = 3;
//		int c1 = a1+ b1;
		
		int c2 = add(1,2);
		int c3 = add(3,4); //이렇게 적으면 위의 세줄을 안써도됨
		System.out.println(c2 + "," + c3);
	}

}
