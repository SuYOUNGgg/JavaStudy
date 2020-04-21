package com.test1;
import java.util.*;
public class Test1 {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		List<String> l2 = new LinkedList<String>();
		List<String> l3 = new Vector<String>();
		List<String> l4 = new Stack<String>();
		l1.add("one");
		l1.add("two");
		l1.add("three");
		l1.add("apple");
		
		
		
		Iterator<String> ltr = l1.iterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		System.out.println();
		for(int inx = 0; inx<l1.size(); inx++) {
			System.out.println(l1.get(inx));
		}
		for(String s : l1) {
			System.out.println(s);
		}
		System.out.println("-sort-");
		Collections.sort(l1);
		for(String s :l1) {
			System.out.println(s);
		}
	}
}
