package com.file;

public class StandardInput01 {
	public static void main(String[] args) {
		try {
			System.out.print("영문자 한개 입력: ");
			int a = System.in.read(); //문자하나 입력받아서 아스키코드로 반환
			System.out.println((char)a);
			System.in.read(); //엔터키를 치는순간 입력되는 \r\n을 제거하기위해 두 번 읽어온다.
			System.in.read();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("==================");
		
		try {
			System.out.print("숫자하나 입력: ");
			int b = System.in.read();
			System.out.println((char)b);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}