package com.queue;

import java.util.LinkedList;

public class QueueMain {
	public static void main(String[] args) {
		String[] array = {"서울", "부산", "대구", "광주", "인천"};
		
		LinkedList<String> q = new LinkedList<>();
		
		for(String i: array) {
			q.offer(i);
		}
		
		while(q.peek() != null) {
			System.out.println(q.poll());//값을 반환하고 데이터를 삭제
		}
	}
}
