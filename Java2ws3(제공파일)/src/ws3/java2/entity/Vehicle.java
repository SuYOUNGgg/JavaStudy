package ws3.java2.entity;

public abstract class Vehicle implements Comparable  { //sort정렬을 하기 위해서 implements Comparable넣는다.
	private String modelName;
	private int maxSpeed;
	private int numberLimit;
	private boolean available;
	
	public Vehicle() {
	}
	@Override
	public int compareTo(Object o) {  //객체의 정렬기준을 만든다.
		Vehicle v = (Vehicle)o;
		if(this.maxSpeed > v.maxSpeed)
			return 1;
		else if(this.maxSpeed < v.maxSpeed)
			return -1;
		else		
			return 0;
	}
	
	
	public Vehicle(String modelName, int maxSpeed, int numberLimit) {
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
		this.numberLimit = numberLimit;
	}
	
	public String getModelName() {
		return modelName;
	}
	
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public int getNumberLimit() {
		return numberLimit;
	}
	
	public void setNumberLimit(int numberLimit) {
		this.numberLimit = numberLimit;
	}
	
	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" 모 델 명 : " + modelName);
		System.out.println(" 최고속도 : " + maxSpeed + "km/h");
		System.out.println(" 최대정원 : " + numberLimit + "명");
	}
}
