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
		System.out.println( "========= �޴� =========" );
        System.out.println( " 1. �Ƹ޸�ī��   2000��" );
        System.out.println( " 2. ī���   3000��" );
        System.out.println( " 3. ���̱�   1500��" );
        System.out.println( " 4. ũ��ġ��   500��\n" );
        
        System.out.println( "========= �ֹ� =========" );
        System.out.print( " �Ƹ޸�ī�� �ֹ� ���� : " );    
        int am = getUserInput();
        System.out.print( " ī��� �ֹ� ���� : " );  
		int cl = getUserInput();
		System.out.print( " ���̱� �ֹ� ���� : " );
		int bg = getUserInput();
		System.out.print( " ũ��ġ�� �ֹ� ���� : " );
		int cc = getUserInput();
		
		int total=0;
		System.out.println( "========= �ݾ� =========" );
		total = total + cost.Calc(cost.am,am);
		System.out.println( " �Ƹ޸�ī�� : " + cost.Calc(cost.am,am));
		total += cost.Calc(cost.cl, cl);
        System.out.println( " ī��� : " + cost.Calc(cost.cl, cl)); 
        total += cost.Calc(cost.bg, bg);
        System.out.println(" ���̱� : " + cost.Calc(cost.bg, bg));   
        total += cost.Calc(cost.cc, cc);
        System.out.println( " ũ��ġ�� : " + cost.Calc(cost.cc,cc));
        
        double dPoint = 0;
        System.out.println( "==================" );
        System.out.print( " �� ���� �ݾ�  : " + total);
        
        if (total > 30000) {
        	dPoint = total*0.02;
        }
        else if (total >12000) {
        	dPoint = total*0.01;
        }
        else dPoint = 0;
        System.out.println(" ����Ʈ ����  : " + dPoint);
	}
	
		public static int getUserInput() {
	    	
	       Scanner scanner = new Scanner(System.in);
	       int value = scanner.nextInt();
	       return value;
	       
	    }
	}		
	
        
        
        
 
	
