package com.constructor;

class Car2{
	String color;
	String gearType;
	int door;
	
	public Car2() {}
	
	public Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	public String toString() {
		return "[" + color + ", " + gearType + ", " + door + "]";
	}
}

public class CarMain02 {

	public static void main(String[] args) {
		
		Car2 c1 = new Car2("white", "auto", 4);
		System.out.println(c1);
		
		Car2 c2 = new Car2();
		System.out.println(c2);

	}

}
