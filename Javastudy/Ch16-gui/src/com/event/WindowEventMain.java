package com.event;

import java.awt.*;
import java.awt.event.*;

public class WindowEventMain extends Frame implements WindowListener{
	
	Label label;
	
	public WindowEventMain() {
		super("WindowEvent �׽�Ʈ");
		
		label = new Label("�������� �����ư�� �����ּ���");
		
		add(label);
		setBounds(300,300,200,200);
		setVisible(true);
		
		//frame�� �̺�Ʈ ������ ����
		addWindowListener(this);
	}
	
	public static void main(String[] args) {
		new WindowEventMain();
	}

	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}
}