package com.superex;

class People2{
	int a;
	public People2(int a) {
		this.a = a;
	}
}

class Student2 extends People2{
	public Student2() {
		super(20);
	}
}

public class SuperMain04 {

	public static void main(String[] args) {
		Student2 st = new Student2();
		System.out.println(st.a);

	}

}
