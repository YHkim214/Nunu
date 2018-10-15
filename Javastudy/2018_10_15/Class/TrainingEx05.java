import java.util.*;

public class TrainingEx05 {
	public static void main(String[] args) {
		//키보드에서 초를 입력받아서 시 분 초로 나타냄
		int second, minute, hour, rawSecond;
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("초 입력: ");
		rawSecond = scanner.nextInt();
		hour = rawSecond / 3600;
		minute = rawSecond % 3600 / 60;
		second = rawSecond % 60;
		
		System.out.printf("%d시간 %d분 %d초", hour, minute, second);
		
		scanner.close();
	}
}
