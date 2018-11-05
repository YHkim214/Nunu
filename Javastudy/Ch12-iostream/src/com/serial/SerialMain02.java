package com.serial;

import java.io.*;
import java.util.*;

public class SerialMain02 {
	public static void main(String[] args) {
		//객체 역직렬화
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("userinfo.ser"))) {
			ArrayList<UserInfo> list = (ArrayList<UserInfo>)ois.readObject();
			System.out.println(list);
			Customer c = (Customer)ois.readObject();
			System.out.println(c.getName());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}