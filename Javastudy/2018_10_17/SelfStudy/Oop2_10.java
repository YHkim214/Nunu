
public class Oop2_10 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; //�ڼ�Ÿ���� ���������� ����Ÿ���� ����������  ����ȯ �Ҷ��� ����� ����ȯ�� �ʿ����.
//		car.water; CarŸ���� ���������δ� FireEngine Ÿ���� water �޼ҵ带 ȣ���� �� ����. 
		fe2 = (FireEngine)car;
		fe2.water(); //���������� Ÿ���� ��ȭ�ϴ� ������, �ν��Ͻ����� �ƹ��� ���⵵ ��ġ�� ���Ѵ�.

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
