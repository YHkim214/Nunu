package com.abs;

abstract class A2{
	private int x;
	public void setX(int x) {
		this.x = x;
	}
	public abstract void make();
}

class B2 extends A2{
	@Override
	public void make() {
		System.out.println("make ¸Þ¼­µå");
	}
}

public class AbstractMain02 {

	public static void main(String[] args) {
		B2 b = new B2();
		b.make();

	}

}
