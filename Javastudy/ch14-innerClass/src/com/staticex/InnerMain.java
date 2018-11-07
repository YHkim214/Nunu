package com.staticex;

public class InnerMain {
	
	//내부클래스에만 static을 명시할 수 있다. 일반 클래스에는 불가능.
	//내부 클래스에 static 멤버를 포함하고 싶다면, static내부 클래스를 만들어야한다.
	public static class StaticInner{
		int iv = 200;
		static int cv = 300;
		public static void make() {
			System.out.println("하하");
		}
	}
	
	public static void main(String[] args) {
		//내부클래스에 static을 명시하면, 내부클래스를 감싸고있는 클래스 객체 생성없이 객체생성가능.
		StaticInner s = new StaticInner();
		System.out.println(s.iv);
		System.out.println(StaticInner.cv);
		StaticInner.make();
	}
}