package com.method;

public class OverloadingMain {
	
	public void print(int n) {
		System.out.println("���� n = " + n);
	}
	
	public void print(double n) {
		System.out.println("�Ǽ� n = " + n);
	}
	
	public void print(double n, long a) {
		System.out.println("�Ǽ� n = " + n + ", ���� a = " + a);
	}
	
	public void print(long a, double n) {
		System.out.println("�Ǽ� n = " + n + ", ���� a = " + a);
	}
	
	public static void main(String[] args) {
		
		OverloadingMain ol = new OverloadingMain();
		ol.print(100);
		ol.print(100.0);
		ol.print(100.0, 100);
		ol.print(100, 100.0);

	}

}