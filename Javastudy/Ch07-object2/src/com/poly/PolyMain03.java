package com.poly;

class Parent2{
	int a = 10;
	public void make() {
		System.out.println("부모클래스의 make");
	}
}

class Child2 extends Parent2{
	int a = 20;
	@Override
	public void make() {
		System.out.println("자식클래스의 make");
	}
}

public class PolyMain03 {

	public static void main(String[] args) {
		
		Child2 ch = new Child2();
		System.out.println(ch.a);
		ch.make();
		
		Parent2 p2 = ch;
		System.out.println(p2.a);
		p2.make();
	}

}
