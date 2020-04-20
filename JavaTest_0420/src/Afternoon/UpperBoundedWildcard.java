package Afternoon;
class Box3<T> {
	private T ob;
	public void set(T o) {ob = o;}
	public T get() { return ob; }
	
	public String toString() {
		return ob.toString();
	}
}
class Unboxer3 {
	public static void peekBox(Box3<? extends Number> box) { 
	}
}

public class UpperBoundedWildcard {

	public static void main(String[] args) {
		Box3<Integer> iBox = new Box3<>();
		iBox.set(1234);
		Box3<Double> dBox = new Box3<>();
		dBox.set(10.000);
		
		Unboxer3.peekBox(iBox);
		Unboxer3.peekBox(dBox);

	}

}
