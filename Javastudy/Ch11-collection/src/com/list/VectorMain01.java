package com.list;

import java.util.Vector;

public class VectorMain01 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		
		v.add("�迬��");
		v.add("��̶�");
		v.add("�տ���");
		v.add("�̻�ȭ");
		
		for(int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		System.out.println();
		for(String str : v) {
			System.out.println(str);
		}
		
	}
}
