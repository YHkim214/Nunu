package com.file;

import java.io.File;

public class FileMain03 {

	public static void main(String[] args) {
		String path = "D:\\javawork\\javasample";
		String path2 = "D:\\javawork\\javasample2";
		File f1 = new File(path); //���丮 ����
		System.out.println(f1.mkdir());
		
		File f2 = new File(path2); //�̸�����
		System.out.println(f1.renameTo(f2));
		
		if(f2.delete()) {
			System.out.println(f2.getName() + "��������");
		} else {
			System.out.println("���丮�� �����ϴ�.");
		}
	}

}
