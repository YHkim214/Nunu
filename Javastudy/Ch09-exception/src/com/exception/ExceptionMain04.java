package com.exception;

public class ExceptionMain04 {

	public static void main(String[] args) {
		
		System.out.println("======���ܰ� �߻����� �ʴ°��======");
		
		try {
			System.out.println("1");
			System.out.println("2");
		}catch(Exception e) {
			System.out.println("3");
		}finally {
			System.out.println("4");
		}
		
		System.out.println("���α׷� ����");
		
	System.out.println("======���ܰ� �߻��ϴ°��======");
		
		try {
			System.out.println("1");
			System.out.println("2");
			return;
		}catch(Exception e) {
			System.out.println("3");
		}finally {
			System.out.println("4");
		}
		
		System.out.println("���α׷� ����");
	}

}
