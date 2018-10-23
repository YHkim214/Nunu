package com.staticex;

class StaticMethod{
	String s1 = "가을";
	static String s2 = "부산";
	
	public static String getString() {
		return s2;
	}
}

public class StaticMain03 {
	public static void main(String[] args) {
		System.out.println(StaticMethod.getString());
	}
}
