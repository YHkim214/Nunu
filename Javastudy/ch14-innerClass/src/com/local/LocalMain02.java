package com.local;

public class LocalMain02 {
	int a = 100;
	
	public void innerTest() {
		
		class Inner{
			public void getData() {
				System.out.println("������: " + a);
				a = 200;
				System.out.println("������: " + a);
			}
		}
		
		Inner i = new Inner();
		i.getData();
	}
	
	public static void main(String[] args) {
		LocalMain02 l = new LocalMain02();
		l.innerTest();
	}
}
