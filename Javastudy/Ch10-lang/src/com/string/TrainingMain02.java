package com.string;

public class TrainingMain02 {

	public static void main(String[] args) {
		String str ="-";
		String result = "�����Դϴ�";

		for(int i = 1; i < str.length();i++) {
			char c = str.charAt(i);
			
			if(c == '-' && i == 0 && str.length()> 1) {
				continue;
			}
			if(c == '+' && i == 0 && str.length()> 1) {
				continue;
			}
			if(c < 48 || c > 57) {
				result = "���ڰ� �ƴմϴ�";
				break;
			}
		}
		
		System.out.println(result);
		System.out.println("====================");
		result = "�����Դϴ�";
		char[] array = str.toCharArray();
		for(int i = 1; i < array.length;i++) {
			
			if(array[i] == '-' && i == 0 && array.length> 1) {
				continue;
			}
			if(array[i] == '+' && i == 0 && array.length> 1) {
				continue;
			}
			if(!Character.isDigit(array[i])) {
				result = "���ڰ� �ƴմϴ�";
				break;
			}
		}
		System.out.println(result);
		System.out.println("====================");
		result = "�����Դϴ�";
		try {
			Integer.parseInt(str);
		}catch(NumberFormatException e) {
			result = "���ڰ� �ƴմϴ�.";
		}
		System.out.println(result);
	}

}
