
public class Oop11 {

	public static void main(String[] args) {
		//재귀호출을 통한 팩토리얼 구하기
		int result = factorial(4);
		
		System.out.println(result);

	}
	
	static int factorial(int n) { //팩토리얼 메소드 안에서 다시 팩토리얼 메소드를 호출한다. 이걸 재귀호출이라고 한다.
		if(n == 1) return 1;
		return n * factorial(n-1);
	}

}
