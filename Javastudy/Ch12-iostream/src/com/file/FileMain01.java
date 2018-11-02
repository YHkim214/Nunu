package com.file;

import java.io.File;

public class FileMain01 {
	public static void main(String[] args) {
		String path = "C:\\";
		
		File f = new File(path);
		
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("��ȿ���� ���� ���丮�Դϴ�");
			System.exit(0);
		}
		
		//���� ���丮 �� ������ �迭�� ��ȯ
		
		File[] files = f.listFiles();
		
		for(int i = 0; i < files.length; i++) {
			File f2 = files[i];
			if(f2.isDirectory()) {
				System.out.println("["+f2.getName()+"]");
			} else {
				System.out.print(f2.getName());
				System.out.printf("(%,dbytes)\n" , f2.length());
			}
		}
		
			
	}
}
