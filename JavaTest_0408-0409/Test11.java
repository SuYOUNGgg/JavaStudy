
public class Test11 {
	static int count = 0;
	static void recursion() {
		count++;
		if(count <=5)  {
			System.out.println("recursion"); //재귀적메소드 (트리구조에서 많이 씀) 
		recursion();
	}
}	
	static int factorial(int n) {
		if(n == 1)
			return 1;
		else
			return(n * factorial(n-1)); //값=5!=120
		
	}		
	public static void main(String[] args) {
	
		recursion(); //항상 main함수 먼저 실행되기 때문에 recursion을 먼저 불러줘야 뒤에가 실행됨
		int result = factorial(5);
		System.out.println(result);
	}
		

	}

