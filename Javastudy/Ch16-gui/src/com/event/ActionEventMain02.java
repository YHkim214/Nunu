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
	Button btn = new Button("실행");
	Button exit = new Button("종료");
	TextArea ta = new TextArea();
	TextField text = new TextField(10);
	
	public ActionEventMain02() {
		super("구구단");
		
		//패널에 버튼 등록
		p.add(text);
		p.add(btn);
		p.add(exit);
		
		btn.addActionListener(this);
		exit.addActionListener(this);
		
		//프레임에 패널, 텍스트에어리어 등록
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
		if(name.equals("실행")) {
			int dan = Integer.parseInt(text.getText());
			ta.setText("["+dan+"단]\n");
			for(int i = 1; i <= 9; i++) {
				ta.append(dan +" * "+i+"="+dan * i+"\n");
			}
			//텍스트 필드 초기화
			text.setText("");
			//텍스트 필드에 커서를 둠
			text.requestFocus();
		} else if(name.equals("종료")) {
			System.exit(0);
		}
	}
}