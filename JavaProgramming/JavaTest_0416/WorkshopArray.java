package com.test;

	public class WorkshopArray {

	public static void main(String[] args) {
		int[] Num = new int[5];
		Num[0]=1;
		Num[1]=2;
		Num[2]=3;
		Num[3]=4;
		Num[4]=5;
		
		
		String[][] arr = {
				{"A","B","A","C","C","D","E","F","A","D"},
				{"D","B","A","B","C","A","E","F","A","D"},
				{"E","D","D","A","C","B","E","E","A","D"},
				{"C","B","A","E","D","D","E","F","A","D"},
				{"A","B","D","C","C","D","E","E","A","D"}
			};
				
		
		
		String[] ar = {"D","B","D","C","C","D","A","E","A","D"};
//		if(arr[0][0]==ar[0])이렇게 비교하는 건데 일일이 다 할수 없으니 for문 사용.
		
		for(int a=0; a<5; a++) { //5명이상일 때 5대신 arr.length 사용
			int score=0;
			for(int b =0; b<ar.length;b++) {
				if(arr[a][b]==ar[b]) {
					score++;
					
				}
				
			}
			System.out.println("The Student[" + Num[a] +"]'s score is " + score);
		}
	}
}
