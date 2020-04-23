package com.test;

public class ArrayPractice {

	public static void main(String[] args) {
		String[] StuNum = new String[5];
		
		StuNum[0] = "Student[1]";
		StuNum[1] = "Student[2]";
		StuNum[2] = "Student[3]";
		StuNum[3] = "Student[4]";
		StuNum[4] = "Student[5]";
		
		String[][] Arr = {
				{"A","B","A","C","C","D","E","F","A","D"},
				{"D","B","A","B","C","A","E","F","A","D"},
				{"E","D","D","A","C","B","E","E","A","D"},
				{"C","B","A","E","D","D","E","F","A","D"},
				{"A","B","D","C","C","D","E","E","A","D"}
		};
		
		String[] Answer = {"D","B","D","C","C","D","A","E","A","D"};
		
		for(int i=0; i<Arr.length; i++) {
			int Score=0;
			for(int j=0; j<Answer.length; j++) {
				if(Arr[i][j]==Answer[j]) {
					Score++;
			}
		}System.out.println("The "+ StuNum[i] + " 's Score is "+ Score);
		}
	}
}


