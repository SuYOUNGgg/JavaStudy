
public class Test4 {

	public static void main(String[] args) {
		int number = 30;
		switch(number) {
		case 10:
			System.out.println("10"); //한 case하고 종료하고 싶을 때 break쓰기
		case 20:
			System.out.println("20");
			break;
		default: //해당하는 case없을 때 실행
			System.out.println("another");
		}

	}
	
}
