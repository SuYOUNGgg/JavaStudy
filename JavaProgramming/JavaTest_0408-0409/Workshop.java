import java.util.Scanner;

class cost {
	public static int am = 2000;
	public static int cl = 3000;
	public static int bg = 1500;
	public static int cc = 500;
	
	public static int Calc(int what, int n) {
		return what*n;
	}
}

public class Workshop {
	
	public static void main(String[] args) {
		System.out.println( "========= 메뉴 =========" );
        System.out.println( " 1. 아메리카노   2000원" );
        System.out.println( " 2. 카페라떼   3000원" );
        System.out.println( " 3. 베이글   1500원" );
        System.out.println( " 4. 크림치즈   500원\n" );
        
        System.out.println( "========= 주문 =========" );
        System.out.print( " 아메리카노 주문 수량 : " );    
        int am = getUserInput();
        System.out.print( " 카페라떼 주문 수량 : " );  
		int cl = getUserInput();
		System.out.print( " 베이글 주문 수량 : " );
		int bg = getUserInput();
		System.out.print( " 크림치즈 주문 수량 : " );
		int cc = getUserInput();
		
		int total=0;
		System.out.println( "========= 금액 =========" );
		total = total + cost.Calc(cost.am,am);
		System.out.println( " 아메리카노 : " + cost.Calc(cost.am,am));
		total += cost.Calc(cost.cl, cl);
        System.out.println( " 카페라떼 : " + cost.Calc(cost.cl, cl)); 
        total += cost.Calc(cost.bg, bg);
        System.out.println(" 베이글 : " + cost.Calc(cost.bg, bg));   
        total += cost.Calc(cost.cc, cc);
        System.out.println( " 크림치즈 : " + cost.Calc(cost.cc,cc));
        
        double dPoint = 0;
        System.out.println( "==================" );
        System.out.print( " 총 구매 금액  : " + total);
        
        if (total > 30000) {
        	dPoint = total*0.02;
        }
        else if (total >12000) {
        	dPoint = total*0.01;
        }
        else dPoint = 0;
        System.out.println(" 포인트 적립  : " + dPoint);
	}
	
		public static int getUserInput() {
	    	
	       Scanner scanner = new Scanner(System.in);
	       int value = scanner.nextInt();
	       return value;
	       
	    }
	}		
	
        
        
        
 
	
