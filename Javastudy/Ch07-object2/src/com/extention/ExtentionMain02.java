package com.extention;

class People{
	public void eat() {
		System.out.println("식사하다");
	}
	public void play() {
		System.out.println("놀다");
	}
}

class Student extends People{
	public void study() {
		System.out.println("공부하다");
	}
}

public class ExtentionMain02 {

	public static void main(String[] args) {
		Student s = new Student();
		s.eat();
		s.study();
		s.play();
	}

}
