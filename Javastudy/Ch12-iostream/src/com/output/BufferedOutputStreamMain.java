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
			
			String str = "bufferedOutputStream Test �Դϴ�";
			bos.write(str.getBytes());//�����͸� ���ۿ� ����.
//			bos.flush();//���ۿ� ����Ȱ��� �������� ���۸� ����. �̰� ���ϸ� ���Ͽ� ������ �������� ����.
			
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try {if(bos != null)bos.close();} catch (IOException e) {e.printStackTrace();}
			try {if(fos != null)fos.close();} catch (IOException e) {e.printStackTrace();}
			//��Ʈ���� ���� ���� �� ������ �������� �ݴ´�.
			//�������� ���۸� �ڵ����� ����ش�.                                                                                                                                    
		}
		
	}
}
