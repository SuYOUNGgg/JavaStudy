package com.test;

import java.util.function.Consumer;

interface Database2 {
	void open(String dbName);
}

public class Test6 {

	public static void main(String[] args) {
		Database2 db = (dbName) -> {  //return����
				System.out.println(dbName + " open");
		};
		
		Consumer<String> o = (dbName) -> { //consumer�� ����ϸ� ���� ���� �������̽��� ������ �ʿ䰡 ����
			System.out.println(dbName +" open");
		};
		o.accept("Database");

	}

}
