package com.abs;

abstract class A{
	private int x;
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
}

class B extends A{
	int b = 200;
}

public class AbstractMain01 {

	public static void main(String[] args) {
//		A a = new A();
		B b = new B();
		b.setX(100);
		System.out.println(b.getX());
		System.out.println(b.b);
	}

}
