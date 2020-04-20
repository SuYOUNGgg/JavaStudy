package Afternoon;

interface IAnimal4<T> {
	void set(T t);
	T get();
	void breath();
}
class Animal4<T> implements IAnimal4<T> {
	T animal;
	@Override
	public void set(T t) {
		this.animal = t;
		
	}
	@Override
	public T get() {
		return this.animal;
	}
	@Override
	public void breath() {
		System.out.println("Animal breath"); 
	}
}
class Dog4 {} 

public class Test13 {

	public static void main(String[] args) {
		Animal4<Dog4> a = new Animal4<Dog4>();
		a.set(new Dog4());
		Dog4 a1 = a.get();
		

	}

}
