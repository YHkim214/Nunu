package com.enumex;

enum Item2{
	ADD(5), DEL(11), SEARCH(2), CANCEL(22);
	
	private final int var;
	
	Item2(int v) {
		var = v;
	}
	
	public int getVar() {
		return var;
	}
}

public class EnumMain04 {

	public static void main(String[] args) {
		System.out.println(Item2.ADD);
		
		for(Item2 i : Item2.values()) {
			System.out.println(i.getVar());
		}
	}

}
