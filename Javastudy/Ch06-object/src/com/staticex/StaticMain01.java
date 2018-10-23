package com.staticex;

public class StaticMain01 {
	public static void main(String[] args) {
		
		StaticCount st1 = new StaticCount();
		
		System.out.println(st1.c + "," + StaticCount.count);
		
		StaticCount st2 = new StaticCount();
		
		System.out.println(st2.c + "," + StaticCount.count);
		
		StaticCount st3 = new StaticCount();
		
		System.out.println(st3.c + "," + StaticCount.count);
	}
}