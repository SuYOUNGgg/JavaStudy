package ws2.java2.entity;



public class Car extends Vehicle1 {
	private int mileage;
	
	
	public Car(String modelName, int maxSpeed, int numberLimit, int mileage) {
		super(modelName,maxSpeed,numberLimit);
		
		this.mileage = mileage;
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println(" Æò±Õ¿¬ºñ : " + mileage + "km/1");
	}
	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	
}

