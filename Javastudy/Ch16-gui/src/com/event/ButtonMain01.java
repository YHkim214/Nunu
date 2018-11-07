package com.event;

import java.awt.Button;
import java.awt.Frame;

public class ButtonMain01 extends Frame{
	
	//일반적인 ui작업은 생성자에서 다 처리한다.
	public ButtonMain01() {
		super("Button 테스트");
		setSize(300,300);
		setVisible(true);
		
		//버튼 생성
		Button b = new Button("확인");
		//버튼을 프레임에 연결
		add(b);
	}
	
	public static void main(String[] args) {
		new ButtonMain01();
	}
	
}
