
public class Test8 {

	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
						//Animal�� Dog�� ����
		Animal a1 = d; //d�� Animal�� type change�� �ؼ� ���� Animal�� Ÿ���� �� �� �ִ�. �ٲ� Ÿ���� ���� �� �� ����. d��
		a1.breath();
		Dog d1 = (Dog)a1; //ĳ���� : �ִϸ��� �������� ������ ���ȱ� ������ 'ĳ����'������ �ʿ���
		d1.Bark(); //������ ĳ������ �ؼ� d1�� dog�� �� �� ����
		
		
		Cat c = new Cat();
		Animal a2 = c;
		
	
	}
	static void Test(Dog d) {}
	static void Test2(Cat d) {}
}
