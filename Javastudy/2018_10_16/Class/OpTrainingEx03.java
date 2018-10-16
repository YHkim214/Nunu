import java.util.Scanner;

public class OpTrainingEx03 {
	public static void main(String[] args) {
		//두개의 정수를 입력하고 연산자(+, -, *, /, %)를 정해서 연산하는 프로그램 작성
		//조건체크는 if문으로
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("첫번째 숫자: ");
		int a = scanner.nextInt();
		System.out.printf("연산자: ");
		String operator = scanner.next();
		System.out.printf("두번째 숫자: ");
		int b = scanner.nextInt();
	    
		int result = 0;
		
		if(operator.equals("+")) {
			result = a + b;
		}else if(operator.equals("-")) {
			result = a - b;
		}else if(operator.equals("*")) {
			result = a * b;
		}else if(operator.equals("/")) {
			if(b != 0) {
				result = a / b;
			}else {
				System.out.println("0으로 나눌 수 없습니다");
				System.exit(0);
			}
		}else if(operator.equals("%")) {
			if(b != 0) {
				result = a % b;
			}else {
				System.out.println("0으로 나눌 수 없습니다");
				System.exit(0);
			}
		}else {
			System.out.println("잘못된 연산자 입력");
			System.exit(0);
		}
		
		System.out.println();
		System.out.printf("%d %s %d = %d", a, operator, b, result);
		
		scanner.close();
	}
}
