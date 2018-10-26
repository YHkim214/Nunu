package com.abs2;

public abstract class Unit {
	
	protected String name;
	protected int energy;
	boolean fly;
	
	public Unit(String name, boolean fly) {
		this.name = name;
		this.fly = fly;
		this.energy = 100;
	}
	
	abstract public void decEnergy();
	public int getEnergy() {
		return energy;
	}
	
}
