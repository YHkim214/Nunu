package com.display;

import java.awt.Frame;

public class FrameMain01 extends Frame{
	
	public FrameMain01() {
		//제목 설정
		super("Frame 테스트");
		//프레임 크기 설정
		setSize(300,200);
		//프레임 노출여부지정
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FrameMain01();
	}
}
