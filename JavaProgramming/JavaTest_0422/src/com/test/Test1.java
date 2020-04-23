package com.test;
import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		ArrayList<String> a11 = new ArrayList();
		a11.add("A") ;
		a11.add("B");
		a11.add("C");
		a11.add("D");
		
		for(int inx =0; inx < a11.size(); inx++) {
			System.out.println(a11.get(inx));
		}
		for(String s : a11) {
			System.out.println(s);
		}
		Iterator<String> lts= a11.iterator();
		while(lts.hasNext()) {
			System.out.println(lts.next());
		}
		
		HashSet hs = new HashSet(); //중복된 결과값은 생략되고, 알파벳순으로 정렬돼서 출력된다.
		hs.add("B");
		hs.add("A");
		hs.add("A");
		System.out.println(hs);
		
		HashSet<String> hs2 = new HashSet<>();
		hs2.add("C");
		hs2.add("B");
		hs2.add("B");
		Iterator<String> hslts = hs2.iterator();
		while(hslts.hasNext()) {
			System.out.println(hslts.next());
		}
		//map k, v -> dictionary
		Map map = new HashMap();
		map.put(1,"one");
		map.put(3, "three");
		map.put(2, "two");
		//괄호 안에서 앞에 있는 것이 key인데 iterator로 출력하려면 key를 먼저 뽑아내야함.
		Set set = map.entrySet();
		Iterator lts2 = set.iterator();
		while(lts2.hasNext()) {
			Object o = lts2.next();
			Map.Entry e = (Map.Entry)o;
			System.out.println(e.getKey() + ", "+ e.getValue());
		}
		Map<Integer,String> map2 = new HashMap<>();
		map2.put(1, "Test1");
		map2.put(2, "Test2");
		for(Map.Entry m : map2.entrySet()) {
			System.out.println(m.getKey()+", "+m.getValue());
		}
		

	}
}