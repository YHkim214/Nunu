package com.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionMain13 {

	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("숫자를 입력하세요.>");
			int i = Integer.parseInt(br.readLine().trim());
			System.out.println(i+20);
		} catch (NumberFormatException e) {
			System.out.println("숫자쓰라고 븅시나");
		} catch (IOException e) {
			System.out.println("입출력시 예외발생");
		}

	}

}
