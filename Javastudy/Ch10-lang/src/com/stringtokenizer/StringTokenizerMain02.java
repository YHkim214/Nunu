package com.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerMain02 {

	public static void main(String[] args) {
		
		String source = "2018-10-31 14:43:12";
		StringTokenizer st = new StringTokenizer(source, "- :");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
