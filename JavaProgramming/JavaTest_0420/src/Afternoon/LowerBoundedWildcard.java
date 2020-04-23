package Afternoon;
import java.util.ArrayList;

public class LowerBoundedWildcard {

	static Double add(ArrayList <? extends Number> num ) {
		double sum = 1.1;
		for(Number n:num) {//n�� ���� num���ǿ� �´� ��� for���� ����??
			sum += n.doubleValue();
		}
		return sum;
	}
	public static void main(String[] args) {
		ArrayList<Double> a1 = new ArrayList<Double>();
		a1.add(10.0);
		a1.add(20.0);
		System.out.println(add(a1));

	}

}
