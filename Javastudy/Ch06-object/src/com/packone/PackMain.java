package com.packone;

import com.packtwo.PackTwo;

public class PackMain {
	public static void main(String[] args) {
		//Ŭ������ ȣ���Ҷ��� ��Ű���� �����ؼ� ȣ���ϴ� ���� ��Ģ������, ���� ��Ű���� Ŭ������ ȣ���Ҷ��� ��Ű���� �����ص� �ȴ�.
		PackOne po = new PackOne();
		
		//�ٸ� ��Ű���� Ŭ������ ȣ���Ҷ��� ��Ű���� ǥ���ϰų� ��Ű���� import �ؾ���
		PackTwo pt = new PackTwo();
		
		PackThree p3 = new PackThree();
		System.out.println(p3);
		
		//���� ��Ű���� import�� ��Ű���� ���� �̸��� Ŭ������ �����Ҷ�, �� Ŭ������ ȣ���ϸ� import�ؿ� ��Ű���� Ŭ������ ȣ��ȴ�.
		//�׷� ��쿡�� ��Ű�� ��θ� ����ؼ� ȣ��
		com.packtwo.PackThree p4 = new com.packtwo.PackThree();
		System.out.println(p4);
	}
}
