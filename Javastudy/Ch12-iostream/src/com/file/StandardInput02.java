package com.file;

import java.io.IOException;

public class StandardInput02 {
	public static void main(String[] args) {
		int input = 0;
		
		try {
			while((input = System.in.read()) != -1) { //-1값을 얻기 위해서는 ctrl+z를 눌러야한다. 그 전까지는 계속 값을 입력받을 수 있다.
				System.out.println((char)input);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.print("프로그램종료");
	}
}