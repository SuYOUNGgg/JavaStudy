import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// ���� 2.
// A������ �б⸻�� �Ǿ���. �����񺰷� ������ �Է� �޾� ���б��� ���� �л��� �����Ϸ��� �Ѵ�.
// ���б��� ���� �� �ִ� ������ �Ʒ��� ����.
//   1) ������ 3.7 �̻�   2) �� ���� ������ 2.5 �̻� (�� �����̶� 2.5 �̸��� ������ �ִٸ�, �������� ���б� Ż��)
public class Practice {
    
    public static void main( String[] args ) {
    	double Total = 0;
    	boolean Check = true;
    	
    	System.out.print( "Computer Science ������ �Է��ϼ��� : " );
    	double CSscore = getUserInput();
    	if(CSscore <2.5) { Check = false;}
    	
    	System.out.print( "Java Programming ������ �Է��ϼ��� : " );
        double JPscore = getUserInput();
        if(JPscore <2.5) { Check = false;}
        
        System.out.print( "���м��� ������ �Է��ϼ��� : " );
        double EMscore = getUserInput();
        if(EMscore <2.5) { Check = false;}
        
        System.out.print( "������� ���� ������ �Է��ϼ��� : " );
        double OPscore = getUserInput();
        if(OPscore <2.5) { Check = false;}
        
        System.out.print( "������ ������ �Է��ϼ��� : " );
        double BMscore = getUserInput();
        if(BMscore <2.5) { Check = false;}
        
        System.out.println( "==============================" );
        
        Total = (CSscore + JPscore + EMscore + OPscore + BMscore);
        
        System.out.println("������ " + Total/5  + "�Դϴ�");
        
        if(Total/5 >= 3.7 && Check == true) {
        	System.out.println("���� �б� ���б� ����� �Դϴ�. ");
        //boolean check1 = checkScore(CSscore);
        //boolean check2 = checkScore(JPscore);
        //boolean check3 = checkScore(EMscore);
        //boolean check4 = checkScore(OPscore);
        //boolean check5 = checkScore(BMscore);
        //if(check1 && check2 && check3 && check4 && check5 && Total/5 >=3.7 ) {
        //			System.out.println("���� �б� ���б� ����� �Դϴ�. "); }	
        	
       }
        // static boolean checkScore(double score){
     	//		boolean Check = true;
    	//		if(score < 2.5) {
        //		Check = false;}
    	//				
        //	return Check;
        // }
    }
    
    public static double getUserInput() {
        
          Scanner scanner = new Scanner(System.in);
       double value = scanner.nextDouble();
       return value;
    }
}
        		
    	