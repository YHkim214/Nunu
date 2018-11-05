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
			//���ͳ� �ּҸ� �����ؼ� URL ��ü ����
			url = new URL(address);
			br = new BufferedReader(new InputStreamReader(url.openStream(), "utf-8"));//���⼭ ���ڵ� ��� ��������
			//URL�� ���� ������ ����, ����Ű�� ������ ȣ���ؼ� ������ ���޹���
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
