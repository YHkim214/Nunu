package com.method;

public class OverLoadingMain02 {

	public void getLength(int n) {
		String s = String.valueOf(n);
		getLength(s);
	}

	public void getLength(float n) {
		String s = String.valueOf(n);
		getLength(s);
	}

	public void getLength(String n) {
		System.out.println(n.length());
	}

	public static void main(String[] args) {

		OverLoadingMain02 om2 = new OverLoadingMain02();
		om2.getLength(123123);
		om2.getLength(123123.0f);
		om2.getLength("¿œ¿ÃªÔ¿œ¿ÃªÔ");

	}

}
