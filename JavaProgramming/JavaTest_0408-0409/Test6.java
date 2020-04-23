
public class Test6 {

	public static void main(String[] args) {
		for(int a =2; a<10; a++) {
			System.out.println(a);
			for(int b = 1; b<10; b++) {
				System.out.println(a +"*" + b + "=" + (a*b));
			}
			System.out.println(); //한 줄 씩 띄기 위해서 
		}

	}
}