package com.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerMain03 {

	public static void main(String[] args) {
		
		String expression = "x=100*(200+300)/2";
		StringTokenizer st = new StringTokenizer(expression,"+*()=/", true); //생성자의 세번째 인자에 true로 표시하면 구분자도 출력
		
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken());
		}
	}

}
