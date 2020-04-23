import java.util.Scanner;

//문제 1.
//커피 주문을 하려고 한다.
//메뉴를 보고, 각 메뉴 별로 몇 개씩 주문할 것인지 입력 받아 지불해야 할 총 금액을 계산해 보자.
//그리고 총 금액이 일정 금액을 넘어서면 포인트를 적립해 준다.
//총 금액 12000원 이상 : 구매 금액의 1% 적립
//총 금액 30000원 이상 : 구매 금액의 2% 적립
public class Practice2 {
 
 public static void main( String[] args ) {
     
     System.out.println( "========= 메뉴 =========" );
     System.out.println( " 1. 아메리카노   2000원" );
     System.out.println( " 2. 카페라떼   3000원" );
     System.out.println( " 3. 베이글   1500원" );
     System.out.println( " 4. 크림치즈   500원\n" );
     
     System.out.println( "========= 주문 =========" );
     System.out.print( " 아메리카노 주문 수량 : " );
     int AM = getUserInput();
     
     
     System.out.print( " 카페라떼 주문 수량 : " );
     int CL = getUserInput();
     
     System.out.print( " 베이글 주문 수량 : " );
     int BG = getUserInput();
     
     System.out.print( " 크림치즈 주문 수량 : " );
     int CC = getUserInput();
     
     int Total = 0;
     
     System.out.println( "========= 금액 =========" );
		Total = Total + AM*2000;
	 System.out.println( " 아메리카노 : " + AM*2000);
	
	 Total += CL*3000;
     System.out.println( " 카페라떼 : " + CL*3000); 
     
     Total += BG*1500;
     System.out.println(" 베이글 : " + BG*1500);   
     
     Total += CC*500;
     System.out.println( " 크림치즈 : " + CC*500);
     
     
     System.out.println( "======================" );
     System.out.println( " 총 구매금액 : " + ( Total ));
     
     double Point = 0;
    
     if (Total > 30000) {
     	Point = Total*0.02;
     }
     else if (Total >12000) {
     	Point = Total*0.01;
     }
     else Point = 0;
     System.out.println(" 포인트 적립  : " + (int)Point);
	}
 
 
 
 public static int getUserInput() {
     
 	Scanner scanner = new Scanner(System.in);
 	int value = scanner.nextInt();
 	return value;
 	
 }
}