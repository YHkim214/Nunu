package com.local;

class Car{
	public String getName() {
		return "�ҳ�Ÿ";
	}
}

public class LocalMain04 {
	
	public Car innerTest(){
		//���� ���� Ŭ������ �����ϸ� Ŭ���� ���� �ڷ������� ����Ҽ� ������, �޼ҵ� ���ο����� ����� �����ϴ�.
		class Inner extends Car{
			@Override
			public String getName(){
				return "�׷���";
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
