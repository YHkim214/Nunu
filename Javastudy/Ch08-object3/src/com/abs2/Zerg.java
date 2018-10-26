package com.abs2;

public class Zerg extends Unit{

	public Zerg(String name, boolean fly) {
		super(name, fly);
		this.energy = 100;
	}

	@Override
	public void decEnergy() {
		this.energy -= 6;
	}

}
