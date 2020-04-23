class Store<T> {
	private T t;
	public T add(T t) {
		return this.t;
	}
	public T getValue() {
		return this.t;
	}
}
class Box7<T,S> {
	private T t;
	private S s;
	public void add(T t, S s) {
		this.t = t;
		this.s = s;
	}
	public T getFirst() {
		return this.t;
	}
	public S getTwo() {
		return this.s;
	}
}
public class Test7 {
	
	public static void main(String[] args) {
		Box7<String, Integer> b = new Box7<String, Integer>();
		b.add("홍길동",1234);
		Box7<String, Store<String>> b2 = new Box7<String, Store<String>>();
		Store<String> s = new Store<String>();
		s.add("테스트");
		b2.add("강감찬", s);
		
		
	}
}


