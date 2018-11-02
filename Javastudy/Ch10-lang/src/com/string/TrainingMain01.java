package com.string;

public class TrainingMain01 {

	public static void main(String[] args) {
		
		String str = "abcMDYe-4W?EWzz";
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			char tmp = str.charAt(i);
			if(tmp >= 65 && tmp <= 90) {
				tmp += 32;
			} else if(tmp >= 97 && tmp <= 122) {
				tmp -= 32;
			}
			result += tmp;	
		}
		
		System.out.println(result);
		System.out.println("=================");
		
		String result2 = "";
		
		for(char c : str.toCharArray()) {
			if(Character.isUpperCase(c)) {
				result2 += Character.toLowerCase(c);
			}else if(Character.isLowerCase(c)) {
				result2 += Character.toUpperCase(c);
			}else {
				result2 += c;
			}
			
		}
		
		System.out.println(result2);
		
	}

}