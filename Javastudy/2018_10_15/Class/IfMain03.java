import java.util.*;

public class IfMain03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("정수하나입력: ");
		int num = scanner.nextInt();
		if(num > 0) {
			System.out.println("양수");
		}else if (num == 0) {
			System.out.println("0");
		}else if(num < 0) {
			System.out.println("음수");
		}
		
		scanner.close();
	}

}
