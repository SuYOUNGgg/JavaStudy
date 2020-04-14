
public class Break {

	public static void main(String[] args) {
		int num =1;
		boolean search = false;
		
		while(num<100) {
			if(((num % 5) == 0 ) && ((num % 7) == 0)) {
				search = true;
				break; //찾는 조건이 나오면 멈춤 continue와 반대
			}
			num++;
		}
		if(search)
			System.out.println("찾는 정수: " + num);
		else
			System.out.println("5의 배수");
	}

}

//무한루프 for(;;) {
//			....
//		}
