package com.reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderMain01 {
	public static void main(String[] args) {
		
		//system.in = ǥ���Է�, ����Ʈ��� �Է�
		//InputStreamReader = ����Ʈ��� ��Ʈ���� ���ڱ�� ��Ʈ������ �ٲ��ش�.
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
			System.out.print("����� �̸�: ");
			String name = br.readLine();
			System.out.println(name);
			System.out.print("����� ����: ");
			int age = Integer.parseInt(br.readLine());
			System.out.println(age);
		} catch(NumberFormatException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} 
		
	}
}
