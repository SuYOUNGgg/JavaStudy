package ws1.java2.entity;

public class Car {
	
	public Car() {
		this.modelName = null;
		this.maxSpeed =0;
		this.numberLimit=0;
		this.mileage=0;		
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
	public int getMileage() {
		return mileage;
	}
	public boolean getAvailable() {
		return available;
	}
	
	public void setModelName(String mN) {
		if(mN == "") {
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
	public void setMileage(int M) {
		if(M < 0) {
			mileage = 0;
			return;
		}
		mileage = M;
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
	private int mileage;
	private boolean available;
	
	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" 모 델 명 : " + modelName);
		System.out.println(" 최고속도 : " + maxSpeed + "km/h");
		System.out.println(" 최대정원 : " + numberLimit + "명");
		System.out.println(" 평균연비 : " + mileage + "km/l");
	}
}
