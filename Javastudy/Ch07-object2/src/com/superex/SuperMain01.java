package com.superex;

class Mother{
	public String getLunch() {
		return "¹ä";
	}
}

class Daughter extends Mother{
	
	@Override
	public String getLunch() {
		return "»§";
	}
	
	public String getRice() {
		return super.getLunch();
	}
}

public class SuperMain01 {
	public static void main(String[] args) {
		Daughter d = new Daughter();
		System.out.println(d.getLunch());
		System.out.println(d.getRice());
	}
}
