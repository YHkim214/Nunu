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
         //서버 소켓 객체생성
         severS = new ServerSocket(port);
      }catch(IOException e) {
         e.printStackTrace();
         //프로그램 종료
         System.exit(0);
      }
      while(true) {
         try {
            System.out.println("클라이언트의 요청을 기다리는 중!");
            
            //클라이언트에 요청을 기다리다가 요청이 들어오면 클라이언트와 접속을 허용하면서
            //데이터 입출력을 위한 Socket 객체를 생성한다.
            tcpSocket = severS.accept();
            
            //클라이언트의 IP주소를 출력
            System.out.println("클라이언트의 IP주소: " + tcpSocket.getInetAddress().getHostAddress());
            
            //입력스트림 생성(클라이언트로부터 데이터 수신)
            is = tcpSocket.getInputStream();
            
            //출력스트림 생성(서버에서 클라이언트에 데이터 전송)
            os = tcpSocket.getOutputStream();
            
            //바이트스트림을 문자스트림으로 변환
            bufferR = new BufferedReader(new InputStreamReader(is));
            bufferW = new BufferedWriter(new OutputStreamWriter(os));
            
            //클라이언트가 보낸 데이터 반환
            String message = bufferR.readLine();
            System.out.println("수신메시지: " + message);
            
            message = message + System.getProperty("line.separator");
            
            //데이터를 클라이언트에게 전송
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