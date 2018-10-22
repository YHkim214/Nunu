package com.capsule;

class Bus{
	private int number;
	int money;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}

public class PrivateMain {
	
	public static void main(String[] args) {
		
		Bus b = new Bus();
		//b.number = 2121;
		b.money = 10000;

	}

}
