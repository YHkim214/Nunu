package com.event;

import java.awt.Button;
import java.awt.Frame;

public class ButtonMain01 extends Frame{
	
	//�Ϲ����� ui�۾��� �����ڿ��� �� ó���Ѵ�.
	public ButtonMain01() {
		super("Button �׽�Ʈ");
		setSize(300,300);
		setVisible(true);
		
		//��ư ����
		Button b = new Button("Ȯ��");
		//��ư�� �����ӿ� ����
		add(b);
	}
	
	public static void main(String[] args) {
		new ButtonMain01();
	}
	
}
