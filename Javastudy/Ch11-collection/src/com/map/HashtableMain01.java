package com.map;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableMain01 {

	public static void main(String[] args) {
		
		Hashtable<String, String> h = new Hashtable<>();
		h.put("name", "홍길동");
		h.put("age", "20");
		h.put("job", "경찰");
		h.put("hobby", "영화감상");
		h.put("name", "박문수");
		/*h.put("phone", null); //null을 인정하지 않음
		h.put(null, "홍길동"); //null을 인정하지 않음
		*/
		System.out.println(h);
		
		Enumeration<String> enu = h.keys(); //테이블에서는 이걸쓴다.
		
		while(enu.hasMoreElements()) {
			String s = enu.nextElement();
			System.out.println("key: " + s + ", value: " + h.get(s));
		}	
	}
}