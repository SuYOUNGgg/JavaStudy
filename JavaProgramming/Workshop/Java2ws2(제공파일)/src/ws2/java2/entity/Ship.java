package ws2.java2.entity;


public class Ship extends Vehicle1 {
	private int replacement;
	
	
	public Ship(String a, int b, int c, int replacement ) {
		super(a,b,c);
		this.replacement = replacement;
	}

	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" �� �� �� : " + modelName);
		System.out.println(" �ְ�ӵ� : " + maxSpeed + "km/h");
		System.out.println(" �ִ����� : " + numberLimit + "��");
		System.out.println(" �� �� �� : " + replacement + "��");
	}

	
	public int getReplacement() {
		return replacement;
	}

	public void setReplacement(int replacement) {
		this.replacement = replacement;
	}

	
}
