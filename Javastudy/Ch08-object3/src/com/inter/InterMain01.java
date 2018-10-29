package com.inter;

interface A1{
	public static final int W = 10;
	int X = 20; //이것도 상수.
	static int Y = 30;
	final int Z = 40;
}

public class InterMain01 implements A1{
	public static void main(String[] args) {
		System.out.println(A1.W);
		System.out.println(A1.X);
		System.out.println(A1.Y);
		System.out.println(A1.Z);
	}
}
