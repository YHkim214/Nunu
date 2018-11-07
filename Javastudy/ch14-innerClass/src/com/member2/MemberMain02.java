package com.member2;

class Outer{
	private int x = 100;
	
	class Inner{
		private int y = 200;
		
		public void make() {
			//outer클래스의 맴버변수 호출가능
			System.out.println(x);
			System.out.println(y);
		}
	}
}

public class MemberMain02 {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner oi = o.new Inner();
		oi.make();
	}
}
