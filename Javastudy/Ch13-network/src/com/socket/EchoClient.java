package com.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;


public class EchoClient {
   
   private String ip;
   private int port;
   private String str;
   private BufferedReader file;
   private Socket tcpSocket;
   private OutputStream os_socket;
   private InputStream is_socket;
   private BufferedReader bufferR;
   private BufferedWriter bufferW;
   
   public EchoClient(String ip, int port) {
      this.ip = ip;
      this.port = port;
      //���� ��ü ����(������ ����� ����)
      tcpSocket = getSocket();
      
      try {
         //��½�Ʈ�� ����(������ ������ ����)
         os_socket = tcpSocket.getOutputStream();
         //�Է½�Ʈ�� ����(�����κ��� ������ ����)
         is_socket = tcpSocket.getInputStream();
         //����Ʈ ��Ʈ��->���ڽ�Ʈ�� ��ȯ
         bufferW = new BufferedWriter(new OutputStreamWriter(os_socket));
         bufferR = new BufferedReader(new InputStreamReader(is_socket));
         //�ֿܼ� ������ �Է�
         file = new BufferedReader(new InputStreamReader(System.in));
         System.out.print("�Է�: ");
         str = file.readLine();
         str += System.getProperty("line.separator");
         //������ ����
         bufferW.write(str);
         bufferW.flush();
         
         //�������� ���۵� ������ ����
         str = bufferR.readLine();
         System.out.println("Echo Result: " + str);
        
      }catch(IOException e) {
         e.printStackTrace();
      }finally {
         if(file!=null)try {file.close();}catch(IOException e) {}
         if(bufferW!=null)try {bufferW.close();}catch(IOException e) {}
         if(bufferR!=null)try {bufferR.close();}catch(IOException e) {}
         if(tcpSocket!=null)try {tcpSocket.close();}catch(IOException e) {}
      }
      
   }
   
   public Socket getSocket() {
      Socket tcpSocket = null;
      try {
         //Socket ��ü�� �����Ǹ� ���� ���ϰ�
         //����Ǿ tcp sock ����(����� ����)
         tcpSocket = new Socket(ip,port);
      }catch(IOException e) {
         e.printStackTrace();
         //���α׷� ����
         System.exit(0);
      }
      return tcpSocket;
   }
   
   public static void main(String[] args) {
      new EchoClient("192.168.10.19",3000);
   }

}