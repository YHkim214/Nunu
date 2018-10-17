
public class Oop2_7 {

	public static void main(String[] args) {
		Card2 c = new Card2("Heart", 4);
		/*c.NUMBER = 5; 상수의 값은 바꿀 수 없다*/
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
	
	Card2(String kind, int number){ //생성자를 이용해서 상수값을 단 한번 초기화 할 수 있다
		this.NUMBER = number;
		this.KIND = kind;
	}
	
	public String toString() {
		return "" + this.KIND + this.NUMBER + "";
	}
}
