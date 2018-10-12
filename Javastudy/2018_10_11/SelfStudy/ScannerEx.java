import java.util.*;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("2자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.printf("니가 입력한 정수는 %d 입니다.", num);
		
		scanner.close();
	}

}
