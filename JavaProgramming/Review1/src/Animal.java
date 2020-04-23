class Animalll {
	public void breathing() {
		System.out.println("Animal breathing");
	}
}
class Dog extends Animalll {
	public void breathing() {
		System.out.println("Dog breathing");
	}
}
class Cat extends Animalll {
	public void breathing() {
		System.out.println("Cat breathing");
	}
}


public class Animal{

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.breathing();
		Animalll animal = dog;
		animal.breathing();
		Cat cat = new Cat();
		cat.breathing();

	}

}
