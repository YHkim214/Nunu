package com.exception;

public class ExceptionMain02 {

	public static void main(String[] args) {
		int[] arr = {100, 200, 300};

		for(int i = 0; i <= arr.length; i++) {
			try {
				System.out.println(arr[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println("�ڵ� �̵���� ©�Ŵ�?");
			}
		}

		System.out.println("���α׷� ��");

	}
}
