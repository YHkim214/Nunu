
public class Oop5 {

	public static void main(String[] args) {
		System.out.printf("Card.width = %d\n", Card.width);//static맴버는 인스턴스를 생성하지 않아도 호출할수있다,
		System.out.printf("Card.height = %d\n", Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.printf("c1은 %s, %d이며 크기는 (%d, %d)\n", c1.kind, c1.number, c1.width, c1.height);
		System.out.printf("c2은 %s, %d이며 크기는 (%d, %d)\n", c2.kind, c2.number, c2.width, c2.height);
		
		System.out.printf("c1의 크기를 각각 50, 80으로변경합니다\n");
		c1.width = 50; 
		c1.height = 80;
		//static 맴버의값은 모든 인스턴스가 공유하기 때문에 바뀌면 모든 인스턴스에 영향을 준다 
		System.out.printf("c1은 %s, %d이며 크기는 (%d, %d)\n", c1.kind, c1.number, c1.width, c1.height); 
		System.out.printf("c2은 %s, %d이며 크기는 (%d, %d)\n", c2.kind, c2.number, c2.width, c2.height);
	}

}

class Card{
	String kind;//인스턴스 맴버
	int number;
	static int width = 100;//스테틱 맴버
	static int height = 250;
}
