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
//		System.out.println(s.c); AccessMain02�� People���� ��Ӱ��谡 ���⶧���� ȣ��Ұ���
		System.out.println(s.d);

	}

}
