import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int korean = 0, english = 0, math = 0, sum = 0;
		char grade = 'F';
		float avg = 0.0f;
		
		do {
			System.out.print("���� ������ �Է����ּ���: ");
			korean = scanner.nextInt();
		} while(korean < 0 || korean > 100); //0���� 100������ ������ �Է��ؾ߸� �������� �� �ִ�
		do {
			System.out.print("���� ������ �Է����ּ���: ");
			english = scanner.nextInt();
		} while(english < 0 || english > 100);
		do {
			System.out.print("���� ������ �Է����ּ���: ");
			math = scanner.nextInt();
		} while(math < 0 || math > 100);
		
		sum = korean + english + math;
		avg = sum / 3.0f;
		
		switch((int)avg / 10) {
		case 10: case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		
		System.out.println();
		System.out.printf("����: %d\n", sum);
		System.out.printf("���: %.2f\n", avg);
		System.out.printf("���: %c����\n", grade);
		
		scanner.close();
	}
}
