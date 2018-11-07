package com.event;

import java.awt.Frame;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.Checkbox;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ItemEventMain extends Frame implements ActionListener, ItemListener{
	
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	TextArea ta = new TextArea();
	Button exit = new Button("종료");
	Checkbox cb1 = new Checkbox("축구");
	Checkbox cb2 = new Checkbox("야구");
	Checkbox cb3 = new Checkbox("농구");
	Checkbox cb4 = new Checkbox("배구");
	
	public ItemEventMain() {
		super("checkbox 테스트");
		
		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);
		p1.add(cb4);
		
		p2.add(exit);
		
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.SOUTH);
		add(ta, BorderLayout.CENTER);
		
		setBounds(300,300,300,300);
		setVisible(true);
		
		exit.addActionListener(this);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			ta.append(e.getItem() + "를 선택.\n");
		}else if(e.getStateChange() == ItemEvent.DESELECTED) {
			ta.append(e.getItem() + "를 선택해제.\n");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if(str.equals("종료")) {
			System.exit(0);
		}
		
	}

	public static void main(String[] args) {
		new ItemEventMain();
		
	}
}

