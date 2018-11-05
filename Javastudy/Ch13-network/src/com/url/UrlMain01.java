package com.url;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlMain01 {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://java.sun.com/index.jsp?name=kim#content");
			System.out.println("��������: " + url.getProtocol());
			System.out.println("ȣ��Ʈ: " + url.getHost());
			System.out.println("��Ʈ: " + url.getPort());
			System.out.println("����Ʈ��Ʈ: " + url.getDefaultPort());
			System.out.println("�н�: " + url.getPath());
			System.out.println("������Ʈ��: " + url.getQuery());
			System.out.println("���۷���: " + url.getRef());
		} catch(MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
