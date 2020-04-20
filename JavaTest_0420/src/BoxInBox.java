class Box2<T> {
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}
class BoxInBox {

	public static void main(String[] args) {
		Box2<String> sBox2 = new Box2<>();
		sBox2.set("I am so happy. ");
		
		Box2<Box2<String>> wBox2 = new Box2<>();
		wBox2.set(sBox2);
		
		Box2<Box2<Box2<String>>> zBox2 = new Box2<>();
		zBox2.set(wBox2);
		
		System.out.println(zBox2.get().get().get());
		

	}

}
