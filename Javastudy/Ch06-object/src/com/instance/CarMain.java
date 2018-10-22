package com.instance;

class Car{
	static final String COMPANY = "현대자동차";
	String model = "소나타";
	String color = "검정";
	final int MAX_SPEED = 350;
	int speed;
}

public class CarMain { //한 클래스 파일에 public클래스는 하나 이상 있을 수 없다.

	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println("제작회사: " + Car.COMPANY);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.MAX_SPEED);
		System.out.println("현재속도: " + myCar.speed);
		
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
	}

}