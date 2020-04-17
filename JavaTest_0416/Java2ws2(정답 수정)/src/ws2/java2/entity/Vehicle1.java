package ws2.java2.entity;

public class Vehicle1 { // VehicleManagerŬ�������� Vehicle1 Ŭ������ �����ؾ��ϴµ� �ٸ� ��Ű���� �����Ƿ� public��!!! �������.
	protected String modelName; //private�� ��� ���� Ŭ���������� ���� �����ϱ� ������ ��Ӱ��迡�� ������ �� �ִ� protected�� �ٲ۴�.
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
		System.out.println(" �� �� �� : " + modelName);
		System.out.println(" �ְ�ӵ� : " + maxSpeed + "km/h");
		System.out.println(" �ִ����� : " + numberLimit + "��");
		
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
