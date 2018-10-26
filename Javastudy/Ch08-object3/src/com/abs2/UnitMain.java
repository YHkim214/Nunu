package com.abs2;

public class UnitMain {
	public static void main(String[] args) {
		Protoss p1 = new Protoss("행복", true);
		p1.decEnergy();
		System.out.println(p1.energy);
		
		Terran t1 = new Terran("파도", false);
		t1.decEnergy();
		System.out.println(t1.energy);
		
		Zerg z1 = new Zerg("승리", false);
		z1.decEnergy();
		System.out.println(z1.energy);
	}
}
