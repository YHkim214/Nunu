public class BusMain {
	String color = "White";
	int size = 10;
	
	public static void main(String[] args) { //static 메서드이기 때문에 객체생성없이 인스턴스맴버를 사용할수없다.
//		System.out.println(color);
//		System.out.println(size);
		
		BusMain b = new BusMain();
		
		System.out.println(b.color);
		System.out.println(b.size);

	}

}