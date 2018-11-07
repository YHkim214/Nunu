package com.event;

import java.awt.*;
import java.awt.event.*;

public class MouseEventMain extends Frame implements ActionListener, MouseMotionListener{
	
	Label move = new Label("���콺 ����ٴϱ�", Label.CENTER);
	Button exit = new Button("����");
	
	public MouseEventMain() {
		super("MouseEvent �׽�Ʈ");
		
		//������Ʈ�� ���콺 Ŀ���� ��ǥ�� �ο��ؼ� �ش���ǥ�� �̵���Ű���� ��ǥ�� �����ؼ� ��ġ�� �ο��ؾ���
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
		//frame�� �̺�Ʈ ������ ����
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
		//���콺 �������� x,y�� point ��ü�� ��Ƽ� ��ȯ
		Point p = e.getPoint();
		move.setLocation(p);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand();		
		if(name.equals("����")) {
			System.exit(0);
		}
	}

}
