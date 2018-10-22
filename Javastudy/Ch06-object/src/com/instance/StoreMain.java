package com.instance;

class Store{
	String name;
	
	public Store() {}
}

public class StoreMain {

	public static void main(String[] args) {
		Store s1 = new Store();
		Store s2 = new Store();
		
		System.out.println(s1);
		System.out.println(s2);
		
		Store s3;
		Store s4 = new Store();
		s3 = s4;
		
		System.out.println(s4);
		System.out.println(s3);
	}

}
