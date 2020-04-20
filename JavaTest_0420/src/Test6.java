
public class Test6 {
	static <E> void printArr(E[] arr) { //제네릭메소드
		for(E e : arr) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4};
		Character[] chs = {'A','a','b'};
		printArr(arr); //E[] arr = arr;
		printArr(chs);

	}

}
