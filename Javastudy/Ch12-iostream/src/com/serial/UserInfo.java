package com.serial;

import java.io.Serializable;

public class UserInfo implements Serializable{
	private String name;
	private int age;
	private String address;
	
	public UserInfo(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "�̸�: " + name + ", ����: " + age + ", �ּ�: " + address;
	}
	
}
