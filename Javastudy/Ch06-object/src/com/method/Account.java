package com.method;
import java.util.*;

public class Account {
	String account_num;
	String name;
	int balance;
	Scanner s = new Scanner(System.in);

	public Account() {
		System.out.print("계좌주명을 입력해 주세요: ");
		this.name = s.nextLine();
		System.out.print("계좌번호를 입력해 주세요: ");
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
			System.out.println("1.예금하기 | 2. 출금하기| 3.정보보기| 4.끝내기");
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
		
		System.out.println("이용해 주셔서 감사합니다");
	}

	public void deposit() {
		System.out.print("예금할 금액을 입력해 주세요: ");
		balance += s.nextInt();
		System.out.println("입금이 완료되었습니다.");
	}

	public void withdraw() {
		System.out.print("출금할 금액을 입력해 주세요: ");
		balance -= s.nextInt();
		System.out.println("출금이 완료되었습니다.");
	}

	public void print_account(){
		System.out.println("예금주: " + name);
		System.out.println("계좌번호: " + account_num);
		System.out.println("잔고: " + balance);
	}
}