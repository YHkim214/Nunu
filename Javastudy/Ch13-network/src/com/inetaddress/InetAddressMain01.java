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
			//특정 주소의 호스트이름과 ip주소를 받아오는 코드
			System.out.print("웹사이트 주소입력: ");
			String url = br.readLine();
			iaddr = InetAddress.getByName(url);
			System.out.println("호스트 이름: " + iaddr.getHostName());
			System.out.println("호스트 IP주소: " + iaddr.getHostAddress());
			
			System.out.println("======================");
			
			iaddr = InetAddress.getLocalHost();
			
			System.out.println("로컬호스트 이름: " + iaddr.getHostName());
			System.out.println("로컬호스트 IP주소: " + iaddr.getHostAddress());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
