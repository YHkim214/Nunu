import java.util.*;

public class TrainingEx03 {
	public static void main(String[] args) {
		//입력받은 성적처리
		int korean, english, math;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("국어 점수를 입력해 주세요: ");
		korean = scanner.nextInt();
		System.out.printf("영어 점수를 입력해 주세요: ");
		english = scanner.nextInt();
		System.out.printf("수학 점수를 입력해 주세요: ");
		math = scanner.nextInt();

		int sum = korean + english + math;
		double avg = sum / 3.0;
		
		System.out.printf("국어: %d\n",  korean);
		System.out.printf("영어: %d\n",  english);
		System.out.printf("수학: %d\n",  math);
		System.out.printf("총점: %d\n",  sum);
		System.out.printf("평균: %.2f",  avg);
		
		scanner.close();
	}
}
