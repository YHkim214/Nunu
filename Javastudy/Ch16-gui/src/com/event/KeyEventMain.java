package com.event;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventMain extends Frame implements KeyListener{
   
   TextArea ta = new TextArea();
   
   public KeyEventMain() {
      //������
      super("KeyEvent �׽�Ʈ");
      
      //TextArea�� Frame�� ���
      add(ta);
      
      ta.addKeyListener(this);
      //x,y,width,height
      setBounds(300,300,300,300);
      //Frame ���� ���� ����
      setVisible(true);
   }
   //event �ڵ鷯 ����
   @Override
   public void keyReleased(KeyEvent e) {}
   @Override
   public void keyTyped(KeyEvent e) {}
   @Override
   public void keyPressed(KeyEvent e) {
	   
	   if(e.getKeyCode()== KeyEvent.VK_DOWN) {
		   ta.append("�ٿ� Ű ������\n");
	   }
	   if(e.getKeyCode()== KeyEvent.VK_UP) {
		   ta.append("�� Ű ������\n");
	   }
	   if(e.getKeyCode()== KeyEvent.VK_LEFT) {
		   ta.append("����Ʈ Ű ������\n");
	   }
	   if(e.getKeyCode()== KeyEvent.VK_RIGHT) {
		   ta.append("������ Ű ������\n");
	   }
	   if(e.getKeyCode()== KeyEvent.VK_ENTER) {
		   ta.append("���� Ű ������");
	   }
	   
   }
   
   public static void main(String[] args) {
      new KeyEventMain();

   }
}


