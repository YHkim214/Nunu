package com.math;

import java.util.Random;

public class RandomMain {
	public static void main(String[] args) {
		String[] gift = {"����Ʈ��", "TV", "�����", "��!"};
		double ran = Math.random();
		System.out.println(ran);
		int num = (int)(ran * 3);
		System.out.println(gift[num]);
		
		System.out.println("=================");
		
		String[] luck = {"��������", "�ζǴ�÷", "���б��հ�", "�ǰ���"};
		Random r = new Random();
		int index = r.nextInt(4);
		System.out.println(luck[index]);
		
	}
}
