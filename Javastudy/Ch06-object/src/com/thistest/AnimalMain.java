package com.thistest;

public class AnimalMain {
	public static void main(String[] args) {
		
		Animal a1 = new Animal("�ⷯ��", 3, true);
		System.out.println("�̸�: " + a1.getName());
		System.out.println("����: " + a1.getAge());
		System.out.println("���࿩��: " + a1.isFly());
		System.out.println("==============");
		
		Animal a2 = new Animal();
		a2.setName("�ڳ���");
		a2.setAge(5);
		a2.setFly(false);
		System.out.println("�̸�: " + a2.getName());
		System.out.println("����: " + a2.getAge());
		System.out.println("���࿩��: " + a2.isFly());
		
	}
}
