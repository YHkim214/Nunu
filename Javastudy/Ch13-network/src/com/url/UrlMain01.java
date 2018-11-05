package com.url;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlMain01 {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://java.sun.com/index.jsp?name=kim#content");
			System.out.println("프로토콜: " + url.getProtocol());
			System.out.println("호스트: " + url.getHost());
			System.out.println("포트: " + url.getPort());
			System.out.println("디폴트포트: " + url.getDefaultPort());
			System.out.println("패스: " + url.getPath());
			System.out.println("쿼리스트링: " + url.getQuery());
			System.out.println("레퍼런스: " + url.getRef());
		} catch(MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
