package com.reader;

import java.io.*;

public class FileReaderMain01 {
	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader("file.txt")) {
			int data = 0;
			while((data = fr.read()) != -1){ //�� ����(2����Ʈ)�� �д´�(�����ڵ�� ��ȯ)
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}