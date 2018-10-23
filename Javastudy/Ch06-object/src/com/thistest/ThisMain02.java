package com.thistest;

class ThisTest{
	
	private int a;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
}

public class ThisMain02 {

	public static void main(String[] args) {
		ThisTest tt = new ThisTest();
		tt.setA(100);
		System.out.println(tt.getA());
	}

}
