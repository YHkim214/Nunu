package com.file;

public class StandardInput01 {
	public static void main(String[] args) {
		try {
			System.out.print("������ �Ѱ� �Է�: ");
			int a = System.in.read(); //�����ϳ� �Է¹޾Ƽ� �ƽ�Ű�ڵ�� ��ȯ
			System.out.println((char)a);
			System.in.read(); //����Ű�� ġ�¼��� �ԷµǴ� \r\n�� �����ϱ����� �� �� �о�´�.
			System.in.read();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("==================");
		
		try {
			System.out.print("�����ϳ� �Է�: ");
			int b = System.in.read();
			System.out.println((char)b);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}