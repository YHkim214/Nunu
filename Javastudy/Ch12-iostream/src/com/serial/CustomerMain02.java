package com.serial;

import java.io.*;

public class CustomerMain02 {
	public static void main(String[] args) {
		//��ü ������ȭ
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.ser"))) {
			Customer c = (Customer)ois.readObject();
			System.out.println(c.getName());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
