package com.display;

import java.awt.Frame;

public class FrameMain01 extends Frame{
	
	public FrameMain01() {
		//���� ����
		super("Frame �׽�Ʈ");
		//������ ũ�� ����
		setSize(300,200);
		//������ ���⿩������
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FrameMain01();
	}
}
