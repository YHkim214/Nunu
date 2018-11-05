package com.serial;

import java.io.Serializable;

//Serializable �������̽��� �����ϸ� ��ü����ȭ ����̵ȴ�. ���� �ȵ������� �ȵ�. ����ȭ ����� �ɹ�����.

public class Customer implements Serializable{
	
	private String name; //ĸ��ȭ�� ����ȭ ����!
	
	public Customer(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}