package com.array;

public class Score {

	private String name;
	private int korean;
	private int english;
	private int math;
	
	public Score() {}
	
	public Score(String name, int korean, int english, int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return korean + english + math;
	}
	public double getAverage() {
		return (double)getSum() / 3;
	}
	public String getGrade() {
		switch((int)getAverage() / 10) {
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

}