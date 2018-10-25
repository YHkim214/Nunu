package com.superex;

class Parent{
	
	int a = 100;
	
	public void play() {
		System.out.println("parent의 play 메서드");
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
		System.out.println("child의 play 메서드");
	}
}

public class SuperMain02 {
	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.a);
		ch.play();

	}
}