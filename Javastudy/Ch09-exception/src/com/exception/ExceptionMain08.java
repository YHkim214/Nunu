package com.exception;

import java.io.*;

public class ExceptionMain08 {

	public static void main(String[] args) {
	
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("주소입력>");
			String address = br.readLine().trim();
			System.out.println("주소: " + address);
		} catch(IOException e) {
			System.out.println("입출력시 예외발생");
		}
	}

}
