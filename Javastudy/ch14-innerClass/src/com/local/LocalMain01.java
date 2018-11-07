package com.local;

public class LocalMain01 {
	
	public void innerTest() {
		//로컬 내부 클래스
		class Inner{
			public void getData() {
				System.out.println("Local 내부 클래스");
			}
		}
		//로컬 내부 클래스 객체 생성
		new Inner().getData();
	}
	
	public static void main(String[] args) {
		LocalMain01 l = new LocalMain01();
		l.innerTest();
	}
}
