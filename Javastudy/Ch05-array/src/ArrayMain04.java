import java.util.*;

public class ArrayMain04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] subname = {"����", "����", "����"};
		int[] score = new int[subname.length];
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			do{
				System.out.printf("%s������ �Է��Ͻÿ�: ", subname[i]);
				score[i] = scanner.nextInt();
			}while(score[i] < 0 || score[i] > 100);
			sum += score[i];
		}
		
		float avg = (float)sum / subname.length;
		
		System.out.println();
		
		for(int i = 0; i < subname.length; i++) {
			System.out.printf("%s = %d\n", subname[i], score[i]);
		}
		
		System.out.printf("���� = %d\n", sum);
		System.out.printf("��� = %.2f\n", avg);
		
		scanner.close();
		
	}

}
