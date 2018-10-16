
public class Oop10 {

	public static void main(String[] args) {
		//참조형 반환타입
		Data d = new Data();
		d.x = 10;
		
		Data d2 = copy(d);
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
	}
	
	static Data copy(Data d) { //객체를 복사하여 반환하는 메소드
		Data tmp = new Data();
		tmp.x = d.x;
		return tmp; //입력받은 참조변수의 값을 복사하여 새로운 객체를 만들고 반환한다. 리턴타입은 Data.
	}

}
