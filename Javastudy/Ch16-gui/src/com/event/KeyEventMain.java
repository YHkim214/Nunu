package com.event;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventMain extends Frame implements KeyListener{
   
   TextArea ta = new TextArea();
   
   public KeyEventMain() {
      //제목설정
      super("KeyEvent 테스트");
      
      //TextArea를 Frame에 등록
      add(ta);
      
      ta.addKeyListener(this);
      //x,y,width,height
      setBounds(300,300,300,300);
      //Frame 노출 여부 지정
      setVisible(true);
   }
   //event 핸들러 구현
   @Override
   public void keyReleased(KeyEvent e) {}
   @Override
   public void keyTyped(KeyEvent e) {}
   @Override
   public void keyPressed(KeyEvent e) {
	   
	   if(e.getKeyCode()== KeyEvent.VK_DOWN) {
		   ta.append("다운 키 눌렀다\n");
	   }
	   if(e.getKeyCode()== KeyEvent.VK_UP) {
		   ta.append("업 키 눌렀다\n");
	   }
	   if(e.getKeyCode()== KeyEvent.VK_LEFT) {
		   ta.append("레프트 키 눌렀다\n");
	   }
	   if(e.getKeyCode()== KeyEvent.VK_RIGHT) {
		   ta.append("오른쪽 키 눌렀다\n");
	   }
	   if(e.getKeyCode()== KeyEvent.VK_ENTER) {
		   ta.append("앤터 키 눌렀다");
	   }
	   
   }
   
   public static void main(String[] args) {
      new KeyEventMain();

   }
}


