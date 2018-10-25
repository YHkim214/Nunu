package com.overriding;

class Mother{
	public String getLunch() {
		return "¹ä";
	}
}

class Son extends Mother {

}

class Daughter extends Mother{
	public String getLunch() {
		return "»§";
	}
}

public class OverridingMain02 {
	public static void main(String[] args) {
		Son s = new Son();
		System.out.println(s.getLunch());
		
		Daughter d = new Daughter();
		System.out.println(d.getLunch());
	}
}
