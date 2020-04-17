package ws2.java2.controller;

import ws2.java2.entity.*;

public class VehicleManager { 
	Vehicle1[] vehicleArr; 


	public VehicleManager() {
		vehicleArr = new Vehicle1[7];
//		airplaneArr = new Airplane[2];
//		carArr = new Car[3];
//		shipArr = new Ship[2];
//		
//		airplaneArr[0] = new Airplane("����747", 1300, 300, 4);
//		airplaneArr[1] = new Airplane("F-16", 1600, 1, 1);
//		
//		carArr[0] = new Car("�ҳ�Ÿ3", 180, 5, 10);
//		carArr[1] = new Car("Ƽ��", 130, 4, 15);
//		carArr[2] = new Car("��Ÿ����", 150, 10, 11);
//		
//		shipArr[0] = new Ship("ũ����2", 30, 400, 35000);
//		shipArr[1] = new Ship("��ƿ����", 25, 150, 15000);
		
		vehicleArr[0] = new Airplane("����747", 1200, 300, 4);
		vehicleArr[1] = new Airplane("F-16", 1600, 1, 1);
		vehicleArr[2] = new Car("�ҳ�Ÿ3", 180, 5, 10);
		vehicleArr[3] = new Car("Ƽ��", 130, 4, 15);
		vehicleArr[4] = new Car("��Ÿ����", 150, 10, 11);
		vehicleArr[5] = new Ship("ũ����2", 30, 400, 35000);
		vehicleArr[6] = new Ship("��ƿ����", 25, 150, 15000);
		
	}
	
	public void displayVehicles(String title) {
		System.out.println(title);
		
		for (int inx = 0 ; inx < vehicleArr.length ; inx++) {
			vehicleArr[inx].displayInfo();
			vehicleArr[inx].setAvailable(true);
		}
		
		
		System.out.println();
	}
}

