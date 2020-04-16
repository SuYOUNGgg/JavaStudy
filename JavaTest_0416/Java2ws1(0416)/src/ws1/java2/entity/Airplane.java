package ws1.java2.entity;

public class Airplane {

	public Airplane() { //개체를 생성하면서 쉽게 맴버 변수에 초기화 할 수 있도록 생성자를 추가
		this.modelName = null;
		this.maxSpeed =0;
		this.numberLimit=0;
		this.numOfEngine=0;		
		this.available = false;
	}
	
	public String getModelName() {
		return modelName;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public int getNumberLimit() {
		return numberLimit;
	}
	public int getNumberOfEngine() {
		return numOfEngine;
	}
	public boolean getAvailable() {
		return available;
	}
	
	public void setModelName(String mN) {
		
		modelName = mN;
	}
	public void setMaxSpeed(int mS) {
		if(mS < 0) {
			maxSpeed = 0;
			return;
		}
		maxSpeed = mS;
	}
	public void setNumberLimit(int nL) {
		if(nL < 0) {
			numberLimit = 0;
			return;
		}
		numberLimit = nL;
	}
	public void setNumberOfEngine(int nOE) {
		if(nOE < 0) {
			numOfEngine = 0;
			return;
		}
		numOfEngine = nOE;
	}
	public void setAvailable(boolean A) {
		if(A == true ) {
			available = false;
			return;
		}
		available = true;
	}
	private String modelName;
	private int maxSpeed;
	private int numberLimit;
	private int numOfEngine;
	private boolean available;
	
	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" 모 델 명 : " + modelName);
		System.out.println(" 최고속도 : " + maxSpeed + "km/h");
		System.out.println(" 최대정원 : " + numberLimit + "명");
		System.out.println(" 엔진개수 : " + numOfEngine + "개");
	}
}
