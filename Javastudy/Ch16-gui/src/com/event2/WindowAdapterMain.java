package com.event2;

import java.awt.*;
import java.awt.event.*;

public class WindowAdapterMain extends Frame{
	
	Label label;
	
	public WindowAdapterMain() {
		super("WindowEvent �׽�Ʈ");
		
		label = new Label("�������� �����ư�� �����ּ���");
		
		add(label);
		setBounds(300,300,200,200);
		setVisible(true);
		
		//frame�� �̺�Ʈ ������ ����
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}	
		});
	}

	public static void main(String[] args) {
		new WindowAdapterMain();
	}

}


