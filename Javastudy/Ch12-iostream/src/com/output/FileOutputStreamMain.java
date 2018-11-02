package com.output;

import java.io.*;

public class FileOutputStreamMain {
	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("fileout.txt", true)) { //자동으로 파일생성. 이어쓰기 여부는 true false로 조정가능.
			String message = "Hello File! 파일에 내용기술!!";
			
			fos.write(message.getBytes());
			System.out.println("파일을 생성하고 내용을 기술했습니다");
			
		} catch(IOException e) {}
	}
}