package com.abs2;

public class Protoss extends Unit{
	
	public Protoss(String name, boolean fly) {
		super(name, fly);
		this.energy = 100;
	}
	
	@Override
	public void decEnergy() {
		this.energy--;
	}
	
}
