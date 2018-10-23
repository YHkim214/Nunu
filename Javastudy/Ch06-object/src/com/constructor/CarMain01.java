package com.constructor;

class Car{
	String color;
	String gearType;
	int door;
	
	public Car() {};
}

	public class CarMain01 {

	public static void main(String[] args) {
		Car c = new Car();
		
		c.color = "white";
		c.gearType = "auto";
		c.door = 4;
		
		System.out.println(c.color);
		System.out.println(c.gearType);
		System.out.println(c.door);

	}

}