package ws3.java2.driver;

import ws3.java2.controller.*;

public class VehicleDriver {
	public static void main(String[] args) {
		VehicleManager vm = new VehicleManager();
		vm.displayVehicles1(">> 재고 목록 <<");
		vm.sortByModelName();
		vm.displayVehicles2(">> 최고속도 순으로 정렬된 재고 목록 <<");
	}
}
