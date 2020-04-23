import java.util.ArrayList;

class Box <T> {
	private T t;
	public void add(T t) {
		this.t = t;
	}
	public T get() {
		return this.t;
	}
}
class MyArr<T> {
	private ArrayList<T> a1;
	public MyArr(int size) {
		this.a1 = new ArrayList<T>();
	}
	public void setA1(T v) {
		a1.add(v);
	}
	public T getA1(int inx) {
		return a1.get(inx);
	}
}

public class Test4 {

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>();
		b1.add(new Integer(2));
		Box<String> s1 = new Box<String>();
		s1.add("Hello Java");
		System.out.println(b1.get());
		System.out.println(s1.get());
	}

}
