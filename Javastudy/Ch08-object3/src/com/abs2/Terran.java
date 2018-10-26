package com.abs2;

public class Terran extends Unit{
	
	public Terran(String name, boolean fly) {
		super(name, fly);
		this.energy = 100;
	}
	
	@Override
	public void decEnergy() {
		this.energy -= 3;
	}

}
