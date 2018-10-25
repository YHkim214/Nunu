package com.poly;

class A {
	public void make() {
		System.out.println("make 메서드");
	}
}

class B extends A{
	public void play() {
		System.out.println("play 메서드");
	}
}

public class PolyMain02 {

	public static void main(String[] args) {
		
		B b = new B();
		b.make();
		b.play();
		
		A a = b; //업캐스팅
		a.make();
//		a.play();
		
		B b2 = (B)a; //다운캐스팅
		b2.make();
		b2.play();

	}

}