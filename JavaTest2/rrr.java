import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// ���� 2.
// A������ �б⸻�� �Ǿ���. �����񺰷� ������ �Է� �޾� ���б��� ���� �л��� �����Ϸ��� �Ѵ�.
// ���б��� ���� �� �ִ� ������ �Ʒ��� ����.
//   1) ������ 3.7 �̻�   2) �� ���� ������ 2.5 �̻� (�� �����̶� 2.5 �̸��� ������ �ִٸ�, �������� ���б� Ż��)
public class rrr {
    
    public static void main( String[] args ) {
        
    	double dTotalScore = 0; // ��ü ���� ��
    	boolean bCheckFlag = true; // ���� üũ ��
    	
        System.out.print( "Computer Science ������ �Է��ϼ��� : " );
        double dCS = getUserInput();
        dTotalScore += dCS;
        if(dCS<2.0) { bCheckFlag = false; }
        
        System.out.print( "Java Programming ������ �Է��ϼ��� : " );
        double dJv = getUserInput();
        dTotalScore += dJv;
        if(dJv<2.0) { bCheckFlag = false; }
        
        System.out.print( "���м��� ������ �Է��ϼ��� : " );
        double dMt = getUserInput();
        dTotalScore += dMt;
        if(dMt<2.0) { bCheckFlag = false; }
        
        System.out.print( "������� ���� ������ �Է��ϼ��� : " );
        double dOp = getUserInput();
        dTotalScore += dOp;
        if(dOp<2.0) { bCheckFlag = false; }
        
        System.out.print( "������ ������ �Է��ϼ��� : " );
        double dBm = getUserInput();
        dTotalScore += dBm;
        if(dBm<2.0) { bCheckFlag = false; }
        
        System.out.println( "==============================" );        
        System.out.println( "������ "+ dTotalScore/5 +" �Դϴ�." );
        
        if(dTotalScore/5 >= 3.7 && bCheckFlag == true) {
        	System.out.println("���� �б� ���б� ����� �Դϴ�. ");
        }
       
    }
    
    public static double getUserInput() {
        
          Scanner scanner = new Scanner(System.in);
       double value = scanner.nextDouble();
       return value;
    }
}