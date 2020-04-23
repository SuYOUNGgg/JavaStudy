package Workshop1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//문제 2.
//A대학의 학기말이 되었다. 각과목별로 성적을 입력 받아 장학금을 받을 학생을 선별하려고 한다.
//장학금을 받을 수 있는 조건은 아래와 같다.
//1) 평점이 3.7 이상   2) 각 과목별 성적이 2.5 이상 (한 과목이라도 2.5 미만인 과목이 있다면, 과락으로 장학금 탈락)
public class Workshop1_2 {

	public static void main(String[] args) {
		double TotalScore = 0;
		boolean Check = true;
		
		System.out.print( "Computer Science 성적을 입력하세요 : " );
		double CS = getUserInput();
		if(CS <2.5) {
			Check = false;
		}
		System.out.print( "자바 프로그래밍 성적을 입력하세요 : " );
		double JP = getUserInput();
		if(JP <2.5) {
			Check = false;
		}
		System.out.print( "공학수학 성적을 입력하세요 : " );
		double EM = getUserInput();
		if(EM <2.5) {
			Check = false;
		}
		System.out.print( "오페라 성적을 입력하세요 : " );
		double OP = getUserInput();
		if(OP <2.5) {
			Check = false;
		}
		System.out.print( "배드민턴 성적을 입력하세요 : " );
		double BD = getUserInput();
		if(BD <2.5) {
			Check = false;
		}
		TotalScore = CS+JP+EM+OP+BD;
		
		System.out.println( "==============================" );        
        System.out.println( "평점은 "+ TotalScore/5 +" 입니다." );
        
        if( TotalScore/5 >= 3.7) {
        	System.out.println("다음 학기 장학금 대상자 입니다. ");
        	}
				
		}
		public static double getUserInput() {
	        
	          Scanner scanner = new Scanner(System.in);
	       double value = scanner.nextDouble();
	       return value;
	}

}
