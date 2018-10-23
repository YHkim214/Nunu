package com.thistest;

public class Animal {
	private String name;
	private int age;
	private boolean fly;
	
	public Animal() {}
	
	public Animal(String name, int age, boolean fly) {
		setName(name);
		setAge(age);
		setFly(fly);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String isFly() {
		if(fly == true) return "가능";
		else return "불가능";
	}
	public void setFly(boolean fly) {
		this.fly = fly;
	}

}