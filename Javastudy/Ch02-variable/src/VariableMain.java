
public class VariableMain {

	public static void main(String[] args) {
	
		//변수: 값을 저장할 수 있는 메모리공간
		int num = 17; //변수의 선언과 초기화
		
		System.out.println("first num: " + num);
		
		num = 20;//변수에 다른 값 대입
		
		System.out.println("second num: " + num);
		
		//변수의 식별자는 같은 스코프 안에서 겹치면 안된다.
		
		int a = 10, b = 20, result = a + b; //다른 변수 선언방법
		
		System.out.println("sum of a and b: " + result); //변수끼리의 덧셈
		System.out.println("sum of a and b: " + 10 + 20);
		System.out.println("sum of a and b: " + (a + b));

	}

}