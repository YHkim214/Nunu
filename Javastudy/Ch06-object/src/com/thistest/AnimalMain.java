package com.thistest;

public class AnimalMain {
	public static void main(String[] args) {
		
		Animal a1 = new Animal("기러기", 3, true);
		System.out.println("이름: " + a1.getName());
		System.out.println("나이: " + a1.getAge());
		System.out.println("비행여부: " + a1.isFly());
		System.out.println("==============");
		
		Animal a2 = new Animal();
		a2.setName("코끼리");
		a2.setAge(5);
		a2.setFly(false);
		System.out.println("이름: " + a2.getName());
		System.out.println("나이: " + a2.getAge());
		System.out.println("비행여부: " + a2.isFly());
		
	}
}
