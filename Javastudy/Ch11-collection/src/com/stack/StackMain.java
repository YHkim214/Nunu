package com.stack;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		String[] array = {"���޷�","����","������","����","���"};
		Stack<String> stack = new Stack<>();

		for(String i : array) {
			stack.push(i);
		}
		//������ ��Ҹ� ��� ����ϴ¹��
		while(!stack.isEmpty()) { //������ ������� Ȯ��
			System.out.println(stack.pop());//���� ��ȯ�ϰ� �����͸� ����
		}
		
		System.out.println(stack.pop()); //������� ���ܹ߻�
	}
}