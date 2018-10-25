package com.poly;

class Product{
	int price;
	int bonusPoint;
	
	public Product(int price) {
		this.price = price;
		this.bonusPoint = price / 10;
	}
	
	public String getName() {
		return "��ǰ";
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
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p.getName() + "��/�� �����Ͽ����ϴ�.");
		System.out.println("���� ���� ��: " + money + "�����Դϴ�");
		System.out.println("���� ���ʽ� ����Ʈ: " + bonusPoint + "���Դϴ�");
	}
}

public class PolyMain04 {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		b.buy(new Computer());
		b.buy(new Tv());
		
	}

}