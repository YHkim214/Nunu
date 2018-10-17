import java.util.Vector;

public class Oop2_14 {
	//매개변수의 다형성을 이용한 코드 + vector를 이용한코드
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
	
	void buy(Product p){ //이렇게 하면 Product클래스를 상속한 모든 클래스의 인스턴스를 매개변수로 전달 할 수 있다.
		if(p.price > money) {
			System.out.println("잔액이 부족하여 구입할수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p); 
		System.out.println(p + "를 구입하셨습니다.");
	}
	
	void refund(Product p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "를 반품하셨습니다");
		} else {
			System.out.println("구입하신 제품중 해당 제품이없습니다");
		}
	}
	
	void summary(){
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다");
			return;
		}
		
		for(int i = 0; i < item.size(); i++) {
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += (i == 0) ? "" + p : "," + p;
		}
		
		System.out.println("구입하신 물품의 총 금액은 " + sum + "원 입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
		
	}
}