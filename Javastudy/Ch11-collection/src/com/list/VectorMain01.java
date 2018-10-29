package com.list;

import java.util.Vector;

public class VectorMain01 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		
		v.add("김연아");
		v.add("장미란");
		v.add("손연재");
		v.add("이상화");
		
		for(int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		System.out.println();
		for(String str : v) {
			System.out.println(str);
		}
		
	}
}
