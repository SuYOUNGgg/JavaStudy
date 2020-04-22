package ws2.java2.entity;



public class Airplane extends Vehicle1 {
	private int numOfEngine;
	
	public Airplane(String a, int b, int c, int numOfEngine) {
		super(a,b,c);
		
		this.numOfEngine = numOfEngine;
	}

	public int getNumOfEngine() {
		return numOfEngine;
	}

	public void setNumOfEngine(int numOfEngine) {
		this.numOfEngine = numOfEngine;
	}

	
	
	public void displayInfo() {
		System.out.println(" 엔진개수 : " + numOfEngine + "개");
	}
}


