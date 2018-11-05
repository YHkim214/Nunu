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
			//해당 도메인과 매핑되어있는 모든 주소를 반환
			System.out.print("웹 사이트 주소 입력: ");
			url = br.readLine().trim();
			addresses = InetAddress.getAllByName(url);
			for(InetAddress idarr: addresses) {
				System.out.print("호스트 이름: " + idarr.getHostName());
				System.out.println(", IP 주소: " + idarr.getHostAddress());
			}
		}catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
