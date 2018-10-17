
public class Oop2_3 {
	//������ ī��̴� �ڵ�
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
	
	public String toString() { //objectŬ������ toString �޼ҵ带 �������̵�
		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String numbers = "0A23456789XJQK";
		
		return "kind: "+ kinds[this.kind] +", number: " + numbers.charAt(this.number);
	}
}

class Deck{
	final int CARD_NUM = 52;
	Card cardArr[] = new Card[CARD_NUM]; //Card�迭�� �ɹ��� �޴´�
	
	Deck() {
		int i = 0;
		for(int k = Card.KIND_MAX; k > 0; k--) { //card�迭�� �ʱ�ȭ�ϴ� �ڵ�
			for(int n = 0; n < Card.NUM_MAX; n++) {
				cardArr[i++] = new Card(k, n+1);
			}
		}
	}
	
	Card pick(int index) {
		return cardArr[index];
	}
	
	Card pick() {
		int num = (int)(Math.random() * CARD_NUM); //������ �ε����� �ִ� Card�� �����Ѵ�
		return pick(num);
	}
	
	void shuffle() {
		for(int i = 0; i < Card.NUM_MAX; i++) { //������ �̿��� cardArr��  ���´�
			int num = (int)(Math.random() * CARD_NUM);
			Card tmp = cardArr[0];
			cardArr[0] = cardArr[num];
			cardArr[num] = tmp;
		}
			
	}
}