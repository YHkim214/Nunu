package com.list;

import java.util.ArrayList;

public class ArrayListMain04 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("��ȣ��");
		list.add("���缮");
		list.add("�躴��");
		list.add("�ڸ��");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		
		System.out.println();
		
		//list.remove(2);
		list.remove("��ȣ��");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		
		System.out.println();
		
		ArrayList<Integer> list2 = new ArrayList<>();
		
		list2.add(new Integer(1));
		list2.add(2);
		list2.add(3);
		list2.add(4);
		
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(i + ":" + list2.get(i));
		}
		
		list2.remove(new Integer(1));
		
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(i + ":" + list2.get(i));
		}
		
	}

}