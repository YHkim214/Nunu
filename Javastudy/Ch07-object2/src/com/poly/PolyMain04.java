package com.poly;

class Product{
	int price;
	int bonusPoint;
	
	public Product(int price) {
		this.price = price;
		this.bonusPoint = price / 10;
	}
	
	public String getName() {
		return "상품";
	}
}

class Tv extends Product{
	public Tv(){
		super(100);
	}
	
	@Override
	public String getName() {
		return "Tv";
	}
}

class Computer extends Product{
	public Computer(){
		super(200);
	}
	
	@Override
	public String getName() {
		return "Computer";
	}
}

class Buyer{
	private int money = 1000;
	private int bonusPoint = 0;
	
	public void buy(Product p) {
		if(p.price > money) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p.getName() + "을/를 구입하였습니다.");
		System.out.println("현재 남은 돈: " + money + "만원입니다");
		System.out.println("현재 보너스 포인트: " + bonusPoint + "점입니다");
	}
}

public class PolyMain04 {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		b.buy(new Computer());
		b.buy(new Tv());
		
	}

}