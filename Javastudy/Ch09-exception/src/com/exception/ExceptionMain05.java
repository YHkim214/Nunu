package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionMain05 {

	public static void main(String[] args){
		
		FileInputStream fis = null;
		byte[] readbyte;
		try {
			fis = new FileInputStream("file.txt");
			
			readbyte = new byte[fis.available()];
			fis.read(readbyte);
			
			System.out.println(new String(readbyte));
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}catch(IOException e) {
			System.out.println("입출력시 예외발생");
		}finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {}
			}
			
		}

	}

}
