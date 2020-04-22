//class myClass {} :여기서만 쓸 수 있음 

public class Test9 {
	// add( , ); 를 여기에 넣게 되면 이 class에서만 쓸 수 있음. 안 넣게 되면 다 접근이 가능함 public같이...
	public static void main(String[] args) {
		Nonemain c = new Nonemain();
		c.add(1, 2);
	 // c.substract(1,2)는 검색 안댐 private로 되어있어서 접근이 안되기 때문
	 // static: 객체화 하지 않고 쓰는 것	
	}

}
