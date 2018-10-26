package com.poly;

class Car{
	String color;
	int door;
	
	public void drive() {
		System.out.println("何冯");
	}
	
	public void stop() {
		System.out.println("常");
	}
	
	public void getPower() {
		System.out.println("何空");
	}
}

class FireEngine extends Car{
	public void water() {
		System.out.println("靡厩");
	}
	
	@Override
	public void getPower() {
		System.out.println("何客空");
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
