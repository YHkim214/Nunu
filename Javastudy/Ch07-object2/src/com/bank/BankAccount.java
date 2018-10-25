package com.bank;

public class BankAccount {
	
	protected String num;
	protected String password;
	protected String name;
	protected long balance;
	
	public BankAccount(String num, String password, String name, long balance) {
		this.num = num;
		this.password = password;
		this.name = name;
		this.balance = balance;
		System.out.println( name+"님의 계좌가 개설되었습니다.");
	}
	
	public void deposit(long money) {
		balance += money;
		System.out.println(money + "원이 입금되었습니다");
	}
	
	public void withdraw(long money) {
		if(money > balance) {
			System.out.println("잔고가 부족합니다.");
			return;
		}
		balance -= money;
		System.out.println(money + "원이 출금되었습니다");
	}
	
	public void printAccount() {
		System.out.println("=========================");
		System.out.println("일반 계좌번호: " + num);
		System.out.println("비밀번호: " + password);
		System.out.println("계좌주: " + name);
		System.out.printf("잔고:  %,d원\n", balance);
		System.out.println("=========================");
	}
}