package com.exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ExceptionMain09 {

	public static void main(String[] args) {
		
		ExceptionMain09 em = new ExceptionMain09();
		try {
			em.printdata();
		} catch (NumberFormatException e) {
			System.out.println("���ڰ� �ƴմϴ�.");
		} catch (IOException e) {
			System.out.println("������� ���ܹ߻�");
		}

	}
	
	public void printdata() throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�� �Է�: ");
		String data = br.readLine().trim();
		int dan = Integer.parseInt(data);
		System.out.println(dan + "��");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
		br.close();
	}

}
