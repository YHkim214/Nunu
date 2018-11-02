package com.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LottoMain02 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		while(list.size()<6) {
			Random r = new Random();
			int num = r.nextInt(45) + 1;
			if(!list.contains(num)) {
				list.add(num);
			}
			
		}
		Collections.sort(list);

		System.out.println(list);
	}

}
