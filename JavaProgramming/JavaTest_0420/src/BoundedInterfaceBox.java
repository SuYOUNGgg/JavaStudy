interface Eatable {
	public String eat();
}
class Apple2 implements Eatable {
	public String toString() {
		return "I am an apple.";
	}
	
	public String eat() {
		return "It tastes so good!";
	}
}
class Box4<T extends Eatable> {
	T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		System.out.println(ob.eat());
		return ob;
	}
}


class BoundedInterfaceBox {

	public static void main(String[] args) {
		Box4<Apple2> box = new Box4<>();
		box.set(new Apple2());
		
		Apple2 ap = box.get();
		System.out.println(ap);
		

	}

}
