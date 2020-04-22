package com.test;

import java.util.function.Consumer;

interface Database2 {
	void open(String dbName);
}

public class Test6 {

	public static void main(String[] args) {
		Database2 db = (dbName) -> {  //return없음
				System.out.println(dbName + " open");
		};
		
		Consumer<String> o = (dbName) -> { //consumer를 사용하면 위에 굳이 인터페이스를 선언할 필요가 없음
			System.out.println(dbName +" open");
		};
		o.accept("Database");

	}

}
