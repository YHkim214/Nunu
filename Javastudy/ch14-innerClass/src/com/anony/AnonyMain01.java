package com.anony;

class Inner6{
	public void disp() {
		System.out.println("disp �޼���");
	}
}

public class AnonyMain01 {
	
	public void make() {
		class Inner extends Inner6{
			@Override
			public void disp() {
				System.out.println("�ڽ�Ŭ������ disp�޼���");
			}
		}
		new Inner().disp();
	}

	public static void main(String[] args) {
		
		new AnonyMain01().make();

	}

}
