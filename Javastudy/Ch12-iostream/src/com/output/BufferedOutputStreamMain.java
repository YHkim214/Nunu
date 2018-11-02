package com.output;

import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class BufferedOutputStreamMain {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("bufferOut.txt");
			bos = new BufferedOutputStream(fos);
			
			String str = "bufferedOutputStream Test 입니다";
			bos.write(str.getBytes());//데이터를 버퍼에 저장.
//			bos.flush();//버퍼에 저장된값을 내보내고 버퍼를 비운다. 이걸 안하면 파일에 내용을 저장하지 않음.
			
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try {if(bos != null)bos.close();} catch (IOException e) {e.printStackTrace();}
			try {if(fos != null)fos.close();} catch (IOException e) {e.printStackTrace();}
			//스트림을 닫을 때는 연 순서의 역순으로 닫는다.
			//닫을때는 버퍼를 자동으로 비워준다.                                                                                                                                    
		}
		
	}
}
