
public class Oop2_3 {
	//덱에서 카드뽑는 코드
	public static void main(String[] args) {
		Deck d = new Deck();
		System.out.println(d.pick(0));
		d.shuffle();
		System.out.println(d.pick(0));
		System.out.println(d.pick());

	}

}

class Card{
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;
	
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	int kind;
	int number;
	
	Card(){
		this(SPADE, 1);
	}
	Card(int kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() { //object클래스의 toString 메소드를 오버라이딩
		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String numbers = "0A23456789XJQK";
		
		return "kind: "+ kinds[this.kind] +", number: " + numbers.charAt(this.number);
	}
}

class Deck{
	final int CARD_NUM = 52;
	Card cardArr[] = new Card[CARD_NUM]; //Card배열을 맴버로 받는다
	
	Deck() {
		int i = 0;
		for(int k = Card.KIND_MAX; k > 0; k--) { //card배열을 초기화하는 코드
			for(int n = 0; n < Card.NUM_MAX; n++) {
				cardArr[i++] = new Card(k, n+1);
			}
		}
	}
	
	Card pick(int index) {
		return cardArr[index];
	}
	
	Card pick() {
		int num = (int)(Math.random() * CARD_NUM); //임의의 인덱스에 있는 Card를 리턴한다
		return pick(num);
	}
	
	void shuffle() {
		for(int i = 0; i < Card.NUM_MAX; i++) { //난수를 이용해 cardArr를  섞는다
			int num = (int)(Math.random() * CARD_NUM);
			Card tmp = cardArr[0];
			cardArr[0] = cardArr[num];
			cardArr[num] = tmp;
		}
			
	}
}