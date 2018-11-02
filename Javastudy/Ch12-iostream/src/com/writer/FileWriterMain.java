package com.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {
	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("fileWriter.txt")) {
			String str = "�ȳ��ϼ��� FileWriter Test";
			fw.write(str); //�굵 ��� ���۸� �̿��� ��Ʈ���̴�
			System.out.println("������ �����ϰ� ������ ���");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
