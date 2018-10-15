import java.util.*;

public class SwitchMain04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("ù��° ����: ");
		int a = scanner.nextInt();
		System.out.printf("������: ");
		String operator = scanner.next();
		System.out.printf("�ι�° ����: ");
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
				System.out.println("0���� ���� �� �����ϴ�");
				System.exit(0);
			}
		case "%":
			if(b != 0) {
				result = a / b;
				break;
			}else {
				System.out.println("0���� ���� �� �����ϴ�");
				System.exit(0);
			}
		default:
			System.out.println("�߸��� ������ �Է�");
			System.exit(0);//���α׷�����
		}
		
		System.out.println();
		System.out.printf("%d %s %d = %d", a, operator, b, result);
		
		scanner.close();
	}

}
