package com.map;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableMain01 {

	public static void main(String[] args) {
		
		Hashtable<String, String> h = new Hashtable<>();
		h.put("name", "ȫ�浿");
		h.put("age", "20");
		h.put("job", "����");
		h.put("hobby", "��ȭ����");
		h.put("name", "�ڹ���");
		/*h.put("phone", null); //null�� �������� ����
		h.put(null, "ȫ�浿"); //null�� �������� ����
		*/
		System.out.println(h);
		
		Enumeration<String> enu = h.keys(); //���̺����� �̰ɾ���.
		
		while(enu.hasMoreElements()) {
			String s = enu.nextElement();
			System.out.println("key: " + s + ", value: " + h.get(s));
		}	
	}
}