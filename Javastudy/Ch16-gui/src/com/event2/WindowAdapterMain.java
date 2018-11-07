package com.event2;

import java.awt.*;
import java.awt.event.*;

public class WindowAdapterMain extends Frame{
	
	Label label;
	
	public WindowAdapterMain() {
		super("WindowEvent 테스트");
		
		label = new Label("프레임의 종료버튼을 눌러주세요");
		
		add(label);
		setBounds(300,300,200,200);
		setVisible(true);
		
		//frame과 이벤트 리스터 연결
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


