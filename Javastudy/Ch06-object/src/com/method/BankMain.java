package com.method;

public class BankMain {

	//account Ŭ������ �����
	//���¹�ȣ(account_num) - String
	//������(name)
	//�ܰ�(balance) - int

	//�����ϱ� - deposit
	//����ϱ� - withdraw
	//�������� -  print_account


	public static void main(String[] args) {
		Account a = new Account("111-1111-1111", "����ȣ", 50000);
		a.entry();
		a.s.close();
	}

}
