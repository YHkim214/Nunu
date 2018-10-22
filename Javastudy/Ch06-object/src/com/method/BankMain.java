package com.method;

public class BankMain {

	//account 클래스를 만들고
	//계좌번호(account_num) - String
	//예금주(name)
	//잔고(balance) - int

	//예금하기 - deposit
	//출금하기 - withdraw
	//계좌정보 -  print_account


	public static void main(String[] args) {
		Account a = new Account("111-1111-1111", "김윤호", 50000);
		a.entry();
		a.s.close();
	}

}
