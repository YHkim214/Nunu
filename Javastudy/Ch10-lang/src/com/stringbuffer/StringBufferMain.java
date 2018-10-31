package com.stringbuffer;

public class StringBufferMain {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("여름 덥다");
		System.out.println(sb);
		
		sb.insert(2, "이"); //해당 인덱스에 문자열 삽입
		System.out.println(sb);
		
		sb.append(" 가을은 ");
		System.out.println(sb);
		
		sb.append("시원하다");
		System.out.println(sb);
		
		sb.replace(0, 3, "여행가자!!"); //시작인덱스 부터 끝-1 인덱스까지
		System.out.println(sb);
		
		sb.deleteCharAt(0);
		System.out.println(sb);
		
		sb.delete(0, 3);
		System.out.println(sb);
		
		String s = sb.toString();
		System.out.println(s);
		}
}
