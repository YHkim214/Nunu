package com.local;

class Car{
	public String getName() {
		return "소나타";
	}
}

public class LocalMain04 {
	
	public Car innerTest(){
		//로컬 내부 클래스를 지정하면 클래스 명을 자료형으로 사용할수 있지만, 메소드 내부에서만 사용이 가능하다.
		class Inner extends Car{
			@Override
			public String getName(){
				return "그랜져";
			}
		}
		
		return new Inner();
	}
	
	public static void main(String[] args) {
		LocalMain04 l = new LocalMain04();
		Car c = l.innerTest();
		System.out.println(c.getName());
	}
}
