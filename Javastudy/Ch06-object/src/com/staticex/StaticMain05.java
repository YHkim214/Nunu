package com.staticex;

public class StaticMain05 {
	
	public StaticMain05() {
		System.out.println("������");
	}
	
	static {
		System.out.println("static ��");
	}
	
	{
		System.out.println("���� ��");
	}
	
	public static void main(String[] args) {
		StaticMain05 sm5 = new StaticMain05();
	}
}
