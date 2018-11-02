package com.string;

public class TrainingMain02 {

	public static void main(String[] args) {
		String str ="-";
		String result = "숫자입니다";

		for(int i = 1; i < str.length();i++) {
			char c = str.charAt(i);
			
			if(c == '-' && i == 0 && str.length()> 1) {
				continue;
			}
			if(c == '+' && i == 0 && str.length()> 1) {
				continue;
			}
			if(c < 48 || c > 57) {
				result = "숫자가 아닙니다";
				break;
			}
		}
		
		System.out.println(result);
		System.out.println("====================");
		result = "숫자입니다";
		char[] array = str.toCharArray();
		for(int i = 1; i < array.length;i++) {
			
			if(array[i] == '-' && i == 0 && array.length> 1) {
				continue;
			}
			if(array[i] == '+' && i == 0 && array.length> 1) {
				continue;
			}
			if(!Character.isDigit(array[i])) {
				result = "숫자가 아닙니다";
				break;
			}
		}
		System.out.println(result);
		System.out.println("====================");
		result = "숫자입니다";
		try {
			Integer.parseInt(str);
		}catch(NumberFormatException e) {
			result = "숫자가 아닙니다.";
		}
		System.out.println(result);
	}

}
