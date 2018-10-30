package com.exception;

import java.io.BufferedReader;
import java.io.FileReader;

public class ExceptionMain12 {

	public static void main(String[] args) {
		
		ExceptionMain12 em = new ExceptionMain12();
		em.fileOpen("file.txt");

	}

	public void fileOpen(String fileName) {
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
			String line = null;
			while((line = br.readLine())!=null) {
				System.out.println(line);
			}
		} catch (Exception e) {}
	}
}
