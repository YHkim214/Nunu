package com.packtwo;

import com.packone.People;

class Student extends People{
	public void print() {
//		System.out.println(a);
//		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

public class AccessMain02 {

	public static void main(String[] args) {
		Student s = new Student();
//		System.out.println(s.a);
//		System.out.println(s.b);
//		System.out.println(s.c); AccessMain02와 People간에 상속관계가 없기때문에 호출불가능
		System.out.println(s.d);

	}

}
