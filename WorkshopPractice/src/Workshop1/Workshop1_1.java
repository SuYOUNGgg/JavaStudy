package Workshop1;
import java.util.Scanner;

class Cost {
	public static int AM = 2000;
	public static int CL = 3000;
	public static int BG = 1500;
	public static int CC = 500;
	public static int Calc(int what,int n) {
		return what*n;
	}
}

public class Workshop1_1 {

	public static void main(String[] args) {
		System.out.println( "========= 메뉴 =========" );
        System.out.println( " 1. 아메리카노   2000원" );
        System.out.println( " 2. 카페라떼   3000원" );
        System.out.println( " 3. 베이글   1500원" );
        System.out.println( " 4. 크림치즈   500원\n" );
        
               
        System.out.println( "========= 주문 =========" );
        System.out.print( " 아메리카노 주문 수량 : " );
        int a1 = getUserInput();
        System.out.print( " 카페라떼 주문 수량 : " );
        int a2 = getUserInput();
        System.out.print( " 베이글 주문 수량 : " );
        int a3 = getUserInput();
        System.out.print( " 크림치즈 주문 수량 : " );   
        int a4 = getUserInput();
        
        int sum = 0;
       
        System.out.println("아메리카노 : " + Cost.Calc(Cost.AM,a1));
        sum += Cost.Calc(Cost.AM, a1);
       
        System.out.println("카페라테 : " + Cost.Calc(Cost.CL, a2));
        sum += Cost.Calc(Cost.CL, a2);

        System.out.println("베이글 : " + Cost.Calc(Cost.BG, a3));
        sum += Cost.Calc(Cost.BG, a3);
        
        System.out.println("크림치즈 : " + Cost.Calc(Cost.CC, a4));
        sum += Cost.Calc(Cost.CC, a4);
        
        
        System.out.println( "======================" );
        System.out.println("총 구매 금액: " + sum);
             
        
                
        double Point = 0;
        if(sum >= 12000 && sum < 30000) {
        	 Point = sum * 0.01;
        	System.out.println("포인트 적립 : " + Point);
        } 
        else if(sum >= 30000) {
        	Point =sum * 0.02;
        	System.out.println("포인트 적립 : " + Point);
        }
	}
    
        public static int getUserInput() {
        
        	Scanner a = new Scanner(System.in);
        	int value = a.nextInt();
        	return value;
        }
    }


