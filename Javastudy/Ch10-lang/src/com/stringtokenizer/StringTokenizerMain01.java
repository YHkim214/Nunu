package com.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerMain01 {
	public static void main(String[] args) {
		String source = "100,200,300,400-500.600.700.800";
		StringTokenizer st = new StringTokenizer(source, ",-.");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
