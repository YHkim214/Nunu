package com.instance;


public class MethodMain02 {
	
	public int increase(int n) {
		++n;
		return n;
	}
	
	public static void main(String[] args) {
		int var1 = 100;
		MethodMain02 me = new MethodMain02();
		int var2 = me.increase(var1);
		
		System.out.println(var1);
		System.out.println(var2);
	}
}
