package com.thistest;

public class LocalVariable {
	int b = 200;
	
	public void make() {
		int a = 100;
		System.out.println(a);
		System.out.println(b);
	}
	
	public void fun() {
//		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + "\t");
		}
		System.out.println("\n-------------");

	}

}
