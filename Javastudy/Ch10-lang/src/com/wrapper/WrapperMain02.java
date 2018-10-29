package com.wrapper;

public class WrapperMain02 {

	public static void main(String[] args) {
		Integer obj1 = new Integer(12);
		Integer obj2 = new Integer(7);
		
		int i = obj1.intValue();
		int i2 = obj2.intValue();
		
		int result = i + i2;
		
		System.out.println(result);
		
		Integer obj3 = 10;
		Integer obj4 = 20;
		
		int result2 = obj3 + obj4;
	}

}
