
public class Oop5 {

	public static void main(String[] args) {
		System.out.printf("Card.width = %d\n", Card.width);//static�ɹ��� �ν��Ͻ��� �������� �ʾƵ� ȣ���Ҽ��ִ�,
		System.out.printf("Card.height = %d\n", Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.printf("c1�� %s, %d�̸� ũ��� (%d, %d)\n", c1.kind, c1.number, c1.width, c1.height);
		System.out.printf("c2�� %s, %d�̸� ũ��� (%d, %d)\n", c2.kind, c2.number, c2.width, c2.height);
		
		System.out.printf("c1�� ũ�⸦ ���� 50, 80���κ����մϴ�\n");
		c1.width = 50; 
		c1.height = 80;
		//static �ɹ��ǰ��� ��� �ν��Ͻ��� �����ϱ� ������ �ٲ�� ��� �ν��Ͻ��� ������ �ش� 
		System.out.printf("c1�� %s, %d�̸� ũ��� (%d, %d)\n", c1.kind, c1.number, c1.width, c1.height); 
		System.out.printf("c2�� %s, %d�̸� ũ��� (%d, %d)\n", c2.kind, c2.number, c2.width, c2.height);
	}

}

class Card{
	String kind;//�ν��Ͻ� �ɹ�
	int number;
	static int width = 100;//����ƽ �ɹ�
	static int height = 250;
}
