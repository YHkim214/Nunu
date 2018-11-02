package com.math;

import java.util.Random;

public class RandomMain {
	public static void main(String[] args) {
		String[] gift = {"스마트폰", "TV", "냉장고", "꽝!"};
		double ran = Math.random();
		System.out.println(ran);
		int num = (int)(ran * 3);
		System.out.println(gift[num]);
		
		System.out.println("=================");
		
		String[] luck = {"가을여행", "로또당첨", "대학교합격", "피곤해"};
		Random r = new Random();
		int index = r.nextInt(4);
		System.out.println(luck[index]);
		
	}
}
