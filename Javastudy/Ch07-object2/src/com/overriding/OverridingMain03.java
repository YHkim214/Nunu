package com.overriding;

class People{
	
	@Override
	public String toString() {
		return "People";
	}
}

class Student extends People{
	
	@Override
	public String toString() {
		return "Student";
	}
}

class Animal{
	
}

public class OverridingMain03 {

	public static void main(String[] args) {
		People p = new People();
		System.out.println(p);
		System.out.println(p.toString());
		System.out.println("----------------");
		Student s = new Student();
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println("----------------");
		Animal a = new Animal();
		System.out.println(a);
		System.out.println(a.toString());
	}

}