class Box3 <T extends Number> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}



class BoundedBox {

	public static void main(String[] args) {
		Box3<Integer> iBox = new Box3<>();
		iBox.set(24);
		
		Box3<Double> dBox = new Box3<>();
		dBox.set(5.97);
		
		System.out.println(iBox.get());
		System.out.println(dBox.get());

	}

}
