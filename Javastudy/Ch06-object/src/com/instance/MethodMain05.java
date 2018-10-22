package com.instance;


public class MethodMain05 {

	public void argTest(int ... n) {//jdk5.0 부터 사용가능. 전달되는 데이터는 내부적으로 배열로 처리됨
		
		for(int i = 0; i < n.length; i++) {
			System.out.println("n[" + i + "] = " + n[i]);
		}
		
		System.out.println("---------");
		
	}

	public static void main(String[] args) {
		MethodMain05 me = new MethodMain05();
		
		me.argTest();
		me.argTest(1,2);
		me.argTest(10,20);

	}

}
