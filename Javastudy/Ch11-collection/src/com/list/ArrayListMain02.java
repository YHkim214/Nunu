package com.list;

import java.util.ArrayList;

public class ArrayListMain02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("��ȣ��");
		list.add("���缮");
		list.add("�躴��");
		list.add("����ȣ");
		
		for(String str: list) {
			System.out.println(str);
		}
	}
}
