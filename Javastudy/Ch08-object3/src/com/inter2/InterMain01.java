package com.inter2;

import java.util.ArrayList;

interface I{
	public abstract void play();
}

class A implements I{
	@Override
	public void play() {
		System.out.println("�������忡�� ���!");
	}
}

class B implements I{
	@Override
	public void play() {
		System.out.println("�Ե����忡�� ���!");
	}
}

class User{
	public void autoPlay(I i) {
		i.play();
	}
}

public class InterMain01 {
	public static void main(String[] args) {
		
		ArrayList<I> list = new ArrayList<>();
		list.add(new A());
		list.add(new B());
		
		User u = new User();
		
		for(I i : list) {
			u.autoPlay(i);
		}
		
	}
}
