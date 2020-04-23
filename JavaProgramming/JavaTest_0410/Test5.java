import com.acompany.*; //acompany 안에 있는 모든 클래스를 사용할 수 있게 한다는 의미
import com.bcompany.*; 


public class Test5 {

	public static void main(String[] args) {
//		Employee emp3 = new Employee(); 이렇게 쓰면 com.acompany랑  com.bcompany 중 혼동이 와서 오류생김
		com.acompany.Employee emp = new com.acompany.Employee();
		com.bcompany.Employee emp2 = new com.bcompany.Employee();


	}

}
