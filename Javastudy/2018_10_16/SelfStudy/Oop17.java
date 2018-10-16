
public class Oop17 {

	public static void main(String[] args) {
		//생성자, 생성자에서 다른 생성자를 호출하는 법, 생성자를 이용한 인스턴스의 복사
		
		Car c1 = new Car();
		Car c2 = new Car("blue");
		
		System.out.println("c1의 color=" + c1.color+", gearType= " + c1.gearType + ", door= " + c1.door);
		System.out.println("c2의 color=" + c2.color+", gearType= " + c2.gearType + ", door= " + c2.door);
		
		Car c3 = new Car();
		Car c4 = new Car(c3);
		
		System.out.println("c3의 color=" + c3.color+", gearType= " + c3.gearType + ", door= " + c3.door);
		System.out.println("c4의 color=" + c4.color+", gearType= " + c4.gearType + ", door= " + c4.door);
		
		c3.door = 100;
		
		System.out.println("c3.door = 100 수행 후");
		
		System.out.println("c3의 color=" + c3.color+", gearType= " + c3.gearType + ", door= " + c3.door);
		System.out.println("c4의 color=" + c4.color+", gearType= " + c4.gearType + ", door= " + c4.door);

	}

}

class Car{
	String color;
	String gearType;
	int door;
	
	Car() {
		this("blue", "auto", 4);
	}
	
	Car(String color){
		this(color, "auto", 4);
	}
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	Car(Car c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
}
