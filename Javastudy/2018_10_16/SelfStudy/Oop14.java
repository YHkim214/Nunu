class MyMath2{
	//static 메서드와 인스턴스 메서드의 차이
	long a, b;
	
	long add() { //인스턴스 변수를 이용해서 매개변수를 받을 필요가 없다.
		return a + b;
	}
	long subtract() {
		return a - b;
	}
	long multiply() {
		return a * b;
	}
	double divide() {
		return a / b;
	}
	
	static long add(long a, long b) { //인스턴스 변수를 사용하지 못하므로 매개변수를 받아야한다.
		return a + b;
	}
	static long subtract(long a, long b) {
		return a - b;
	}
	static long multiply(long a, long b) {
		return a * b;
	}
	static double divide(double a, double b) {
		return a / b;
	}
}

public class Oop14 {
	
	public static void main(String[] args) {
		System.out.println(MyMath2.add(200L, 100L)); //클래스 메서드 이므로 별도의 인스턴스를 만들 필요가없다.
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200L, 100L));
		
		MyMath2 mm = new MyMath2();
		mm.a = 200L;
		mm.b = 100L;
		
		System.out.println(mm.add()); //인스턴스 메서드는 인스턴스를 생성해야만 실행할수있다.
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());

	}

}
