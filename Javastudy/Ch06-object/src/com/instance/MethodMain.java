package com.instance;

public class MethodMain {

	int num;
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public void setNum(int n) {
		num = n;
	}
	
	public void print(String str) {
		System.out.println(str);
	}
	
	public int getNum() {
		return num;
	}
	
	public static void main(String[] args) {
		MethodMain mt = new MethodMain();
		int result = mt.add(5, 3);
		System.out.println(result);
		
		mt.setNum(8);
		System.out.println(mt.num);
		
		mt.print("´©´©");
		
		System.out.println(mt.getNum());
	}
}