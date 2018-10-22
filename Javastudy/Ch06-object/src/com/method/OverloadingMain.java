package com.method;

public class OverloadingMain {
	
	public void print(int n) {
		System.out.println("정수 n = " + n);
	}
	
	public void print(double n) {
		System.out.println("실수 n = " + n);
	}
	
	public void print(double n, long a) {
		System.out.println("실수 n = " + n + ", 정수 a = " + a);
	}
	
	public void print(long a, double n) {
		System.out.println("실수 n = " + n + ", 정수 a = " + a);
	}
	
	public static void main(String[] args) {
		
		OverloadingMain ol = new OverloadingMain();
		ol.print(100);
		ol.print(100.0);
		ol.print(100.0, 100);
		ol.print(100, 100.0);

	}

}
