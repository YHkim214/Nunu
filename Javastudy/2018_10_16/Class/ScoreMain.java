import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int korean = 0, english = 0, math = 0, sum = 0;
		char grade = 'F';
		float avg = 0.0f;
		
		do {
			System.out.print("국어 성적을 입력해주세요: ");
			korean = scanner.nextInt();
		} while(korean < 0 || korean > 100); //0에서 100사이의 정수를 입력해야만 빠져나올 수 있다
		do {
			System.out.print("영어 성적을 입력해주세요: ");
			english = scanner.nextInt();
		} while(english < 0 || english > 100);
		do {
			System.out.print("수학 성적을 입력해주세요: ");
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
		System.out.printf("총점: %d\n", sum);
		System.out.printf("평균: %.2f\n", avg);
		System.out.printf("등급: %c학점\n", grade);
		
		scanner.close();
	}
}
