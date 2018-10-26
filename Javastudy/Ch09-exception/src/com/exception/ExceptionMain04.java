package com.exception;

public class ExceptionMain04 {

	public static void main(String[] args) {
		
		System.out.println("======예외가 발생하지 않는경우======");
		
		try {
			System.out.println("1");
			System.out.println("2");
		}catch(Exception e) {
			System.out.println("3");
		}finally {
			System.out.println("4");
		}
		
		System.out.println("프로그램 종료");
		
	System.out.println("======예외가 발생하는경우======");
		
		try {
			System.out.println("1");
			System.out.println("2");
			return;
		}catch(Exception e) {
			System.out.println("3");
		}finally {
			System.out.println("4");
		}
		
		System.out.println("프로그램 종료");
	}

}
