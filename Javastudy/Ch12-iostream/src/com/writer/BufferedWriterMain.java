package com.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterMain {
	public static void main(String[] args) {
		try(BufferedWriter bw  = new BufferedWriter(new FileWriter("BufferedWriter.txt"))){
			String str = "안녕하세요. BufferedWriterTest";
			bw.write(str);
			bw.newLine();//줄바꿈 메서드
			bw.write("안녕하세요" + System.getProperty("line.separator"));
			bw.flush();
			System.out.println("파일생성 및 내용기술");
		} catch (Exception e) {}
	}
}