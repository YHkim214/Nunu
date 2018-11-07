package com.event;

import java.awt.*;
import java.awt.event.*;

public class WindowEventMain extends Frame implements WindowListener{
	
	Label label;
	
	public WindowEventMain() {
		super("WindowEvent 테스트");
		
		label = new Label("프레임의 종료버튼을 눌러주세요");
		
		add(label);
		setBounds(300,300,200,200);
		setVisible(true);
		
		//frame과 이벤트 리스터 연결
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