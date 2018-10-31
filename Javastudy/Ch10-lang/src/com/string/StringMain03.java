package com.string;

public class StringMain03 {

	public static void main(String[] args) {
		String s1 = " aBa ";
		String s2 = "abc";
		int a = 100;
		String msg = null;
		
		msg = s1.toUpperCase();
		System.out.println(msg);
		
		msg = s1.toLowerCase();
		System.out.println(msg);
		
		msg = s1.replace("aB", "b");
		System.out.println(msg);
		
		System.out.println(s1.contains("aB"));
		
		System.out.println(s2.startsWith("ab"));
		
		System.out.println(s2.endsWith("bc"));
		
		System.out.println(String.valueOf(a));
		System.out.println(a + "");
		
	}

}
