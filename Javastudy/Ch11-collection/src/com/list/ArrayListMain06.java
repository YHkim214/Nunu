package com.list;

import java.util.ArrayList;

public class ArrayListMain06 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("�ӷ�");
		list.add("���");
		list.add("�޵�");
		list.add("�ڵ�");
		list.add("���");
		
		System.out.println(list.indexOf("���"));
		System.out.println(list.lastIndexOf("���"));
		System.out.println(list.indexOf("����"));
	}

}
