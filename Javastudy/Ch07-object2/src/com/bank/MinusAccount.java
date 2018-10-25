package com.bank;

public class MinusAccount extends BankAccount {
	
	protected long minusLimit;
	
	public MinusAccount(String num, String password, String name, long balance, long minusLimit) {
		super(num, password, name, balance);
		this.minusLimit = minusLimit;
	}
	
	public void withdraw(long money) {
		if(money > balance + minusLimit) {
			System.out.println("�ѵ��� �ʰ��߽��ϴ�.");
			return;
		}
		balance -= money;
		System.out.println(money + "���� ��ݵǾ����ϴ�");
	}
	
	public void printAccount() {
		System.out.println("=========================");
		System.out.println("���̳ʽ� ���¹�ȣ: " + num);
		System.out.println("��й�ȣ: " + password);
		System.out.println("������: " + name);
		System.out.println("�ѵ�: " + minusLimit );
		System.out.printf("�ܰ�:  %,d��\n", balance);
		System.out.println("=========================");
	}
}