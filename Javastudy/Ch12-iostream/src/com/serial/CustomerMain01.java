package com.serial;

import java.io.*;

public class CustomerMain01 {
	public static void main(String[] args) {
		//��ü ����ȭ�ϱ�
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.ser"))) {
			Customer c = new Customer("��ȣ");
			oos.writeObject(c);
			System.out.println("��ü�� ����ȭ �߽��ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
