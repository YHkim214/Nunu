package com.capsule;

class Capsule{
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		if(a < 0) {
			System.out.println("������� �Է��ϼ���");
			return;
		}
		
		this.a = a;
	}
}

public class CapsuleMain {

	public static void main(String[] args) {
		Capsule c = new Capsule();
		c.setA(-2);
		System.out.println(c.getA());
		c.setA(5);
		System.out.println(c.getA());
	}

}