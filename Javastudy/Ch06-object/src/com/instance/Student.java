package com.instance;


public class Student {
	
	//�Ӽ�(�ɹ��ʵ�)
	String name;
	int age;
	
	void study(String subname) {
		System.out.println(subname + "���� �� �Դϴ�.");
	}
	
	public static void main(String[] args) {
		//��ü�� ����, ����
		Student student = new Student();
		//��ü�� ������ �� ��������� �⺻���� �Ҵ�
		System.out.println(student.name);
		System.out.println(student.age);
		
		//��������� ���� ����
		student.name = "ȫ�浿";
		student.age = 20;
		
		System.out.println("�̸�: " + student.name);
		System.out.println("����: " + student.age);
		
		student.study("����");
	}
}
