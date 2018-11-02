package com.reader;

import java.io.*;

public class BufferedReaderMain {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("file.txt"))){
			String data;
			while((data = br.readLine()) != null) {
				System.out.println(data);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
