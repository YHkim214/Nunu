package com.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerMain03 {

	public static void main(String[] args) {
		
		String expression = "x=100*(200+300)/2";
		StringTokenizer st = new StringTokenizer(expression,"+*()=/", true); //�������� ����° ���ڿ� true�� ǥ���ϸ� �����ڵ� ���
		
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken());
		}
	}

}
