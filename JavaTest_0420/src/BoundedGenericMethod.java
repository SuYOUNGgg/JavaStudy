class Box6<T> {
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}
class BoxFactory3 {
	public static <T extends Number> Box6<T> makeBox(T o) {
		Box6<T> box = new Box6<T>();
		box.set(o);
	
		
		System.out.println("Boxed data: " + o.intValue());
		return box;
	}
}
class Unboxer {			//�̷��� ��ӽ�Ű�� ������ integer�� ���鸸 ����ϱ� ���Ͽ�
	public static <T extends Number> T openBox(Box6<T> box) {
		System.out.println("Unboxed data: " + box.get().intValue());
		return box.get();
	}
}
class BoundedGenericMethod {

	public static void main(String[] args) {
		Box6<Integer> sBox = BoxFactory3.makeBox(new Integer(5959));
		int n = Unboxer.openBox(sBox);
		System.out.println("Returned data: "+ n);

	}

}
