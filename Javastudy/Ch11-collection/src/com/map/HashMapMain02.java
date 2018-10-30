package com.map;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapMain02 {
	public static void main(String[] args) {
		String[] msg = {"Berlin", "Paris", "Seoul", "New York", "London"};
		
		HashMap<Integer,String> map = new HashMap<>();
		
		int i = 1;
		for(String s: msg) {
			map.put(i++, s);
		}
		
		Iterator<Integer> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println(map.get(key));
		}
	}
}
