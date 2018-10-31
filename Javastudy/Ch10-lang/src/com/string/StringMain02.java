package com.string;

import java.util.Arrays;

public class StringMain02 {

	public static void main(String[] args) {
		
		String s1 = "Kwon Sun Ae";
		
		int index = s1.indexOf('n');
		System.out.println(index);
		 
		index = s1.indexOf("Sun");
		System.out.println(index);
		
		index = s1.lastIndexOf('n');
		System.out.println(index);
		
		char c = s1.charAt(index);
		System.out.println(c);
		
		index = s1.indexOf('S');
		String str = s1.substring(index);
		System.out.println(str);
		
		str = s1.substring(index, index + 3); //³¡ ÀÎµ¦½º´Â Æ÷ÇÔ ¾ÈµÊ
		System.out.println(str);
		
		int length = s1.length();
		System.out.println(length);
		
		String[] s2 = s1.split(" ");
		for(String s: s2) {
			System.out.println(s);
		}
	}

}
