package com.list;

import java.util.ArrayList;

class A{
	@Override
	public String toString() {
		return "A";
	}
}
class B{
	@Override
	public String toString() {
		return "B";
	}
}

public class ArrayListMain01 {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		
		list.add(new A());
		list.add(new B());
		list.add(new String("º’»ÔπŒ"));
		list.add(new Integer(20));
		
		System.out.println(list);
	}
}