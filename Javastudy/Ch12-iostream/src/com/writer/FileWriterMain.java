package com.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {
	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("fileWriter.txt")) {
			String str = "안녕하세요 FileWriter Test";
			fw.write(str); //얘도 사실 버퍼를 이용한 스트림이다
			System.out.println("파일을 생성하고 내용을 기술");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
