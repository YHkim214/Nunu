package com.list;

import java.util.ArrayList;

public class ArrayListMain03 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("����");
		list.add("�λ�");
		list.add("�뱸");
		
		list.forEach(System.out::println);
		
	}

}
