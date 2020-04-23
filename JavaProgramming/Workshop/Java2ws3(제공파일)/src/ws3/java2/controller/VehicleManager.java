package ws3.java2.controller;
import java.util.*;


import ws3.java2.entity.*;

public class VehicleManager {
	//아래 코드는 배열을 참조하는 변수를 선언한 것이다.
	//ArrayList를 참조하도록 새로운 변수를 선언하시오.(변수명은  vehicleList)
	Vehicle[] vehicleArr;
	List<Vehicle> list = new ArrayList<Vehicle>();
	
	public VehicleManager() {
		//아래 코드는 배열을 이용하도록 작성되었다.
		//ArrayList를 사용하도록 수정하시오.
		
		list.add(new Airplane("보잉747", 1300, 300, 4));
		list.add(new Airplane("F-16", 1600, 1, 1));
		list.add(new Car("소나타3", 180, 5, 10));
		list.add(new Car("티코", 130, 4, 15));
		list.add(new Car("스타렉스", 150, 10, 11));
		list.add(new Ship("크루즈2", 30, 400, 35000));
		list.add(new Ship("노틸러스", 25, 150, 15000));
		
		//밑에 array를 위해 list형태로 바꾸기
//		vehicleArr = new Vehicle[7];
//		
//		vehicleArr[0] = new Airplane("보잉747", 1300, 300, 4);
//		vehicleArr[1] = new Airplane("F-16", 1600, 1, 1);
//		vehicleArr[2] = new Car("소나타3", 180, 5, 10);
//		vehicleArr[3] = new Car("티코", 130, 4, 15);
//        vehicleArr[4] = new Car("스타렉스", 150, 10, 11);
//        vehicleArr[5] = new Ship("크루즈2", 30, 400, 35000);
//		vehicleArr[6] = new Ship("노틸러스", 25, 150, 15000);
	}
	
	public void displayVehicles1(String title) {
		//아래 코드는 배열이 가리키는 모든 객체의 정보를 출력하도록 작성되었다.
		//ArrayList인 vehicleList에 담긴 모든 객체를 출력하도록 수정하시오.
		
		System.out.println(title);
		
		for(Vehicle v : list) {
			v.displayInfo();
			v.setAvailable(true);
		}
		
		System.out.println();
	}
	public void displayVehicles2(String title) {
		//아래 코드는 배열이 가리키는 모든 객체의 정보를 출력하도록 작성되었다.
		//ArrayList인 vehicleList에 담긴 모든 객체를 출력하도록 수정하시오.
		
		System.out.println(title);
		
		Iterator<Vehicle> iter = list.iterator();
		while(iter.hasNext()) {
			Vehicle v = iter.next();
			v.displayInfo();
			v.setAvailable(true);
		}
		
		System.out.println();
	}
	public void sortByModelName() {
		//아래 코드는 배열에 대해서 정렬을 수행하는 것이다.
		//ArrayList인 vehicleList에 대해서 정렬을 수행하는 코드로 변환하시오.
		Collections.sort(list);
		
		
	}
	
}


