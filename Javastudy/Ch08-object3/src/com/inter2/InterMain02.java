package com.inter2;

interface Inter1{
	public void make();
}

class InterTest implements Inter1{
	public void make() {
		System.out.println("����ũ �޼��� ȣ��");
	}
	
	public void fun() {
		System.out.println("fun �޼��� ȣ��");
	}
}

public class InterMain02 {
	public static void main(String[] args) {
		
		InterTest it = new InterTest();
		it.make();
		it.fun();
		Inter1 i = it;
		i.make();
//		i.fun();
		InterTest it2 = (InterTest)i;
		it2.make();
		it2.fun();
		
	}
}