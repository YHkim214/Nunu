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
			System.out.println("������ ã�� �� �����ϴ�.");
		}catch(IOException e) {
			System.out.println("����½� ���ܹ߻�");
		}finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {}
			}
			
		}

	}

}
