package com.constructor;

public class ConstMain {
	int korean;
	int english;
	int math;
	int history;
	int science;
	int num;
	
	public ConstMain(int korean, int english, int math) {
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.num = 3;
	}
	
	public ConstMain(int korean, int english, int math, int history, int science) {
		this(korean, english, math);
		this.history = history;
		this.science = science;
		this.num = 5;
	}
	
	public int sum() {
		return korean + english + math + history + science;
	}
	
	public double avg() {
		return (double)sum() / num;
	}
	
	public String toString() {
		return num + "°ú¸ñÀÇ ÃÑÁ¡: " + sum() + ", Æò±Õ:  " + avg();
	}
	
		
	
	public static void main(String[] args) {
		
		ConstMain cm = new ConstMain(90,90,75);
		System.out.println(cm);
		
		ConstMain cm2 = new ConstMain(87,56,77,65,76);
		System.out.println(cm2);
	
	}

}
