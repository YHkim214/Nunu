package com.list;

import java.util.ArrayList;

public class ArrayListMain02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("강호동");
		list.add("유재석");
		list.add("김병만");
		list.add("김준호");
		
		for(String str: list) {
			System.out.println(str);
		}
	}
}
