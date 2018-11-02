package com.reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderMain01 {
	public static void main(String[] args) {
		
		//system.in = 표준입력, 바이트기반 입력
		//InputStreamReader = 바이트기반 스트림을 문자기반 스트림으로 바꿔준다.
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
			System.out.print("당신의 이름: ");
			String name = br.readLine();
			System.out.println(name);
			System.out.print("당신의 나이: ");
			int age = Integer.parseInt(br.readLine());
			System.out.println(age);
		} catch(NumberFormatException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} 
		
	}
}
