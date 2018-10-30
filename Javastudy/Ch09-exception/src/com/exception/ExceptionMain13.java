package com.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionMain13 {

	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("���ڸ� �Է��ϼ���.>");
			int i = Integer.parseInt(br.readLine().trim());
			System.out.println(i+20);
		} catch (NumberFormatException e) {
			System.out.println("���ھ���� ��ó�");
		} catch (IOException e) {
			System.out.println("����½� ���ܹ߻�");
		}

	}

}
