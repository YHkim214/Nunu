import java.util.*;

public class ScannerEx3 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("����� ���������� �Է��ϼ���: ");
		score = scanner.nextInt();
		if(score >= 90 && score <= 100) {
			grade = 'A';
		}else if(score >= 80 && score < 90) {
			grade = 'B';
		}else if(score >= 70 && score < 80) {
			grade = 'C';
		}else {
			grade = 'F';
		}
		System.out.printf("����� ������ %c �Դϴ�.", grade);
		
		scanner.close();
	}
}
