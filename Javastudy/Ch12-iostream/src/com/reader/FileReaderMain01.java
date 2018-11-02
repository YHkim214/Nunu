package com.reader;

import java.io.*;

public class FileReaderMain01 {
	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader("file.txt")) {
			int data = 0;
			while((data = fr.read()) != -1){ //한 문자(2바이트)씩 읽는다(유니코드로 반환)
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}