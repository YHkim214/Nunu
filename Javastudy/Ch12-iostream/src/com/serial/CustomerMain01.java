package com.serial;

import java.io.*;

public class CustomerMain01 {
	public static void main(String[] args) {
		//객체 직렬화하기
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.ser"))) {
			Customer c = new Customer("윤호");
			oos.writeObject(c);
			System.out.println("객체를 직렬화 했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
