package com.exception;

import java.io.*;

public class ExceptionMain08 {

	public static void main(String[] args) {
	
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("�ּ��Է�>");
			String address = br.readLine().trim();
			System.out.println("�ּ�: " + address);
		} catch(IOException e) {
			System.out.println("����½� ���ܹ߻�");
		}
	}

}
