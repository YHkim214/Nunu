package com.instance;

import java.util.Scanner;

class Score{
	String name;
	int korean;
	int math;
	int english;

	Score(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름: ");
		this.name = scanner.next();
		System.out.print("국어: ");
		this.korean = scanner.nextInt();
		System.out.print("수학: ");
		this.math = scanner.nextInt();
		System.out.print("영어: ");
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
		System.out.println("이름: " + name);
		System.out.println("국어: " + korean);
		System.out.println("수학: " + math);
		System.out.println("영어: " + english);
		System.out.println("총점: " + getSum());
		System.out.printf("평균: %d\n", getAvg());
		System.out.printf("등급: %s\n", getGrade());
	}
}

public class ScoreMain {

	public static void main(String[] args) {

		Score s = new Score();
		s.getInfo();

	}

}