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
		//���� ��ü ����(������ ����� ����)
		tcpSocket = getSocket();

		try {
			//��½�Ʈ�� ����(������ ������ ����)
			os_socket = tcpSocket.getOutputStream();
			//�Է½�Ʈ�� ����(�����κ��� ������ ����)
			is_socket = tcpSocket.getInputStream();

			dis = new DataInputStream(is_socket);
			dos = new DataOutputStream(os_socket);

			new Thread() {
				public void run() {
					while(true) {
						try { 
							while(dis.available()>0) {
							    System.out.println("�Է¹��� ��" + dis.readUTF());
							}
						} catch (Exception e) {
							e.printStackTrace();
							System.exit(0);
						}
					}
				}
			}.start();  

			while(true) {
				//�ֿܼ� ������ �Է�
				scanner = new Scanner(System.in);
				System.out.print("�Է�: ");
				str = scanner.nextLine().trim();
				if(str.equalsIgnoreCase("exit")) {
					System.exit(0);
				}
				str += System.getProperty("line.separator");
				//������ ����
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
		new EchoClient2("192.168.10.18",3000);
	}

}