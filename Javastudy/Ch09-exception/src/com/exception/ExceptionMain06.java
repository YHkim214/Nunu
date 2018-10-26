package com.exception;

import java.io.FileInputStream;

public class ExceptionMain06 {

	public static void main(String[] args) {
		//자동 리소스 닫기 기능 try-read-resources
		//예외발생여부와 상관없이 사용했던 리소스 객체의 close메서드를 호출, 안전하게 리소스를 닫아줌

		byte[] readbyte;
		
		try(FileInputStream fis = new FileInputStream("file.txt")) {
			readbyte = new byte[fis.available()];
			fis.read(readbyte);
			
			System.out.println(new String(readbyte));
		} catch(Exception e) {
			System.out.println("예외가 발생했습니다");
		}
		
	}

}