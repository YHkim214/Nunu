package com.extention2;

public class PhoneMain {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("010-123", "A100", "white", "�ȵ���̵�");
		FeaturePhone fp = new FeaturePhone("010-987", "B100", "pink", 1000);
		
		System.out.println("-----------------------------");
		System.out.println("��\t��ȣ\t����\t�ɼ�(OS/ȭ�Ҽ�)");
		System.out.println("-----------------------------");
		System.out.print(sp.getModel() + "\t");
		System.out.print(sp.getNumber() + "\t");
		System.out.print(sp.getColor() + "\t");
		System.out.print(sp.getOs() + "\n");
		
		System.out.print(fp.getModel() + "\t");
		System.out.print(fp.getNumber() + "\t");
		System.out.print(fp.getColor() + "\t");
		System.out.print(fp.getPixel() + "\n");
		
	}
}
