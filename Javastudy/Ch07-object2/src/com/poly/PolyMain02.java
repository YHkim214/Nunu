package com.poly;

class A {
	public void make() {
		System.out.println("make �޼���");
	}
}

class B extends A{
	public void play() {
		System.out.println("play �޼���");
	}
}

public class PolyMain02 {

	public static void main(String[] args) {
		
		B b = new B();
		b.make();
		b.play();
		
		A a = b; //��ĳ����
		a.make();
//		a.play();
		
		B b2 = (B)a; //�ٿ�ĳ����
		b2.make();
		b2.play();

	}

}