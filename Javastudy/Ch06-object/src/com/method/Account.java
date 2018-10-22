package com.method;
import java.util.*;

public class Account {
	String account_num;
	String name;
	int balance;
	Scanner s = new Scanner(System.in);

	public Account() {
		System.out.print("�����ָ��� �Է��� �ּ���: ");
		this.name = s.nextLine();
		System.out.print("���¹�ȣ�� �Է��� �ּ���: ");
		this.account_num = s.nextLine();
	}
	
	public Account(String num, String name, int balance) {
		account_num = num;
		this.name = name;
		this.balance = balance;
	}

	public void entry(){
		int menu = 0;
		do{
			System.out.println("1.�����ϱ� | 2. ����ϱ�| 3.��������| 4.������");
			menu = s.nextInt();
			switch(menu) {
			case 1:
				deposit();
				break;
			case 2: 
				withdraw();
				break;
			case 3:
				print_account();
				break;
			}
		}while(menu >= 1 && menu <= 3);
		
		System.out.println("�̿��� �ּż� �����մϴ�");
	}

	public void deposit() {
		System.out.print("������ �ݾ��� �Է��� �ּ���: ");
		balance += s.nextInt();
		System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
	}

	public void withdraw() {
		System.out.print("����� �ݾ��� �Է��� �ּ���: ");
		balance -= s.nextInt();
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}

	public void print_account(){
		System.out.println("������: " + name);
		System.out.println("���¹�ȣ: " + account_num);
		System.out.println("�ܰ�: " + balance);
	}
}