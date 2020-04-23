package Afternoon;

class Box1<T> {
	private T ob;
	public void set(T o) {ob = o;}
	public T get() { return ob;}
	
	public String toString() {
		return ob.toString();
	}
}

class Unboxer1 {
	public static <T> T openBox(Box<T> box) {
		return box.get();
	}
	public static void peekBox(Box<?> box) {
		System.out.println(box);
	}
}

class WildcardUnboxer2 {

	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.set("So Simple String");
		Unboxer.peekBox(box);

	}

}
