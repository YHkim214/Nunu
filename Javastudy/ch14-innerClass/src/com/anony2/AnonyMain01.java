package com.anony2;

class Inner6{
	public void disp() {
		System.out.println("disp �޼���");
	}
}

public class AnonyMain01 {

	//�͸��� Ŭ����. inner6�� ��ӹ��� �̸����� Ŭ������ ����
	//inner6�� �޼��带 �������̵��� �޼��常 ��� �� �� �ִ�.
	public void make() {
		Inner6 i = new Inner6() {
			@Override
			public void disp() {
				System.out.println("�͸�ü�� disp �޼���");
			}
		};
		i.disp();
	}

	public static void main(String[] args) {

		new AnonyMain01().make();

	}

}
