package com.display;

import java.awt.Frame;
import java.awt.Button;
import java.awt.Panel;

public class PanelMain01 extends Frame{
	
	public PanelMain01() {
		super("panel Å×½ºÆ®");
		
		Panel p = new Panel();
		Button ok = new Button("OK");
		Button yes = new Button("YES");
		p.add(ok);
		p.add(yes);
		add(p);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new PanelMain01();
	}
}
