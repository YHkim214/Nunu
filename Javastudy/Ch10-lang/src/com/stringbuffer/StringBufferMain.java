package com.stringbuffer;

public class StringBufferMain {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("���� ����");
		System.out.println(sb);
		
		sb.insert(2, "��"); //�ش� �ε����� ���ڿ� ����
		System.out.println(sb);
		
		sb.append(" ������ ");
		System.out.println(sb);
		
		sb.append("�ÿ��ϴ�");
		System.out.println(sb);
		
		sb.replace(0, 3, "���డ��!!"); //�����ε��� ���� ��-1 �ε�������
		System.out.println(sb);
		
		sb.deleteCharAt(0);
		System.out.println(sb);
		
		sb.delete(0, 3);
		System.out.println(sb);
		
		String s = sb.toString();
		System.out.println(s);
		}
}
