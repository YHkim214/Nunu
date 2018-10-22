package com.instance;


public class InstanceMain02 {

	int a;
	boolean b;
	float c;
	
	public static void main(String[] args) {

		InstanceMain02 im;
		im = new InstanceMain02();
		
		System.out.println(im.a);
		System.out.println(im.b);
		System.out.println(im.c);
		
		im.a = 10;
		im.b = true;
		im.c = 4.5f;
		
		System.out.println(im.a);
		System.out.println(im.b);
		System.out.println(im.c);

	}

}