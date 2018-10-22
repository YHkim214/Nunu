package com.instance;


public class MethodMain03 {

	public static void increase(int[] n) {
		for(int i = 0; i < n.length; i++) {
			++n[i];
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40};
		
		increase(arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i] + " ");
		}

	}

}
