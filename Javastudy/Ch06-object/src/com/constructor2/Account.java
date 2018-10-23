package com.constructor2;

import java.util.Scanner;

class Account{
	String accountNo;
	String ownerName;
	int balance;
	Scanner s = new Scanner(System.in);

	public Account() {
		System.out.print("계좌번호: ");
		this.accountNo = s.nextLine();
		System.out.print("계좌주: ");
		this.ownerName = s.nextLine();
		System.out.print("잔고: ");
		this.balance = s.nextInt();
		System.out.println(ownerName + "님의 계좌가 생성되었습니다");
		printAccount();
	}
	
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
		System.out.println(ownerName + "님의 계좌가 생성되었습니다");
		printAccount();
	}
	
	public static void entry(){
		Account a = new Account();
		int menu = 0;
		do{
			System.out.println("1.예금하기 | 2. 출금하기| 3.정보보기| 4.새 계좌생성| 5.끝내기");
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
				System.out.println("새로운 계좌가 생성되었습니다");
				break;
			case 5: 
				System.out.println("이용해 주셔서 감사합니다");
				a.s.close();
				return;
			default:
				System.out.println("유효한 값을 입력해 주세요");
				break;
			}
		}while(true);
	}

	public void deposit() {
		System.out.print("입금 : ");
		int money = s.nextInt();
		if(money <= 0) {
			System.out.println("0보다 크게 입력해야합니다");
			return;
		}
		
		balance += money;
		System.out.println("입금이 완료되었습니다");
	}

	public void withdraw() {
		System.out.print("출금 : ");
		int money = s.nextInt();
		if(money <= 0) {
			System.out.println("0보다 크게 입력해야합니다");
			return;
		}
		
		if(money > balance) {
			System.out.println("잔고부족");
			return;
		}
		
		balance -= money;
		System.out.println("출금이 완료되었습니다");
	}

	public void printAccount() {
		System.out.println("계좌번호: " + accountNo);
		System.out.println("계좌주: " + ownerName);
		System.out.println("현재잔고: " + balance);
		System.out.println("=====================");
	}
}

