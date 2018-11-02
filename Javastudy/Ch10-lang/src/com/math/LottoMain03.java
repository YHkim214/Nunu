package com.math;

import java.util.TreeSet;

public class LottoMain03 {

	public static void main(String[] args) {

		TreeSet<Integer> pool = new TreeSet<>();

		while(pool.size() < 6) {
			int num = (int)(Math.random()*45) + 1;
			pool.add(num);
		}

		System.out.println(pool);

	}


}
