
public class Oop2_7 {

	public static void main(String[] args) {
		Card2 c = new Card2("Heart", 4);
		/*c.NUMBER = 5; ����� ���� �ٲ� �� ����*/
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);

	}

}

class Card2{
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Card2(String kind, int number){ //�����ڸ� �̿��ؼ� ������� �� �ѹ� �ʱ�ȭ �� �� �ִ�
		this.NUMBER = number;
		this.KIND = kind;
	}
	
	public String toString() {
		return "" + this.KIND + this.NUMBER + "";
	}
}
