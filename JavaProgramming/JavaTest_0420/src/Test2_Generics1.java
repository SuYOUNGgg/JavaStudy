
class Animal<T> { //���ʸ�ȭ ��
	T b;
	void setBreath(T b) {this.b = b;}
	T getBreath() {
		return b;
	}
}
class Dog {
	@Override
	public String toString() {
		return "Dog";
	}
//	void bark() { System.out.println("Dog bark"); }
}
class Cat {
//	void meow() { System.out.println("Cat meow");}
}
public class Test2_Generics1 {

	public static void main(String[] args) {
			Animal<Dog> a = new Animal<Dog>();
			a.setBreath(new Dog());
			Dog d = a.getBreath(); //(Dog)a.getBreatg �� ĳ���ð����� ��ġ�� �ʾƵ� ��.
			System.out.println(d);

	}

}
