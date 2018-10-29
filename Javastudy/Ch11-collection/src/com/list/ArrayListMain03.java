package com.list;

import java.util.ArrayList;

public class ArrayListMain03 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("서울");
		list.add("부산");
		list.add("대구");
		
		list.forEach(System.out::println);
		
	}

}
