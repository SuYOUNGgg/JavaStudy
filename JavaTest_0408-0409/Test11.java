
public class Test11 {
	static int count = 0;
	static void recursion() {
		count++;
		if(count <=5)  {
			System.out.println("recursion"); //������޼ҵ� (Ʈ���������� ���� ��) 
		recursion();
	}
}	
	static int factorial(int n) {
		if(n == 1)
			return 1;
		else
			return(n * factorial(n-1)); //��=5!=120
		
	}		
	public static void main(String[] args) {
	
		recursion(); //�׻� main�Լ� ���� ����Ǳ� ������ recursion�� ���� �ҷ���� �ڿ��� �����
		int result = factorial(5);
		System.out.println(result);
	}
		

	}

