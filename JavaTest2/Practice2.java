import java.util.Scanner;

//���� 1.
//Ŀ�� �ֹ��� �Ϸ��� �Ѵ�.
//�޴��� ����, �� �޴� ���� �� ���� �ֹ��� ������ �Է� �޾� �����ؾ� �� �� �ݾ��� ����� ����.
//�׸��� �� �ݾ��� ���� �ݾ��� �Ѿ�� ����Ʈ�� ������ �ش�.
//�� �ݾ� 12000�� �̻� : ���� �ݾ��� 1% ����
//�� �ݾ� 30000�� �̻� : ���� �ݾ��� 2% ����
public class Practice2 {
 
 public static void main( String[] args ) {
     
     System.out.println( "========= �޴� =========" );
     System.out.println( " 1. �Ƹ޸�ī��   2000��" );
     System.out.println( " 2. ī���   3000��" );
     System.out.println( " 3. ���̱�   1500��" );
     System.out.println( " 4. ũ��ġ��   500��\n" );
     
     System.out.println( "========= �ֹ� =========" );
     System.out.print( " �Ƹ޸�ī�� �ֹ� ���� : " );
     int AM = getUserInput();
     
     
     System.out.print( " ī��� �ֹ� ���� : " );
     int CL = getUserInput();
     
     System.out.print( " ���̱� �ֹ� ���� : " );
     int BG = getUserInput();
     
     System.out.print( " ũ��ġ�� �ֹ� ���� : " );
     int CC = getUserInput();
     
     int Total = 0;
     
     System.out.println( "========= �ݾ� =========" );
		Total = Total + AM*2000;
	 System.out.println( " �Ƹ޸�ī�� : " + AM*2000);
	
	 Total += CL*3000;
     System.out.println( " ī��� : " + CL*3000); 
     
     Total += BG*1500;
     System.out.println(" ���̱� : " + BG*1500);   
     
     Total += CC*500;
     System.out.println( " ũ��ġ�� : " + CC*500);
     
     
     System.out.println( "======================" );
     System.out.println( " �� ���űݾ� : " + ( Total ));
     
     double Point = 0;
    
     if (Total > 30000) {
     	Point = Total*0.02;
     }
     else if (Total >12000) {
     	Point = Total*0.01;
     }
     else Point = 0;
     System.out.println(" ����Ʈ ����  : " + (int)Point);
	}
 
 
 
 public static int getUserInput() {
     
 	Scanner scanner = new Scanner(System.in);
 	int value = scanner.nextInt();
 	return value;
 	
 }
}