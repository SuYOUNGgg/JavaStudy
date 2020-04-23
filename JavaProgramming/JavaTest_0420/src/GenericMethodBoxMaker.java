class Box5<T> {
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}
class BoxFactory {
	public static <T> Box5<T> makeBox(T o) {
		Box5<T> box = new Box5<T>();
		box.set(o);
		return box;
	}
}
class GenericMethodBoxMaker {

	public static void main(String[] args) {
		Box5<String> sBox = BoxFactory.makeBox("Sweet");
		System.out.println(sBox.get());
		
		Box5<Double> dBox = BoxFactory.makeBox(7.59);
		System.out.println(dBox.get());

	}

}
