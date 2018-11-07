package com.display;

import java.awt.Frame;
import java.awt.Button;
import java.awt.Panel;
import java.awt.BorderLayout;


public class LayoutMain01 extends Frame{
	
	public LayoutMain01() {
		
		super("BorderLayout �׽�Ʈ");
		
		//frame�� �⺻������ BorderLayout�� ����Ǿ� �ֱ� ������ ���� �߰��� ���� �ʾƵ� �ȴ�.
		
		Button north = new Button("North");
		Button east = new Button("East");
		Button south = new Button("South");
		Button west = new Button("West");
		Button center = new Button("Center");
		
		Panel northP = new Panel();
		Panel eastP = new Panel();
		Panel southP = new Panel();
		Panel westP = new Panel();
		Panel centerP = new Panel();
		
		//���̾ƿ��� �̿��� ��ư��ġ
		northP.add(north);
		eastP.add(east);
		southP.add(south);
		westP.add(west);
		centerP.add(center);
		
		add(northP, BorderLayout.NORTH);
		add(eastP, BorderLayout.EAST);
		add(southP, BorderLayout.SOUTH);
		add(westP, BorderLayout.WEST);
		add(centerP, BorderLayout.CENTER);
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new LayoutMain01();
	}
}
