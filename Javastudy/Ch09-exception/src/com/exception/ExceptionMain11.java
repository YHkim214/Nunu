package com.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionMain11 {

	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("0 �̻��� ���ڸ� �Է�: ");
			String data = br.readLine();
			int num = Integer.parseInt(data);
			if(num < 0) {
				throw new MinusUseException("����� �Է��ϼ���");
			}
			System.out.println("�Է��� ����: " + num);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (MinusUseException e) {
			e.printStackTrace();
		}
		
		

	}

}
