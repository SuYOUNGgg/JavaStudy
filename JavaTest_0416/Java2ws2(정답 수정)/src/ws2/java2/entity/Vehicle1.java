package ws2.java2.entity;

public class Vehicle1 { // VehicleManager클래스에서 Vehicle1 클래스를 선언해야하는데 다른 패키지에 있으므로 public꼭!!! 써줘야함.
	protected String modelName; //private일 경우 같은 클래스에서만 접근 가능하기 때문에 상속관계에서 접근할 수 있는 protected로 바꾼다.
	protected int maxSpeed;
	protected int numberLimit;
	protected boolean available;
	
	public Vehicle1(String modelName, int maxSpeed, int numberLimit) {
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
		this.numberLimit = numberLimit;
	}
	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" 모 델 명 : " + modelName);
		System.out.println(" 최고속도 : " + maxSpeed + "km/h");
		System.out.println(" 최대정원 : " + numberLimit + "명");
		
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

}
