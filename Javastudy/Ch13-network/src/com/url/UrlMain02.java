package com.url;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URL;

public class UrlMain02 {

	public static void main(String[] args) {
		
		URL url = null;
		
		String address = "https://www.naver.com/index.html";
		String line = null;
		BufferedReader br = null;
		try{
			//인터넷 주소를 전달해서 URL 객체 생성
			url = new URL(address);
			br = new BufferedReader(new InputStreamReader(url.openStream(), "utf-8"));//여기서 인코딩 방식 지정가능
			//URL을 통해 서버에 접근, 가리키는 파일을 호출해서 내용을 전달받음
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(br != null) try {br.close();} catch (IOException e) {}
		}
		
	}

}
