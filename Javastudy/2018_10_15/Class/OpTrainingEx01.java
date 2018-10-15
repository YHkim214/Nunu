import java.util.*;

public class OpTrainingEx01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("정수하나 입력: ");
		int num = scanner.nextInt();
		
		if(num < 0) num = -num;
		
		System.out.printf("절대값은 %d이다.", num);
		scanner.close();
	}
}
