package com.extention;

class People{
	public void eat() {
		System.out.println("�Ļ��ϴ�");
	}
	public void play() {
		System.out.println("���");
	}
}

class Student extends People{
	public void study() {
		System.out.println("�����ϴ�");
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
