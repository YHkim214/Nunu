package com.exception;

import java.io.*;

public class ExceptionMain07 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("�ּ��Է�>");
			String address = br.readLine().trim();
			System.out.println("�ּ�: " + address);
		} catch(IOException e) {
			System.out.println("����½� ���ܹ߻�");
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					System.out.println("����½� ���ܹ߻�");
				}
			}
		}
	}
}
