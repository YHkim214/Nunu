package com.poly;

class Car{
	String color;
	int door;
	
	public void drive() {
		System.out.println("�η�");
	}
	
	public void stop() {
		System.out.println("��");
	}
	
	public void getPower() {
		System.out.println("�ο�");
	}
}

class FireEngine extends Car{
	public void water() {
		System.out.println("�Ҿ�");
	}
	
	@Override
	public void getPower() {
		System.out.println("�οͿ�");
	}
}

public class PolyMain05 {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		fe.drive();
		fe.stop();
		fe.water();
		fe.getPower();
		
		System.out.println("----------------");
		
		Car c = fe;
		c.drive();
		c.stop();
//		c.water();
		c.getPower();
	}

}
