package com.anony;

class Inner6{
	public void disp() {
		System.out.println("disp 메서드");
	}
}

public class AnonyMain01 {
	
	public void make() {
		class Inner extends Inner6{
			@Override
			public void disp() {
				System.out.println("자식클래스의 disp메서드");
			}
		}
		new Inner().disp();
	}

	public static void main(String[] args) {
		
		new AnonyMain01().make();

	}

}
