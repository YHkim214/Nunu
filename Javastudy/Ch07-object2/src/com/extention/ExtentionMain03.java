package com.extention;

class A{
	int x = 100;
	private int y = 200;
	
	public int getY() {
		return y;
	}
}

class B extends A{
	int z = 300;
	int y = getY();
}

public class ExtentionMain03 {

	public static void main(String[] args) {

		B b = new B();
		System.out.println(b.x);
		System.out.println(b.getY());
		System.out.println(b.z);
	}

}
