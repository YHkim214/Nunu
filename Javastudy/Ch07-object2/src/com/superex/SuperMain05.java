package com.superex;

class Parent2{
	int a;
	int b;
	
	public Parent2(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

class Child2 extends Parent2{

	public Child2(int a, int b) {
		super(a, b);
	}
	
}

public class SuperMain05 {

	public static void main(String[] args) {
		Child2 ch = new Child2(100, 200);
		System.out.println(ch.a);
		System.out.println(ch.b);
	}

}