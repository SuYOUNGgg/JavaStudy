package Workshop1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//���� 2.
//A������ �б⸻�� �Ǿ���. �����񺰷� ������ �Է� �޾� ���б��� ���� �л��� �����Ϸ��� �Ѵ�.
//���б��� ���� �� �ִ� ������ �Ʒ��� ����.
//1) ������ 3.7 �̻�   2) �� ���� ������ 2.5 �̻� (�� �����̶� 2.5 �̸��� ������ �ִٸ�, �������� ���б� Ż��)
public class Workshop1_2 {

	public static void main(String[] args) {
		double TotalScore = 0;
		boolean Check = true;
		
		System.out.print( "Computer Science ������ �Է��ϼ��� : " );
		double CS = getUserInput();
		if(CS <2.5) {
			Check = false;
		}
		System.out.print( "�ڹ� ���α׷��� ������ �Է��ϼ��� : " );
		double JP = getUserInput();
		if(JP <2.5) {
			Check = false;
		}
		System.out.print( "���м��� ������ �Է��ϼ��� : " );
		double EM = getUserInput();
		if(EM <2.5) {
			Check = false;
		}
		System.out.print( "����� ������ �Է��ϼ��� : " );
		double OP = getUserInput();
		if(OP <2.5) {
			Check = false;
		}
		System.out.print( "������ ������ �Է��ϼ��� : " );
		double BD = getUserInput();
		if(BD <2.5) {
			Check = false;
		}
		TotalScore = CS+JP+EM+OP+BD;
		
		System.out.println( "==============================" );        
        System.out.println( "������ "+ TotalScore/5 +" �Դϴ�." );
        
        if( TotalScore/5 >= 3.7) {
        	System.out.println("���� �б� ���б� ����� �Դϴ�. ");
        	}
				
		}
		public static double getUserInput() {
	        
	          Scanner scanner = new Scanner(System.in);
	       double value = scanner.nextDouble();
	       return value;
	}

}
