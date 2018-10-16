
public class Oop9 {

	public static void main(String[] args) {
			//참조형 매개변수
			Data d = new Data();
			d.x = 10;
			
			System.out.println("main() : x = " + d.x);
			change(d);
			System.out.println("After change");
			System.out.println("main() : x = " + d.x);//참조형 매개변수는 값이 저장된 주소를 넘겨주는 것이기 때문에, 값을 읽어오는 것도, 변경하는것도 가능하다.

		}

		static void change(Data d) { //참조형 매개변수를 인자로 받아 저장된 값을 바꾸는 메소드
			d.x = 1000;
			System.out.println("change() : x = " + d.x);
		}


}
