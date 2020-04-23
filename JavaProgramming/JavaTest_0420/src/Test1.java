import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		
		for(int inx =0; inx < arr.length; inx++) {
			System.out.println(arr[inx]);
		}
		ArrayList a1 = new ArrayList();
		a1.add(1);
		a1.add("test");
		
		System.out.println(a1.get(0));
		System.out.println(a1.get(1));
		for(Object o : a1) {
			System.out.println(o.toString());
		}

	}

}
