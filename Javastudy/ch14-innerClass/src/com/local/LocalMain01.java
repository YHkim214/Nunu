package com.local;

public class LocalMain01 {
	
	public void innerTest() {
		//���� ���� Ŭ����
		class Inner{
			public void getData() {
				System.out.println("Local ���� Ŭ����");
			}
		}
		//���� ���� Ŭ���� ��ü ����
		new Inner().getData();
	}
	
	public static void main(String[] args) {
		LocalMain01 l = new LocalMain01();
		l.innerTest();
	}
}
