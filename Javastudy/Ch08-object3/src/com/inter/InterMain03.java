package com.inter;

interface InterTest{
	public static final int A = 100;
	public abstract int getA();
}

class InterSub implements InterTest{
	@Override
	public int getA() {
		return InterTest.A;
	}
}

public class InterMain03 {
	public static void main(String[] args) {
		InterSub i = new InterSub();
		System.out.println(i.getA());
	}	
}