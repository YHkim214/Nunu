import java.util.Scanner;

public class OpTrainingEx03 {
	public static void main(String[] args) {
		//�ΰ��� ������ �Է��ϰ� ������(+, -, *, /, %)�� ���ؼ� �����ϴ� ���α׷� �ۼ�
		//����üũ�� if������
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("ù��° ����: ");
		int a = scanner.nextInt();
		System.out.printf("������: ");
		String operator = scanner.next();
		System.out.printf("�ι�° ����: ");
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
				System.out.println("0���� ���� �� �����ϴ�");
				System.exit(0);
			}
		}else if(operator.equals("%")) {
			if(b != 0) {
				result = a % b;
			}else {
				System.out.println("0���� ���� �� �����ϴ�");
				System.exit(0);
			}
		}else {
			System.out.println("�߸��� ������ �Է�");
			System.exit(0);
		}
		
		System.out.println();
		System.out.printf("%d %s %d = %d", a, operator, b, result);
		
		scanner.close();
	}
}
