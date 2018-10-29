package com.inter;

interface Inter1{
	public int getA();
}

interface Inter2{
	public int getB();
}

interface Inter3 extends Inter1, Inter2{
	public int getData();
}

interface Inter4{
	public String getStr();
}

public class InterMain04 implements Inter3, Inter4{

	@Override
	public int getA() {
		return 10;
	}
	@Override
	public int getB() {
		return 20;
	}
	@Override
	public int getData() {
		return 30;
	}
	@Override
	public String getStr() {
		return "ÀÚ¹Ù";
	}
	
	public static void main(String[] args) {
		InterMain04 i = new InterMain04();
		
		System.out.println(i.getA());
		System.out.println(i.getB());
		System.out.println(i.getData());
		System.out.println();
	}
	
}
