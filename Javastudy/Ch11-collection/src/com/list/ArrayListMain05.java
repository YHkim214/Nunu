package com.list;

import java.util.ArrayList;

public class ArrayListMain05 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(15);
		list.add(16);
		
		for(int i = list.size() - 1; i >= 0 ; i--) { //컬렉션에서 삭제할때는 마지막 인덱스부터
			if(list.get(i) % 2 == 0) list.remove(i);
		}
		
		System.out.println(list);

	}

}
