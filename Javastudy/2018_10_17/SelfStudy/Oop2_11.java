
public class Oop2_11 {

	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
//		fe = (FireEngine)car; �ڼ�Ÿ���� ���������� ����Ÿ���� �ν��Ͻ��� �����ϴ°��� �������ʴ´�.
		fe.drive();
		car2 = fe;
		car2.drive();

	}

}
