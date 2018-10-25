package com.bank;

public class MinusAccount extends BankAccount {
	
	protected long minusLimit;
	
	public MinusAccount(String num, String password, String name, long balance, long minusLimit) {
		super(num, password, name, balance);
		this.minusLimit = minusLimit;
	}
	
	public void withdraw(long money) {
		if(money > balance + minusLimit) {
			System.out.println("한도를 초과했습니다.");
			return;
		}
		balance -= money;
		System.out.println(money + "원이 출금되었습니다");
	}
	
	public void printAccount() {
		System.out.println("=========================");
		System.out.println("마이너스 계좌번호: " + num);
		System.out.println("비밀번호: " + password);
		System.out.println("계좌주: " + name);
		System.out.println("한도: " + minusLimit );
		System.out.printf("잔고:  %,d원\n", balance);
		System.out.println("=========================");
	}
}