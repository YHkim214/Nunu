package com.map;

import java.util.HashMap;

public class HashMapMain01 {
	public static void main(String[] args) {
		HashMap<String, Integer> m = new HashMap<>();
		m.put("김신", 95);
		m.put("지은탁", 100);
		m.put("저승사자", 85);
		m.put("써니", 93);
		m.put("유덕화", 70);
		m.put("지은탁", 0);
		m.put("지은탁엄마", null);//null값을 넣을 수 있음
		m.put(null, 100);//null값을 넣을 수 있음
		System.out.println(m.entrySet());
		System.out.println(m.get(null));
		
	}
}
