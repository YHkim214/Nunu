package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain {

	public static void main(String[] args) {
		String[] array = {"Java", "JSP", "Java", "Android"};
		HashSet<String> h = new HashSet<>();
		
		for(String s: array) {
			h.add(s);
		}
		
		Iterator<String> it = h.iterator();
		
		while(it.hasNext()) { //���ͷ����� ����. remind����.
			System.out.println(it.next());
		}
		
		for(String s: h) {
			System.out.println(s);
		}
	}

}
