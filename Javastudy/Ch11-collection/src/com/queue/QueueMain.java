package com.queue;

import java.util.LinkedList;

public class QueueMain {
	public static void main(String[] args) {
		String[] array = {"����", "�λ�", "�뱸", "����", "��õ"};
		
		LinkedList<String> q = new LinkedList<>();
		
		for(String i: array) {
			q.offer(i);
		}
		
		while(q.peek() != null) {
			System.out.println(q.poll());//���� ��ȯ�ϰ� �����͸� ����
		}
	}
}
