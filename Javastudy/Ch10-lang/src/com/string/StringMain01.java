package com.string;

public class StringMain01 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
		System.out.println(str1 == str2); //객체 주소를 비교
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3)); //객체의 내용을 비교
		
		String str4 = "bus";
		String str5 = "BUS";
		System.out.println(str4.equalsIgnoreCase(str5)); //대소문자 구별없이 내용비교
	}

}