package com.finalex;

class A {
	final int NUM = 10;
	final int TES;
	public static final int Z = 200;
	
	A(int TES){
		this.TES = TES;
	}
	
	A(){
		this.TES = 20;
	}
}

public class FinalMain01 {

	public static void main(String[] args) {
		A a = new A(10);
		System.out.println(a.NUM);
		System.out.println(a.TES);
//		a.NUM = 20;
		
		System.out.println(A.Z);
	}

}