package com.enumex;

enum Item{
	ADD, DEL, SEARCH, CANCEL
}

public class EnumMain03 {
	public static void main(String[] args) {
		//values �޼���� ����Ÿ���� ��� ��ü�� ���� �迭�� ��ȯ�Ѵ�.
		Item[] items = Item.values();
		
		System.out.println(items.length);
		
		//����Ǿ��ִ� ������ Ȯ��
		for(Item i: items) {
			System.out.println(i.ordinal());
		}
	}
}
