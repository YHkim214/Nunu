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
		System.out.println( name+"���� ���°� �����Ǿ����ϴ�.");
	}
	
	public void deposit(long money) {
		balance += money;
		System.out.println(money + "���� �ԱݵǾ����ϴ�");
	}
	
	public void withdraw(long money) {
		if(money > balance) {
			System.out.println("�ܰ� �����մϴ�.");
			return;
		}
		balance -= money;
		System.out.println(money + "���� ��ݵǾ����ϴ�");
	}
	
	public void printAccount() {
		System.out.println("=========================");
		System.out.println("�Ϲ� ���¹�ȣ: " + num);
		System.out.println("��й�ȣ: " + password);
		System.out.println("������: " + name);
		System.out.printf("�ܰ�:  %,d��\n", balance);
		System.out.println("=========================");
	}
}