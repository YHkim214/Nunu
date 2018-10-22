package com.instance;

public class Student3 extends Student2{

	Student3(String name, int korean, int math, int english){
		this.name = name;
		this.korean = korean;
		this.math = math;
		this.english = english;
	}
	
	public int getSum() {
		return korean + math + english;
	}
	
	public double getAverage() {
		return getSum() / 3.0;
	}
	
	public void getInfo() { 
		System.out.println("ÀÌ¸§: " + name);
		System.out.println("±¹¾î: " + korean);
		System.out.println("¼öÇÐ: " + math);
		System.out.println("¿µ¾î: " + english);
		System.out.println("ÃÑÁ¡: " + getSum());
		System.out.printf("Æò±Õ: %.2f\n", getAverage());
	}
	
	public String toString() {
		return name;
	}
	
	public static void main(String[] args) {
		
		Student3 student3 = new Student3("È«±æµ¿", 98, 97, 96);
		student3.getInfo();

	}

}