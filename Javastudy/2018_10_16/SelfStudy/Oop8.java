
public class Oop8 {

	public static void main(String[] args) {
		// 기본형 매개변수
		Data d = new Data();
		d.x = 10;
		
		System.out.println("main() : x = " + d.x);
		change(d.x);
		System.out.println("After change");
		System.out.println("main() : x = " + d.x);//기본형 매개변수는 값만 읽어올수 있을뿐 값을 변경할수는 없다.

	}

	static void change(int x) { //입력받은 x의 값을 바꾸는 메소드
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}

class Data { int x;} //int x를 맴버변수로 가지는 클래스