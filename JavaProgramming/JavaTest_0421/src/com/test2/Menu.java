package com.test2;

public enum Menu {
	Pizza(12000), Spaghetti(9000), nuddle(8000);
	int value;
	private Menu(int value) {  //�������� �����ڴ� �� private!!!
		this.value = value;
	}
}
