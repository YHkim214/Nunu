package com.extention;

class Parent extends Object{
	int a = 100;
}

class Child extends Parent{
	int b = 200;
}

public class ExtentionMain01 {

	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.a);
		System.out.println(ch.b);
	}

}
