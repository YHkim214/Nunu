package com.poly;

class Parent{
	int a = 100;
}

class Child extends Parent{
	int b = 200;
}

public class PolyMain01 {

	public static void main(String[] args) {
		
		Child ch = new Child();
		System.out.println(ch.a);
		System.out.println(ch.b);
		
		Parent p = ch; //��ĳ����
		System.out.println(p.a);
//		System.out.println(p.b);
		
		Child ch2 = (Child)p; //�ٿ�ĳ����
		
		System.out.println(ch2.a);
		System.out.println(ch2.b);
	}

}
