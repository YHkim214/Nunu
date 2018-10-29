package com.wrapper;

public class WrapperMain01 {
	public static void main(String[] args) {
		
		boolean b = true;
		
		Boolean wrap_b = new Boolean(b);
		
		boolean b2 = wrap_b.booleanValue();
		System.out.println(b2);
		
		char c = 'A';
		
		Character wrap_c = new Character(c);
		
		char c2 = wrap_c.charValue();
		System.out.println(c2);
		
		Integer wrap_i = new Integer(200);
		int i = wrap_i.intValue();
	}
}
