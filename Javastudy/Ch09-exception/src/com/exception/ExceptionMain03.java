package com.exception;

public class ExceptionMain03 {

	public static void main(String[] args) {
		int var = 50;
		
			try {
				int data = Integer.parseInt(args[0]);
				System.out.println(var/data);
			} catch (NumberFormatException e) {
				System.out.println("숫자로 바꿀 수 없습니다");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("입력한 데이터가 없습니다.");
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
			} catch (Exception e) {
				System.out.println("예상 못 한 예외가 발생");
			}
			
			System.out.println("프로그램 종료");
			
	}
}
