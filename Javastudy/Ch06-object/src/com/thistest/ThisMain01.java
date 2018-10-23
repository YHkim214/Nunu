package com.thistest;

public class ThisMain01 {
	
	public ThisMain01() {
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		ThisMain01 t = new ThisMain01();
		System.out.println(t);
	}
}
