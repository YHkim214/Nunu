package com.enumex;

enum Item{
	ADD, DEL, SEARCH, CANCEL
}

public class EnumMain03 {
	public static void main(String[] args) {
		//values 메서드는 열거타입의 모든 객체를 담은 배열을 반환한다.
		Item[] items = Item.values();
		
		System.out.println(items.length);
		
		//저장되어있는 정수값 확인
		for(Item i: items) {
			System.out.println(i.ordinal());
		}
	}
}
