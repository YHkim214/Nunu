package com.overriding;

class GrandParent{
	public String getCar() {
		return "�����ڵ���";
	}
}

class Father extends GrandParent{
	public String getCar() {
		return "�����ڵ���";
	}
}

class Uncle extends GrandParent{
	
}

public class OverridingMain01 {

	public static void main(String[] args) {
		Father f = new Father();
		System.out.println(f.getCar());
	}

}
