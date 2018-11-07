package com.staticex;

public class InnerMain {
	
	//����Ŭ�������� static�� ����� �� �ִ�. �Ϲ� Ŭ�������� �Ұ���.
	//���� Ŭ������ static ����� �����ϰ� �ʹٸ�, static���� Ŭ������ �������Ѵ�.
	public static class StaticInner{
		int iv = 200;
		static int cv = 300;
		public static void make() {
			System.out.println("����");
		}
	}
	
	public static void main(String[] args) {
		//����Ŭ������ static�� ����ϸ�, ����Ŭ������ ���ΰ��ִ� Ŭ���� ��ü �������� ��ü��������.
		StaticInner s = new StaticInner();
		System.out.println(s.iv);
		System.out.println(StaticInner.cv);
		StaticInner.make();
	}
}