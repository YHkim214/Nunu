package com.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterMain {
	public static void main(String[] args) {
		try(BufferedWriter bw  = new BufferedWriter(new FileWriter("BufferedWriter.txt"))){
			String str = "�ȳ��ϼ���. BufferedWriterTest";
			bw.write(str);
			bw.newLine();//�ٹٲ� �޼���
			bw.write("�ȳ��ϼ���" + System.getProperty("line.separator"));
			bw.flush();
			System.out.println("���ϻ��� �� ������");
		} catch (Exception e) {}
	}
}