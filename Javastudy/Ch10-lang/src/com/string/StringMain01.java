package com.string;

public class StringMain01 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
		System.out.println(str1 == str2); //��ü �ּҸ� ��
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3)); //��ü�� ������ ��
		
		String str4 = "bus";
		String str5 = "BUS";
		System.out.println(str4.equalsIgnoreCase(str5)); //��ҹ��� �������� �����
	}

}