package com.bank;

public class BankMain {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount("100-123", "1234", "ȫ�浿", 10000L);
		ba.printAccount();
		ba.deposit(3000L);
		ba.printAccount();
		ba.withdraw(10000L);
		ba.printAccount();
		
		MinusAccount ma = new MinusAccount("200-123", "1234", "ȫ�浿", 10000L, 500L);
		ma.printAccount();
		ma.deposit(3000L);
		ma.printAccount();
		ma.withdraw(19000L);
		ma.printAccount();
	}
}
