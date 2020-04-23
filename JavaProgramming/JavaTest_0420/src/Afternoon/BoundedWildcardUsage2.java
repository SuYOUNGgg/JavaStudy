package Afternoon;
class Box7<T> {
	private T ob;
	public void set(T o) { ob = o;}
	public T get() { return ob;}
}
class Toy7 {
	public String toString() {
		return "I am a Toy";
	}
}
class BoxHandler7 {
	public static void outBox(Box7<? extends Toy7> box) {
		Toy7 t = box.get();
		System.out.println(t);
	}
	public static void inBox(Box7<? super Toy7> box, Toy7 n) {
		box.set(n);
	}
}


class BoundedWildcardUsage2 {

	public static void main(String[] args) {
		Box7<Toy7> box = new Box7<>();
		BoxHandler7.inBox(box, new Toy7());
		BoxHandler7.outBox(box);

	}

}
