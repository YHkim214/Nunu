package com.map;

import java.util.HashMap;

public class HashMapMain01 {
	public static void main(String[] args) {
		HashMap<String, Integer> m = new HashMap<>();
		m.put("���", 95);
		m.put("����Ź", 100);
		m.put("���»���", 85);
		m.put("���", 93);
		m.put("����ȭ", 70);
		m.put("����Ź", 0);
		m.put("����Ź����", null);//null���� ���� �� ����
		m.put(null, 100);//null���� ���� �� ����
		System.out.println(m.entrySet());
		System.out.println(m.get(null));
		
	}
}
