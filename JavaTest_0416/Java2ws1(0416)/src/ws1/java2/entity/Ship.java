package ws1.java2.entity;

public class Ship {
	public Ship() {
		this.modelName = null;
		this.maxSpeed =0;
		this.numberLimit=0;
		this.replacement=0;		
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
	public int getReplacement() {
		return replacement;
	}
	public boolean getAvailable() {
		return available;
	}
	
	public void setModelName(String mN) {
		if(mN == null) {
			modelName ="";
			return;
		}
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
	public void setReplacement(int R) {
		if(R < 0) {
			replacement = 0;
			return;
		}
		replacement = R;
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
	private int replacement;
	private boolean available;
	
	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" 모 델 명 : " + modelName);
		System.out.println(" 최고속도 : " + maxSpeed + "km/h");
		System.out.println(" 최대정원 : " + numberLimit + "명");
		System.out.println(" 배 수 량 : " + replacement + "톤");
	}
}
