package com.account;

public class AccountTest {

	public static void main(String[] args) {

		Account a = new Account("100-123", 50000, 0.073);
		System.out.println(a);
		
		a.deposit(20000);
		System.out.println(a);
		
		System.out.println("이자: " + a.calculateInterest());

	}

}

class Account{
	private String account;
	private int balance;
	private double interestRate;

	public Account(){}
	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public double calculateInterest() {
		return balance * interestRate;
	}
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) {
		balance -= money;
	}

	@Override
	public String toString() {
		return String.format("계좌번호: %s\t현재잔액: %,d원", account, balance); 
	}

	public String getAccount() {
		return account;
	}
	public int getBalance() {
		return balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}