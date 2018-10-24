package com.thistest;

public class AnimalMain2 {
	
	public static void main(String[] args) {
		
		Animal a1 = new Animal("기러기", 3, true);
		System.out.println(a1);
		
		Animal a2 = new Animal();
		a2.setName("코끼리");
		a2.setAge(5);
		a2.setFly(false);
		System.out.println(a2);
		
	}
}

