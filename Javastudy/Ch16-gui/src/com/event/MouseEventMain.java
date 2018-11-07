package com.event;

import java.awt.*;
import java.awt.event.*;

public class MouseEventMain extends Frame implements ActionListener, MouseMotionListener{
	
	Label move = new Label("마우스 따라다니기", Label.CENTER);
	Button exit = new Button("종료");
	
	public MouseEventMain() {
		super("MouseEvent 테스트");
		
		//컴포넌트에 마우스 커서의 좌표를 부여해서 해당좌표로 이동시키려면 좌표를 설정해서 위치를 부여해야함
		setLayout(null);
		
		//x,y,width,height
		move.setBounds(100, 150, 150, 20);
		exit.setBounds(250, 500, 50, 30);
		
		move.setForeground(Color.WHITE);
		move.setBackground(Color.RED);
		
		add(move);
		add(exit);
		
		setBounds(300,100,500,600);
		setVisible(true);
		
		exit.addActionListener(this);
		//frame과 이벤트 리스너 연결
		addMouseMotionListener(this);
	}

	public static void main(String[] args) {
		new MouseEventMain();

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		//마우스 포인터의 x,y를 point 객체에 담아서 반환
		Point p = e.getPoint();
		move.setLocation(p);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand();		
		if(name.equals("종료")) {
			System.exit(0);
		}
	}

}
