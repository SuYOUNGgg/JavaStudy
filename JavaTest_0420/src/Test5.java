class Apple extends Object {}

//class Box1 extends Object {
//	private Object a;
//	public Box1(Apple a) {
//		this.a = a;
//	}
//	public void setBox1(Object a) {
//		this.a = a;
//	}
//	public Object getBox1() {
//		return this.a = a;
//	}
//}
//public class Test5 {
//
//	public static void main(String[] args) {
//		Object o = new Apple();
//		Object o1;
//		o1 = new Apple();
//		Box1 b = new Box1(new Apple());
//		Apple a = (Apple)b.getBox1();
//	}
//
//}
class Box1<T> extends Object {
	private T a;
	public Box1(T a) {
		this.a = a;
	}
	public void setBox1(T a) {
		this.a = a;
	}
	public T getBox1() {
		return this.a = a;
	}
}
public class Test5 {

	public static void main(String[] args) {
		Object o = new Apple();
		Object o1;
		o1 = new Apple();
		Box1<Apple> b = new Box1<Apple>(new Apple());
		Apple a = b.getBox1();
	}

}