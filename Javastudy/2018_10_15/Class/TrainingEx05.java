import java.util.*;

public class TrainingEx05 {
	public static void main(String[] args) {
		//Ű���忡�� �ʸ� �Է¹޾Ƽ� �� �� �ʷ� ��Ÿ��
		int second, minute, hour, rawSecond;
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("�� �Է�: ");
		rawSecond = scanner.nextInt();
		hour = rawSecond / 3600;
		minute = rawSecond % 3600 / 60;
		second = rawSecond % 60;
		
		System.out.printf("%d�ð� %d�� %d��", hour, minute, second);
		
		scanner.close();
	}
}
