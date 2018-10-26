package com.exception;

import java.io.*;

public class ExceptionMain07 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("주소입력>");
			String address = br.readLine().trim();
			System.out.println("주소: " + address);
		} catch(IOException e) {
			System.out.println("입출력시 예외발생");
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					System.out.println("입출력시 예외발생");
				}
			}
		}
	}
}
