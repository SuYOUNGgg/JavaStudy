import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// 문제 2.
// A대학의 학기말이 되었다. 각과목별로 성적을 입력 받아 장학금을 받을 학생을 선별하려고 한다.
// 장학금을 받을 수 있는 조건은 아래와 같다.
//   1) 평점이 3.7 이상   2) 각 과목별 성적이 2.5 이상 (한 과목이라도 2.5 미만인 과목이 있다면, 과락으로 장학금 탈락)
public class Practice {
    
    public static void main( String[] args ) {
    	double Total = 0;
    	boolean Check = true;
    	
    	System.out.print( "Computer Science 성적을 입력하세요 : " );
    	double CSscore = getUserInput();
    	if(CSscore <2.5) { Check = false;}
    	
    	System.out.print( "Java Programming 성적을 입력하세요 : " );
        double JPscore = getUserInput();
        if(JPscore <2.5) { Check = false;}
        
        System.out.print( "공학수학 성적을 입력하세요 : " );
        double EMscore = getUserInput();
        if(EMscore <2.5) { Check = false;}
        
        System.out.print( "오페라의 이해 성적을 입력하세요 : " );
        double OPscore = getUserInput();
        if(OPscore <2.5) { Check = false;}
        
        System.out.print( "배드민턴 성적을 입력하세요 : " );
        double BMscore = getUserInput();
        if(BMscore <2.5) { Check = false;}
        
        System.out.println( "==============================" );
        
        Total = (CSscore + JPscore + EMscore + OPscore + BMscore);
        
        System.out.println("평점은 " + Total/5  + "입니다");
        
        if(Total/5 >= 3.7 && Check == true) {
        	System.out.println("다음 학기 장학금 대상자 입니다. ");
        //boolean check1 = checkScore(CSscore);
        //boolean check2 = checkScore(JPscore);
        //boolean check3 = checkScore(EMscore);
        //boolean check4 = checkScore(OPscore);
        //boolean check5 = checkScore(BMscore);
        //if(check1 && check2 && check3 && check4 && check5 && Total/5 >=3.7 ) {
        //			System.out.println("다음 학기 장학금 대상자 입니다. "); }	
        	
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
        		
    	