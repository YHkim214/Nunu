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
			/*while((readbyte = fis.read()) != -1) { ���Ͽ��� ����Ʈ ������ �о��. �ѱ۱���
				System.out.print((char)readbyte);
			}*/
			readbyte2 = new byte[fis.available()];
			fis.read(readbyte2); //����Ʈ �迭�� ��ƿ�. �ѱ� �ȱ���.
			System.out.println(new String(readbyte2)); //byte �迭�� ��Ʈ������ �ٲ���
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try{if(fis != null)fis.close();}catch(IOException e) {}
		}
	}
}
