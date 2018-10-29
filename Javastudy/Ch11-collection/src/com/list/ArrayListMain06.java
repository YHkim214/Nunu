package com.list;

import java.util.ArrayList;

public class ArrayListMain06 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("머루");
		list.add("사과");
		list.add("앵두");
		list.add("자두");
		list.add("사과");
		
		System.out.println(list.indexOf("사과"));
		System.out.println(list.lastIndexOf("사과"));
		System.out.println(list.indexOf("수박"));
	}

}
