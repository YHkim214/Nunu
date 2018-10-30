package com.stack;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		String[] array = {"진달래","백합","개나리","벚꽃","장미"};
		Stack<String> stack = new Stack<>();

		for(String i : array) {
			stack.push(i);
		}
		//스택의 요소를 모두 출력하는방법
		while(!stack.isEmpty()) { //스택이 비었는지 확인
			System.out.println(stack.pop());//값을 반환하고 데이터를 삭제
		}
		
		System.out.println(stack.pop()); //비었으면 예외발생
	}
}