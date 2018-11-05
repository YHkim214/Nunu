package com.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
   private BufferedReader bufferR;
   private BufferedWriter bufferW;
   private InputStream is;
   private OutputStream os;
   private ServerSocket severS;
   private Socket tcpSocket;

   public EchoServer(int port) {
      try {
         //���� ���� ��ü����
         severS = new ServerSocket(port);
      }catch(IOException e) {
         e.printStackTrace();
         //���α׷� ����
         System.exit(0);
      }
      while(true) {
         try {
            System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� ��!");
            
            //Ŭ���̾�Ʈ�� ��û�� ��ٸ��ٰ� ��û�� ������ Ŭ���̾�Ʈ�� ������ ����ϸ鼭
            //������ ������� ���� Socket ��ü�� �����Ѵ�.
            tcpSocket = severS.accept();
            
            //Ŭ���̾�Ʈ�� IP�ּҸ� ���
            System.out.println("Ŭ���̾�Ʈ�� IP�ּ�: " + tcpSocket.getInetAddress().getHostAddress());
            
            //�Է½�Ʈ�� ����(Ŭ���̾�Ʈ�κ��� ������ ����)
            is = tcpSocket.getInputStream();
            
            //��½�Ʈ�� ����(�������� Ŭ���̾�Ʈ�� ������ ����)
            os = tcpSocket.getOutputStream();
            
            //����Ʈ��Ʈ���� ���ڽ�Ʈ������ ��ȯ
            bufferR = new BufferedReader(new InputStreamReader(is));
            bufferW = new BufferedWriter(new OutputStreamWriter(os));
            
            //Ŭ���̾�Ʈ�� ���� ������ ��ȯ
            String message = bufferR.readLine();
            System.out.println("���Ÿ޽���: " + message);
            
            message = message + System.getProperty("line.separator");
            
            //�����͸� Ŭ���̾�Ʈ���� ����
            bufferW.write(message);
            bufferW.flush();
            
         }catch(IOException e) {
            e.printStackTrace();
         }finally {
            if(bufferR!=null)try {bufferR.close();}catch(IOException e) {}
            if(bufferW!=null)try {bufferW.close();}catch(IOException e) {}
            if(tcpSocket!=null)try {tcpSocket.close();}catch(IOException e) {}
            
         }
      }
   }

   public static void main(String[] args) {
      new EchoServer(3000);

   }

}