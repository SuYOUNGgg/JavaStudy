
public class Test10 {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.breath();
		d.Bark();
		
		Cat c = new Cat();
		c.breath();
		c.Meow();
		
		
		Animal a = d;//Dog object이고, Animal type
		a.breath();
		Dog d2= (Dog)a; //다시 animal에서 dog로 캐스팅하기
		d2.Bark();
		d2.breath();
		
		Animal a1 = c; //Cat object이고, Animal type
		a1.breath();
		Cat c2 = (Cat)a1;
		c2.breath();
		c2.Meow();
		
		Animal a3 = new Dog();
		a3.breath();
		Dog d3 = (Dog)a3;
		d3.Bark();
		d3.breath();
		
		Animal a4 = new Cat();
		a4.breath();
		Cat c3 = (Cat)a4;
		c3.breath();
		c3.Meow();
		
//		Animal a10 = new Animal();
//		Dog d10 = (Dog)a10; //에러 안뜨지만, Run타임에서 오류 생김 
//		
//		Dog d11 = new Dog();
//		d11.Bark();
//		
//		Animal a11 = d11;//에러 안뜨지만, Run타임에서 오류 생김 
//		Cat c11 = (Cat)a11;//에러 안뜨지만, Run타임에서 오류 생김 
		
		Object o = new Dog();
		Dog x = (Dog)o;
		x.Bark();
	
	
		

	}

}
