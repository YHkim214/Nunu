package com.local;

public class LocalMain03 {

	public void innerTest1() {
		//jdk 7.0 ���Ͽ����� ���������� ���� ���� Ŭ�������� ����Ҽ� ���⶧���� ������� ����ؾ� �Ѵ�.
		//jdk 8.0 ���ʹ� �ڵ����� ��� ó���ȴ�.
		//��������
		final int b = 200;
		
		//���� ����Ŭ����
		class Inner{
			public void getData() {
//				b = 100; ����� ������ ���� �Ұ���
				System.out.println(b);
			}
		}
		
		Inner i = new Inner();
		i.getData();
		
	}
	
	public static void main(String[] args) {
		LocalMain03 l = new LocalMain03();
		l.innerTest1();
	}
}