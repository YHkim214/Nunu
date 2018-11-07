package com.enumex;

enum Lesson{JAVA, XML, JSP}

public class EnumMain02 {
	public static void main(String[] args) {
		System.out.println(Lesson.JAVA);
		System.out.println(Lesson.XML);
		System.out.println(Lesson.JSP);
		System.out.println("======================");
		
		//열거객체의 문자열 반환
		System.out.println(Lesson.JAVA.name());
		System.out.println(Lesson.XML.name());
		System.out.println(Lesson.JSP.name());
		System.out.println("======================");
		
		System.out.println(Lesson.JAVA.ordinal());
		System.out.println(Lesson.XML.ordinal());
		System.out.println(Lesson.JSP.ordinal());
	}
}