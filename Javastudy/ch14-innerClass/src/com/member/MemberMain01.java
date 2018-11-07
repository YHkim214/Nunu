package com.member;

class Outer{
	int x = 100;
	
	class Inner{
		int y = 200;
	}
	
	
}

public class MemberMain01 {
	public static void main(String[] args) {
		Outer o = new Outer();
		//郴何努贰胶 按眉积己 规过
		Outer.Inner oi = o.new Inner();
		
		System.out.println(o.x);
		System.out.println(oi.y);
	}
}
