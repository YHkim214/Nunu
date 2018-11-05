package com.inetaddress;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain02 {
	public static void main(String[] args) {
		
		String url = null;
		InetAddress[] addresses;
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			//�ش� �����ΰ� ���εǾ��ִ� ��� �ּҸ� ��ȯ
			System.out.print("�� ����Ʈ �ּ� �Է�: ");
			url = br.readLine().trim();
			addresses = InetAddress.getAllByName(url);
			for(InetAddress idarr: addresses) {
				System.out.print("ȣ��Ʈ �̸�: " + idarr.getHostName());
				System.out.println(", IP �ּ�: " + idarr.getHostAddress());
			}
		}catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
