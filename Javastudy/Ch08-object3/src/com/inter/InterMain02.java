package com.inter;

interface A2{
	public abstract void getA();
	void getB();
}

class B2 implements A2{
	
	@Override
	public void getA() {
		System.out.println("getA �޼��� ȣ��");
	}
	
	@Override
	public void getB() {
		System.out.println("getB �޼��� ȣ��");
	}
	
}

public class InterMain02 {

	public static void main(String[] args) {

	}

}
