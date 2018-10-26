package com.exception;

public class ExceptionMain10 {

	public void methodA(String[] n) throws Exception {
		if(n.length > 0) {
			for(String s : n) {
				System.out.println(s);
			}
		} else {
			throw new Exception("입력한 내용이 없습니다");
		}
	}
	
	public static void main(String[] args) {
		
		ExceptionMain10 em = new ExceptionMain10();
		try {
			em.methodA(args);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}