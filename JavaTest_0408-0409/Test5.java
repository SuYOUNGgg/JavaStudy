
public class Test5 {

	public static void main(String[] args) {
		int a = 1;
		while(a<10) {
			System.out.println(a);
			a++; // a=a+1랑 같은 의미
		}
		
		
		a=1;
		do {
			System.out.println(a);
			a++;
		} while(a<10); //while구문 do while로 바꾸기
		
		for(int a2=1; a2 <10 ; a2++) {
			System.out.println(a2); //for로 바꾸기
		}
		
		int sum1 =0;
		for(int b1 =1; b1<11; b1++) {
			sum1=sum1+b1;
			
		}	System.out.println(sum1); //1부터 10의 합계 for
		
		int c1 = 1;
		int sum2 = 0;
		while(c1 <= 10) {
			sum2 = sum2+ c1; c1++;
			
		} 	System.out.println(sum2); //1부터 10의 합계 while 
		
		
		int b3 =100;
		for(int b4 = 1; b4<=10; b4++) {
			b3= b3-b4;
		} System.out.println(b3);
	
	}
}

