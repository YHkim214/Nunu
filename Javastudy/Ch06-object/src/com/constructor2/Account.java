package com.constructor2;

import java.util.Scanner;

class Account{
	String accountNo;
	String ownerName;
	int balance;
	Scanner s = new Scanner(System.in);

	public Account() {
		System.out.print("���¹�ȣ: ");
		this.accountNo = s.nextLine();
		System.out.print("������: ");
		this.ownerName = s.nextLine();
		System.out.print("�ܰ�: ");
		this.balance = s.nextInt();
		System.out.println(ownerName + "���� ���°� �����Ǿ����ϴ�");
		printAccount();
	}
	
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
		System.out.println(ownerName + "���� ���°� �����Ǿ����ϴ�");
		printAccount();
	}
	
	public static void entry(){
		Account a = new Account();
		int menu = 0;
		do{
			System.out.println("1.�����ϱ� | 2. ����ϱ�| 3.��������| 4.�� ���»���| 5.������");
			menu = a.s.nextInt();
			switch(menu) {
			case 1:
				a.deposit();
				break;
			case 2: 
				a.withdraw();
				break;
			case 3:
				a.printAccount();
				break;
			case 4:
				a = new Account();
				System.out.println("���ο� ���°� �����Ǿ����ϴ�");
				break;
			case 5: 
				System.out.println("�̿��� �ּż� �����մϴ�");
				a.s.close();
				return;
			default:
				System.out.println("��ȿ�� ���� �Է��� �ּ���");
				break;
			}
		}while(true);
	}

	public void deposit() {
		System.out.print("�Ա� : ");
		int money = s.nextInt();
		if(money <= 0) {
			System.out.println("0���� ũ�� �Է��ؾ��մϴ�");
			return;
		}
		
		balance += money;
		System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�");
	}

	public void withdraw() {
		System.out.print("��� : ");
		int money = s.nextInt();
		if(money <= 0) {
			System.out.println("0���� ũ�� �Է��ؾ��մϴ�");
			return;
		}
		
		if(money > balance) {
			System.out.println("�ܰ����");
			return;
		}
		
		balance -= money;
		System.out.println("����� �Ϸ�Ǿ����ϴ�");
	}

	public void printAccount() {
		System.out.println("���¹�ȣ: " + accountNo);
		System.out.println("������: " + ownerName);
		System.out.println("�����ܰ�: " + balance);
		System.out.println("=====================");
	}
}

