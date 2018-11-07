package com.local;

public class LocalMain03 {

	public void innerTest1() {
		//jdk 7.0 이하에서는 지역변수를 로컬 내부 클래스에서 사용할수 없기때문에 상수임을 명시해야 한다.
		//jdk 8.0 부터는 자동으로 상수 처리된다.
		//지역변수
		final int b = 200;
		
		//로컬 내부클래스
		class Inner{
			public void getData() {
//				b = 100; 상수기 때문에 변경 불가능
				System.out.println(b);
			}
		}
		
		Inner i = new Inner();
		i.getData();
		
	}
	
	public static void main(String[] args) {
		LocalMain03 l = new LocalMain03();
		l.innerTest1();
	}
}