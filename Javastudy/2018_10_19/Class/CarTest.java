class Car2{
	
	int oil;
	int water;
	boolean isRun;
	
	public void run() {
		isRun = true;
	}
	
	public void stop() {
		isRun = false;
	}
	
	public void speedUp(){
		if(oil < 10) {
			System.out.println("�⸧�� �����մϴ�");
			return;
		}
		oil -= 10;
	}
	
}

public class CarTest {
	public static void main(String[] args) {
		
		Car2 c2 = new Car2();
		
		c2.oil = 100;
		c2.water = 100;
		
		System.out.println("�⸧��: " + c2.oil);
		System.out.println("����: " + c2.water);
		
		c2.run();
		
		System.out.println("���� ����: " + c2.isRun);
		
		c2.speedUp();
		
		System.out.println("���� �⸧��: " + c2.oil);
		
		c2.stop();
		
		System.out.println("���� ����: " + c2.isRun);
		
	}
}
