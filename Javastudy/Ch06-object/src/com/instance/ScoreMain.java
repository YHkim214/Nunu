package com.instance;

import java.util.Scanner;

class Score{
	String name;
	int korean;
	int math;
	int english;

	Score(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("�̸�: ");
		this.name = scanner.next();
		System.out.print("����: ");
		this.korean = scanner.nextInt();
		System.out.print("����: ");
		this.math = scanner.nextInt();
		System.out.print("����: ");
		this.english = scanner.nextInt();
		scanner.close();
	}

	public int getSum() {
		return korean + math + english;
	}

	public int getAvg() {
		return getSum() / 3;
	}

	public String getGrade() {

		switch(getAvg() / 10) {

		case 10: case 9:
			return "A";
		case 8:
			return "B";
		case 7:
			return "C";
		case 6:
			return "D";
		default:
			return "F";
		}

	}

	public void getInfo() { 
		System.out.println("�̸�: " + name);
		System.out.println("����: " + korean);
		System.out.println("����: " + math);
		System.out.println("����: " + english);
		System.out.println("����: " + getSum());
		System.out.printf("���: %d\n", getAvg());
		System.out.printf("���: %s\n", getGrade());
	}
}

public class ScoreMain {

	public static void main(String[] args) {

		Score s = new Score();
		s.getInfo();

	}

}