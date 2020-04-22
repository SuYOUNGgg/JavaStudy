package ws2.java2.entity;



public class Car extends Vehicle1 {
	private int mileage;
	
	
	public Car(String a, int b, int c, int mileage) {
		super(a,b,c);
		
		this.mileage = mileage;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	
}

