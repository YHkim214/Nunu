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
      //소켓 객체 생성(서버와 입출력 가능)
      tcpSocket = getSocket();
      
      try {
         //출력스트림 생성(서버에 데이터 전송)
         os_socket = tcpSocket.getOutputStream();
         //입력스트림 생성(서버로부터 데이터 수신)
         is_socket = tcpSocket.getInputStream();
         //바이트 스트림->문자스트림 변환
         bufferW = new BufferedWriter(new OutputStreamWriter(os_socket));
         bufferR = new BufferedReader(new InputStreamReader(is_socket));
         //콘솔에 데이터 입력
         file = new BufferedReader(new InputStreamReader(System.in));
         System.out.print("입력: ");
         str = file.readLine();
         str += System.getProperty("line.separator");
         //서버로 전송
         bufferW.write(str);
         bufferW.flush();
         
         //서버에서 전송된 데이터 수신
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
         //Socket 객체가 생성되면 서버 소켓과
         //연결되어서 tcp sock 생성(입출력 가능)
         tcpSocket = new Socket(ip,port);
      }catch(IOException e) {
         e.printStackTrace();
         //프로그램 종료
         System.exit(0);
      }
      return tcpSocket;
   }
   
   public static void main(String[] args) {
      new EchoClient("192.168.10.19",3000);
   }

}