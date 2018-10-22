import java.util.*;

public class ArrayMain04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] subname = {"국어", "영어", "수학"};
		int[] score = new int[subname.length];
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			do{
				System.out.printf("%s성적을 입력하시오: ", subname[i]);
				score[i] = scanner.nextInt();
			}while(score[i] < 0 || score[i] > 100);
			sum += score[i];
		}
		
		float avg = (float)sum / subname.length;
		
		System.out.println();
		
		for(int i = 0; i < subname.length; i++) {
			System.out.printf("%s = %d\n", subname[i], score[i]);
		}
		
		System.out.printf("총점 = %d\n", sum);
		System.out.printf("평균 = %.2f\n", avg);
		
		scanner.close();
		
	}

}
