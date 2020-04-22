
public class Test8 {

	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
						//Animal이 Dog의 상위
		Animal a1 = d; //d가 Animal로 type change를 해서 이제 Animal의 타입을 쓸 수 있다. 바뀐 타입의 값만 쓸 수 있음. d만
		a1.breath();
		Dog d1 = (Dog)a1; //캐스팅 : 애니몰을 상위에서 하위로 내렸기 때문에 '캐스팅'과정이 필요함
		d1.Bark(); //위에서 캐스팅을 해서 d1이 dog를 쓸 수 있음
		
		
		Cat c = new Cat();
		Animal a2 = c;
		
	
	}
	static void Test(Dog d) {}
	static void Test2(Cat d) {}
}
