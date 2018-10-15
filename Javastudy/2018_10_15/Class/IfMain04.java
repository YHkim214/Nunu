import java.util.*;

public class IfMain04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("성적을 입력하세요: ");
		int score = scanner.nextInt();
		char grade = ' ';
		
		if(score > 100 || score < 0) {
			grade = '?';
		}else if(score >= 90 && score <= 100) {
			grade = 'A';
		}else if(score >= 80) {
			grade = 'B';
		}else if(score >= 70) {
			grade = 'C';
		}else if(score >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.printf("당신의 등급은 %c 입니다.", grade);
		
		scanner.close();
	}

}
