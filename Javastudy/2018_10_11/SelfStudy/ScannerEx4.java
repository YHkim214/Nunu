import java.util.Scanner;

public class ScannerEx4 {
	public static void main(String[] args) {
		int score = 0;
		String grade = " ";
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("����� ���������� �Է��ϼ���: ");
		score = scanner.nextInt();
		if(score >= 90 && score <= 100) {
			grade = "A";
			if(score >= 98) {
				grade += '+';
			}
		}else if(score >= 80 && score < 90) {
			grade = "B";
			if(score >= 88) {
				grade += '+';
			}
		}else if(score >= 70 && score < 80) {
			grade = "C";
			if(score >= 78) {
				grade += '+';
			}
		}else {
			grade = "D";
		}
		System.out.printf("����� ������ %s �Դϴ�.", grade);
		
		scanner.close();
	}
}
