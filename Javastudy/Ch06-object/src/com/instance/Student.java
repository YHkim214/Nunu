package com.instance;


public class Student {
	
	//속성(맴버필드)
	String name;
	int age;
	
	void study(String subname) {
		System.out.println(subname + "공부 중 입니다.");
	}
	
	public static void main(String[] args) {
		//객체를 선언, 생성
		Student student = new Student();
		//객체가 생성될 때 멤버변수에 기본값이 할당
		System.out.println(student.name);
		System.out.println(student.age);
		
		//멤버변수에 값을 저장
		student.name = "홍길동";
		student.age = 20;
		
		System.out.println("이름: " + student.name);
		System.out.println("나이: " + student.age);
		
		student.study("수학");
	}
}
