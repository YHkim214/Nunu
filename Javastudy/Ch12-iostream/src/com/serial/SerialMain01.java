package com.serial;

import java.io.*;
import java.util.*;

public class SerialMain01 {
	public static void main(String[] args) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("userinfo.ser"))) {
			ArrayList<UserInfo> list = new ArrayList<>();
			list.add(new UserInfo("±èÀ±È£", 27, "ÀÇÁ¤ºÎ"));
			list.add(new UserInfo("ÀÌÀ±È£", 25, "½º¿ï"));
			list.add(new UserInfo("¹ÚÀ±È£", 26, "º×½Ñ"));
			oos.writeObject(list);
			oos.writeObject(new Customer("À±È£"));
			System.out.println("°´Ã¼¸¦ Á÷·ÄÈ­ Çß½À´Ï´Ù.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
