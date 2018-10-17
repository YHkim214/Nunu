
public class Oop2_11 {

	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
//		fe = (FireEngine)car; 자손타입의 참조변수로 조상타입의 인스턴스를 참조하는것은 허용되지않는다.
		fe.drive();
		car2 = fe;
		car2.drive();

	}

}
