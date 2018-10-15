import java.util.*;

public class SwitchMain04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("첫번째 숫자: ");
		int a = scanner.nextInt();
		System.out.printf("연산자: ");
		String operator = scanner.next();
		System.out.printf("두번째 숫자: ");
		int b = scanner.nextInt();
	    
		int result = 0;
		
		switch(operator) {
		case "+":
			result = a + b;
			break;
		case "-":
			result = a - b;
			break;
		case "*":
			result = a * b;
			break;
		case "/":
			if(b != 0) {
				result = a / b;
				break;
			}else {
				System.out.println("0으로 나눌 수 없습니다");
				System.exit(0);
			}
		case "%":
			if(b != 0) {
				result = a / b;
				break;
			}else {
				System.out.println("0으로 나눌 수 없습니다");
				System.exit(0);
			}
		default:
			System.out.println("잘못된 연산자 입력");
			System.exit(0);//프로그램종료
		}
		
		System.out.println();
		System.out.printf("%d %s %d = %d", a, operator, b, result);
		
		scanner.close();
	}

}
