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
		//����Ŭ���� ��ü���� ���
		Outer.Inner oi = o.new Inner();
		
		System.out.println(o.x);
		System.out.println(oi.y);
	}
}
