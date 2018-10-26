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
			System.out.println("숫자가 아닙니다.");
		} catch (IOException e) {
			System.out.println("입출력중 예외발생");
		}

	}
	
	public void printdata() throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("단 입력: ");
		String data = br.readLine().trim();
		int dan = Integer.parseInt(data);
		System.out.println(dan + "단");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
		br.close();
	}

}
