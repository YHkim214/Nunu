package com.superex;

class Parent{
	
	int a = 100;
	
	public void play() {
		System.out.println("parent�� play �޼���");
	}
}

class Child extends Parent{
	
	public Child() {
		System.out.println(super.a);
		super.play();
		System.out.println("=================");
	}
	
	int a = 200;
	
	public void play() {
		System.out.println("child�� play �޼���");
	}
}

public class SuperMain02 {
	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.a);
		ch.play();

	}
}