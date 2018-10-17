import java.util.Vector;

public class Oop2_14 {
	//�Ű������� �������� �̿��� �ڵ� + vector�� �̿����ڵ�
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv3 tv = new Tv3();
		Computer computer = new Computer();
		Audio audio = new Audio();
		b.buy(tv);
		b.buy(computer);
		b.buy(audio);
		b.summary();
		b.refund(computer);
		b.summary();
	}

}

class Product{
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
	}
}

class Tv3 extends Product{
	Tv3(){
		super(100);
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product{
	Computer(){
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product{
	Audio(){
		super(50);
	}
	
	public String toString() {
		return "Audio";
	}
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector();
	int i = 0;
	
	void buy(Product p){ //�̷��� �ϸ� ProductŬ������ ����� ��� Ŭ������ �ν��Ͻ��� �Ű������� ���� �� �� �ִ�.
		if(p.price > money) {
			System.out.println("�ܾ��� �����Ͽ� �����Ҽ� �����ϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p); 
		System.out.println(p + "�� �����ϼ̽��ϴ�.");
	}
	
	void refund(Product p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "�� ��ǰ�ϼ̽��ϴ�");
		} else {
			System.out.println("�����Ͻ� ��ǰ�� �ش� ��ǰ�̾����ϴ�");
		}
	}
	
	void summary(){
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�");
			return;
		}
		
		for(int i = 0; i < item.size(); i++) {
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += (i == 0) ? "" + p : "," + p;
		}
		
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ��� " + sum + "�� �Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
		
	}
}