package com.serial;

import java.io.*;
import java.util.*;

public class SerialMain01 {
	public static void main(String[] args) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("userinfo.ser"))) {
			ArrayList<UserInfo> list = new ArrayList<>();
			list.add(new UserInfo("����ȣ", 27, "������"));
			list.add(new UserInfo("����ȣ", 25, "����"));
			list.add(new UserInfo("����ȣ", 26, "�׽�"));
			oos.writeObject(list);
			oos.writeObject(new Customer("��ȣ"));
			System.out.println("��ü�� ����ȭ �߽��ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
