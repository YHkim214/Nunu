package com.superex;

class People{
	int a = 100;
	public People() {
		super();
	}
}

class Student extends People{
	int b = 200;
	public Student() {
		super();
	}
}

public class SuperMain03 {

	public static void main(String[] args) {
		
		Student st = new Student();
		System.out.println(st.a);
		System.out.println(st.b);

	}

}