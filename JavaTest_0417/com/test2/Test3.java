package com.test2;
class User {
	public String id;
	public String password;
	
	public boolean equals(Object o) { //Object o = new User();
		User user =(User)o;
		boolean checkFlag = false;
		if(this.id == "test"&& this.password =="1234") {
			checkFlag = true;
			}
		return checkFlag;
	}
}


public class Test3 {

	public static void main(String[] args) {
		User u = new User();
		u.id ="test";
		u.password ="1234";
		User u2 = new User();
		u2.id ="test";
		u2.password = "1111";
		if(u.equals(u2)) {
			System.out.println("Equal a user");
		}

		
		Object o = new Object();
		Object o1 = new Object();
		Object o2 = o;
		
		if(o.equals(o2)) {  //equals는 인스턴스 비교할 때
			System.out.println("Equal");
		} else {
			System.out.println("No equal");
		}
	}

}
