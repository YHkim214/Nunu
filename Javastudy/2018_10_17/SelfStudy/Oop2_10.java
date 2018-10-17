
public class Oop2_10 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; //자손타입의 참조변수를 조상타입의 참조변수로  형변환 할때는 명시적 형변환이 필요없다.
//		car.water; Car타입의 참조변수로는 FireEngine 타입의 water 메소드를 호출할 수 없다. 
		fe2 = (FireEngine)car;
		fe2.water(); //참조변수의 타입이 변화하는 것이지, 인스턴스에는 아무런 영향도 미치지 못한다.

	}

}

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {
		System.out.println("stop!");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("water!!!");
	}
}
