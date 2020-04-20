package Afternoon;
class Box8<T> {
	private T ob;
	public void set(T o) { ob = o;}
	public T get() { return ob;}
}
class Toy8 {
	public String toString() {
		return "I am a Toy";
	}
}
class Robot8 {
	public String toString() { 
		return "I am a Robot";
	}
}
class BoxHandler8 {
	public static <T> void outBox(Box8<? extends T>box) {
		T t = box.get();
		System.out.println(t);
	}
	public static <T> void inBox(Box8<? super T>box, T n) {
		box.set(n);
	}
}
class BoundedWildcardGenericMethod {

	public static void main(String[] args) {
		Box8<Toy8> tBox = new Box8<>();
		BoxHandler8.inBox(tBox, new Toy8());
		BoxHandler8.outBox(tBox);

	}

}
