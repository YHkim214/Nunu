package com.abs;

abstract class AbsEx1{
	public String getStr() {
		return "가을";
	}
	
	abstract public int getA();
	abstract public int getB();
}

abstract class AbsEx2 extends AbsEx1{
	public int getA(){
		return 100;
	}
	
	public abstract String getMsg();
}


public class AbstractMain03 extends AbsEx2{
	
	public int getB() {
		return 600;
	}
	
	public String getMsg() {
		return "겨울";
	}

	public static void main(String[] args) {
		AbstractMain03 ab = new AbstractMain03();
		System.out.println(ab.getA());
		System.out.println(ab.getB());
		System.out.println(ab.getMsg());
	}

}
