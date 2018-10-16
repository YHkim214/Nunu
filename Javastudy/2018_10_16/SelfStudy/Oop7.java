
public class Oop7 {

	public static void main(String[] args) {
		//메소드 호출 순서
		System.out.println("main(String[] args)가 시작되었음");
		firstMethod();	
		System.out.println("main(String[] args)가 끝났음");
	}
	
	static void firstMethod(){
		System.out.println("firstMethod가 시작되었음");
		secondMethod();
		System.out.println("firstMethod가 끝났음");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod가 시작되었음");
		System.out.println("secondMethod가 끝났음");
	}

}
