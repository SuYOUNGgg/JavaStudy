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
		System.out.println( "========= �޴� =========" );
        System.out.println( " 1. �Ƹ޸�ī��   2000��" );
        System.out.println( " 2. ī���   3000��" );
        System.out.println( " 3. ���̱�   1500��" );
        System.out.println( " 4. ũ��ġ��   500��\n" );
        
               
        System.out.println( "========= �ֹ� =========" );
        System.out.print( " �Ƹ޸�ī�� �ֹ� ���� : " );
        int a1 = getUserInput();
        System.out.print( " ī��� �ֹ� ���� : " );
        int a2 = getUserInput();
        System.out.print( " ���̱� �ֹ� ���� : " );
        int a3 = getUserInput();
        System.out.print( " ũ��ġ�� �ֹ� ���� : " );   
        int a4 = getUserInput();
        
        int sum = 0;
       
        System.out.println("�Ƹ޸�ī�� : " + Cost.Calc(Cost.AM,a1));
        sum += Cost.Calc(Cost.AM, a1);
       
        System.out.println("ī����� : " + Cost.Calc(Cost.CL, a2));
        sum += Cost.Calc(Cost.CL, a2);

        System.out.println("���̱� : " + Cost.Calc(Cost.BG, a3));
        sum += Cost.Calc(Cost.BG, a3);
        
        System.out.println("ũ��ġ�� : " + Cost.Calc(Cost.CC, a4));
        sum += Cost.Calc(Cost.CC, a4);
        
        
        System.out.println( "======================" );
        System.out.println("�� ���� �ݾ�: " + sum);
             
        
                
        double Point = 0;
        if(sum >= 12000 && sum < 30000) {
        	 Point = sum * 0.01;
        	System.out.println("����Ʈ ���� : " + Point);
        } 
        else if(sum >= 30000) {
        	Point =sum * 0.02;
        	System.out.println("����Ʈ ���� : " + Point);
        }
	}
    
        public static int getUserInput() {
        
        	Scanner a = new Scanner(System.in);
        	int value = a.nextInt();
        	return value;
        }
    }


