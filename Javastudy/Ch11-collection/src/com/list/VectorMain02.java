package com.list;

import java.util.Vector;

public class VectorMain02 {

	public static void main(String[] args) {
		Vector<Double> v = new Vector<>();
		
		v.add(100.3);
		v.add(3.14);
		v.add(1000.);
		
		for(Double d: v) {
			System.out.println(d);
		}
	}

}
