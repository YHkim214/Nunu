package com.inetaddress;

import java.net.InetAddress;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.UnknownHostException;

public class InetAddressMain01 {
	public static void main(String[] args) {
		
		InetAddress iaddr = null;
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			//Ư�� �ּ��� ȣ��Ʈ�̸��� ip�ּҸ� �޾ƿ��� �ڵ�
			System.out.print("������Ʈ �ּ��Է�: ");
			String url = br.readLine();
			iaddr = InetAddress.getByName(url);
			System.out.println("ȣ��Ʈ �̸�: " + iaddr.getHostName());
			System.out.println("ȣ��Ʈ IP�ּ�: " + iaddr.getHostAddress());
			
			System.out.println("======================");
			
			iaddr = InetAddress.getLocalHost();
			
			System.out.println("����ȣ��Ʈ �̸�: " + iaddr.getHostName());
			System.out.println("����ȣ��Ʈ IP�ּ�: " + iaddr.getHostAddress());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
