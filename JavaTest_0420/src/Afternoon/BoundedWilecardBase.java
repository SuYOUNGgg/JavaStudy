package Afternoon;
class Box6<T> {
	private T ob;
	public void set(T o) {ob = o;}
	public T get() {return ob;}
}
class Toy {
	@Override
	public String toString() {
		return "I am a Toy";
	}
}

class BoxHandler {
	public static void outBox(Box6<Toy> box) {
		Toy t = box.get();
		System.out.println(t);
	}
	public static void inBox(Box6<Toy> box, Toy n) {
		box.set(n);
		
	}
}
class BoundedWilecardBase {

	public static void main(String[] args) {
		Box6<Toy> box = new Box6<>();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);

	}

}
