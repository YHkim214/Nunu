package com.poly;

class Parent2{
	int a = 10;
	public void make() {
		System.out.println("�θ�Ŭ������ make");
	}
}

class Child2 extends Parent2{
	int a = 20;
	@Override
	public void make() {
		System.out.println("�ڽ�Ŭ������ make");
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
