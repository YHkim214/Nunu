package com.inter;

interface A2{
	public abstract void getA();
	void getB();
}

class B2 implements A2{
	
	@Override
	public void getA() {
		System.out.println("getA 메서드 호출");
	}
	
	@Override
	public void getB() {
		System.out.println("getB 메서드 호출");
	}
	
}

public class InterMain02 {

	public static void main(String[] args) {

	}

}
