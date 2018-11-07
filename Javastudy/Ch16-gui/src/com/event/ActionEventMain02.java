package com.event;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;;

public class ActionEventMain02 extends Frame implements ActionListener{

	Panel p = new Panel();
	Button btn = new Button("����");
	Button exit = new Button("����");
	TextArea ta = new TextArea();
	TextField text = new TextField(10);
	
	public ActionEventMain02() {
		super("������");
		
		//�гο� ��ư ���
		p.add(text);
		p.add(btn);
		p.add(exit);
		
		btn.addActionListener(this);
		exit.addActionListener(this);
		
		//�����ӿ� �г�, �ؽ�Ʈ����� ���
		add(p, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		
		setBounds(300,300,300,250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ActionEventMain02();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand();
		if(name.equals("����")) {
			int dan = Integer.parseInt(text.getText());
			ta.setText("["+dan+"��]\n");
			for(int i = 1; i <= 9; i++) {
				ta.append(dan +" * "+i+"="+dan * i+"\n");
			}
			//�ؽ�Ʈ �ʵ� �ʱ�ȭ
			text.setText("");
			//�ؽ�Ʈ �ʵ忡 Ŀ���� ��
			text.requestFocus();
		} else if(name.equals("����")) {
			System.exit(0);
		}
	}
}