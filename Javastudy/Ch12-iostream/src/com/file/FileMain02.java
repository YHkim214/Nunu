package com.file;

import java.io.*;

public class FileMain02 {

	public static void main(String[] args) {
		
		//������
//		String path = "D:\\javawork\\sample.txt";
		String path = "D:"+File.separator+"javawork"+File.separator+"sample.txt";
		String path2 = "D:"+File.separator+"javawork"+File.separator+"example.txt";
		//����� ��Ʈ��θ� ������Ʈ ���丮�� ����.
//		String path = "sample.txt";
		
		File f1 = new File(path);
		System.out.println("===���ϻ���===");
		try {//������ ��θ� ������� ���ϻ���. �������� ��ȯ.
			System.out.println(f1.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("===��������===");
		System.out.println("������:" + f1.getAbsolutePath());
		System.out.println("�����:" + f1.getPath());
		System.out.println("���丮��:" + f1.getParent());
		System.out.println("���ϸ�: " + f1.getName());
		
		System.out.println("===���ϸ� ����===");
		
		File f2 = new File(path2);
		System.out.println(f1.renameTo(f2));
		System.out.println("===���ϻ���===");
		if(f2.delete()) {//�����õ��� �������� ��ȯ
			System.out.println(f2.getName() + "����");
		} else {
			System.out.println("������ �������� �ʽ��ϴ�");
		}
	}

}