package com.staticex;

public class StaticMain05 {
	
	public StaticMain05() {
		System.out.println("생성자");
	}
	
	static {
		System.out.println("static 블럭");
	}
	
	{
		System.out.println("실행 블럭");
	}
	
	public static void main(String[] args) {
		StaticMain05 sm5 = new StaticMain05();
	}
}
