package com.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameMain {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] pool = {"����", "����", "��"};
		int me = 0;
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		while(true) {
			try {
				System.out.println("[�Է��ϼ���]");
				System.out.println("1.���� | 2.����| 3.��| 4.����");

				me = Integer.parseInt(br.readLine());
				if(me == 4) {
					System.out.println("�����մϴ�.");
					System.out.println("����� ����: " + win + "�� " + lose + "�� " + draw + "��");
					break;
				}
				int com = (int)(Math.random() * 3) + 1;
				
				switch(me - com) {
				case 0:
					System.out.println("��ǻ��: " + pool[com-1] + ", ����: " + pool[me-1] + "=> ���º�!");
					draw++;
					break;
				case -2: case 1:
					System.out.println("��ǻ��: " + pool[com-1] + ", ����: " + pool[me-1] + "=> ���� ��!");
					win++;
					break;
				case -1: case 2:
					System.out.println("��ǻ��: " + pool[com-1] + ", ����: " + pool[me-1] + "=> ��ǻ�� ��!");
					lose++;
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("��ȿ���� ���� �Է��Դϴ�");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("��ȿ���� ���� �Է��Դϴ�");
			} catch (IOException e) {}
		}
		
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}