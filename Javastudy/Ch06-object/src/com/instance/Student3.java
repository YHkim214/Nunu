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
		System.out.println("�̸�: " + name);
		System.out.println("����: " + korean);
		System.out.println("����: " + math);
		System.out.println("����: " + english);
		System.out.println("����: " + getSum());
		System.out.printf("���: %.2f\n", getAverage());
	}
	
	public String toString() {
		return name;
	}
	
	public static void main(String[] args) {
		
		Student3 student3 = new Student3("ȫ�浿", 98, 97, 96);
		student3.getInfo();

	}

}