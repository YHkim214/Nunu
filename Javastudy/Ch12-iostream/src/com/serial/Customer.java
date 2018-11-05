package com.serial;

import java.io.Serializable;

//Serializable 인터페이스를 구현하면 객체직렬화 대상이된다. 구현 안돼있으면 안됨. 직렬화 대상은 맴버변수.

public class Customer implements Serializable{
	
	private String name; //캡슐화를 습관화 하자!
	
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