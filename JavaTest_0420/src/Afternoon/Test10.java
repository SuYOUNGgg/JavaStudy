package Afternoon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Test10 {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>() ;
		a1.add("�ϳ�");
		a1.add("��");
		a1.add("��");
		for(String s :a1) {
			System.out.println(s);
		}
		for(Iterator<String> itr = a1.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}
		List<String> a12 = new ArrayList<String>();
		a12.add("�ϳ�2");
		a12.add("��2");

	}

}
