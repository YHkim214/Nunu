package com.file;

import java.io.IOException;

public class StandardInput02 {
	public static void main(String[] args) {
		int input = 0;
		
		try {
			while((input = System.in.read()) != -1) { //-1���� ��� ���ؼ��� ctrl+z�� �������Ѵ�. �� �������� ��� ���� �Է¹��� �� �ִ�.
				System.out.println((char)input);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.print("���α׷�����");
	}
}