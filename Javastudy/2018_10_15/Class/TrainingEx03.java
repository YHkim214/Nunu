import java.util.*;

public class TrainingEx03 {
	public static void main(String[] args) {
		//�Է¹��� ����ó��
		int korean, english, math;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("���� ������ �Է��� �ּ���: ");
		korean = scanner.nextInt();
		System.out.printf("���� ������ �Է��� �ּ���: ");
		english = scanner.nextInt();
		System.out.printf("���� ������ �Է��� �ּ���: ");
		math = scanner.nextInt();

		int sum = korean + english + math;
		double avg = sum / 3.0;
		
		System.out.printf("����: %d\n",  korean);
		System.out.printf("����: %d\n",  english);
		System.out.printf("����: %d\n",  math);
		System.out.printf("����: %d\n",  sum);
		System.out.printf("���: %.2f",  avg);
		
		scanner.close();
	}
}
