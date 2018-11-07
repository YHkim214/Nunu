package com.socket;

import java.util.Scanner;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;


public class EchoClient2 {

	private String ip;
	private int port;
	private String str;
	private Socket tcpSocket;
	private OutputStream os_socket;
	private InputStream is_socket;
	private DataInputStream dis;
	private DataOutputStream dos;
	private Scanner scanner;


	public EchoClient2(String ip, int port) {
		this.ip = ip;
		this.port = port;
		//소켓 객체 생성(서버와 입출력 가능)
		tcpSocket = getSocket();

		try {
			//출력스트림 생성(서버에 데이터 전송)
			os_socket = tcpSocket.getOutputStream();
			//입력스트림 생성(서버로부터 데이터 수신)
			is_socket = tcpSocket.getInputStream();

			dis = new DataInputStream(is_socket);
			dos = new DataOutputStream(os_socket);

			new Thread() {
				public void run() {
					while(true) {
						try { 
							while(dis.available()>0) {
							    System.out.println("입력받은 값" + dis.readUTF());
							}
						} catch (Exception e) {
							e.printStackTrace();
							System.exit(0);
						}
					}
				}
			}.start();  

			while(true) {
				//콘솔에 데이터 입력
				scanner = new Scanner(System.in);
				System.out.print("입력: ");
				str = scanner.nextLine().trim();
				if(str.equalsIgnoreCase("exit")) {
					System.exit(0);
				}
				str += System.getProperty("line.separator");
				//서버로 전송
				dos.writeUTF(str);
				dos.flush();
			}

		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if(dis != null) try {dis.close();} catch(IOException e) {}
			if(dos != null) try {dos.close();} catch(IOException e) {}
			if(tcpSocket != null) try {tcpSocket.close();} catch(IOException e) {}
			if(scanner != null) scanner.close();
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
		new EchoClient2("192.168.10.18",3000);
	}

}