package com.instance;


public class MethodMain04 {

	public int add(int a, int b) {
		return a + b;
	}
	
	public double sum(double n) {
		return n * 2.0;
	}
	
	public static void main(String[] args) {
		
		MethodMain04 me = new MethodMain04();
		System.out.println(me.add(1,4));
		System.out.println(me.sum(5.2));

	}

}
