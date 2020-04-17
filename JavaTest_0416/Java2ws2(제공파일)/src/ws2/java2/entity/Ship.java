package ws2.java2.entity;


public class Ship extends Vehicle1 {
	private int replacement;
	
	
	public Ship(String a, int b, int c, int replacement ) {
		super(a,b,c);
		this.replacement = replacement;
	}

	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" 모 델 명 : " + modelName);
		System.out.println(" 최고속도 : " + maxSpeed + "km/h");
		System.out.println(" 최대정원 : " + numberLimit + "명");
		System.out.println(" 배 수 량 : " + replacement + "톤");
	}

	
	public int getReplacement() {
		return replacement;
	}

	public void setReplacement(int replacement) {
		this.replacement = replacement;
	}

	
}
