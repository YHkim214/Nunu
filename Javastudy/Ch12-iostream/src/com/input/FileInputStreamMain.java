package com.input;

import java.io.*;

public class FileInputStreamMain {
	public static void main(String[] args) {
		FileInputStream fis = null;
		int readbyte = 0;
		byte[] readbyte2;
		String str = "";
		
		try {
			fis = new FileInputStream("file.txt");
			/*while((readbyte = fis.read()) != -1) { 파일에서 바이트 단위로 읽어옴. 한글깨짐
				System.out.print((char)readbyte);
			}*/
			readbyte2 = new byte[fis.available()];
			fis.read(readbyte2); //바이트 배열로 담아옴. 한글 안깨짐.
			System.out.println(new String(readbyte2)); //byte 배열을 스트링으로 바꿔줌
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try{if(fis != null)fis.close();}catch(IOException e) {}
		}
	}
}
