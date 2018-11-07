package com.member3;

class Outer{
	
	int value = 10;
	
	class Inner{
		int value = 20;
		
		public void make() {
			int value = 30;
			System.out.println(value); //지역변수
			System.out.println(this.value); //inner의 멤버
			System.out.println(Outer.this.value); //outer의 멤버
		}
	}
	
}

public class MemberMain03 {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner oi = o.new Inner();
		oi.make();
	}
}