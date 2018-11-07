package com.event;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventMain01 extends Frame implements ActionListener{
	
	Panel p;
	Button input, exit;
	TextArea ta;
	
	public ActionEventMain01() {
		
		super("ActionEvent 테스트");
		
		p = new Panel();		
		input = new Button("입력");
		exit = new Button("종료");	
		
		
		input.addActionListener(this);
		exit.addActionListener(this);
		
		p.add(input);
		p.add(exit);
		add(p, BorderLayout.CENTER);
		
		ta = new TextArea();	
		add(ta, BorderLayout.NORTH);
		
		setBounds(300,300,300,200);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand();
		if(name.equals("입력")) {
			ta.append("입력버튼을 눌렀군요\n");
		}else {
			ta.append("종료버튼을 눌렀군요\n");
		}
	}
	
	public static void main(String[] args) {
		new ActionEventMain01();
	}

}
