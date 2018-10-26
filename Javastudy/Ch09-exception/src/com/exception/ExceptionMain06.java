package com.exception;

import java.io.FileInputStream;

public class ExceptionMain06 {

	public static void main(String[] args) {
		//�ڵ� ���ҽ� �ݱ� ��� try-read-resources
		//���ܹ߻����ο� ������� ����ߴ� ���ҽ� ��ü�� close�޼��带 ȣ��, �����ϰ� ���ҽ��� �ݾ���

		byte[] readbyte;
		
		try(FileInputStream fis = new FileInputStream("file.txt")) {
			readbyte = new byte[fis.available()];
			fis.read(readbyte);
			
			System.out.println(new String(readbyte));
		} catch(Exception e) {
			System.out.println("���ܰ� �߻��߽��ϴ�");
		}
		
	}

}