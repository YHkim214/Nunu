package com.output;

import java.io.*;

public class FileOutputStreamMain {
	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("fileout.txt", true)) { //�ڵ����� ���ϻ���. �̾�� ���δ� true false�� ��������.
			String message = "Hello File! ���Ͽ� ������!!";
			
			fos.write(message.getBytes());
			System.out.println("������ �����ϰ� ������ ����߽��ϴ�");
			
		} catch(IOException e) {}
	}
}