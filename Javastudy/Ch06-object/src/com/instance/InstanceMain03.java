package com.instance;


public class InstanceMain03 {

	int a;
	int b;
	
	public int add(int n, int m) {
		return n + m;
	}
	
	public void print(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		InstanceMain03 im = new InstanceMain03();
		
		im.a = 100;
		im.b = 200;
		
		System.out.println(im.a);
		System.out.println(im.b);
		
		int result = im.add(3, 8);
		System.out.println("result = " + result);
		
		im.print("오늘은 월요일!");
	}

}
