
public class Test9 {

	public static void main(String[] args) {
		Dog d = new Dog();
		Animal a = d;
		a.breath();
		
		Dog d1 = (Dog)a;
		d1.Bark();
		d1.breath();
		
		
		Animal a1 = new Dog(); //animal과 dog의 교집합 부분만 산출가능
		a1.breath();
		Animal a2 = new Cat();
		a2.breath();
		
	}
	
}
