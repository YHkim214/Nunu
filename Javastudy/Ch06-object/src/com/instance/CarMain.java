package com.instance;

class Car{
	static final String COMPANY = "�����ڵ���";
	String model = "�ҳ�Ÿ";
	String color = "����";
	final int MAX_SPEED = 350;
	int speed;
}

public class CarMain { //�� Ŭ���� ���Ͽ� publicŬ������ �ϳ� �̻� ���� �� ����.

	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println("����ȸ��: " + Car.COMPANY);
		System.out.println("�𵨸�: " + myCar.model);
		System.out.println("����: " + myCar.color);
		System.out.println("�ְ�ӵ�: " + myCar.MAX_SPEED);
		System.out.println("����ӵ�: " + myCar.speed);
		
		myCar.speed = 60;
		System.out.println("������ �ӵ�: " + myCar.speed);
	}

}