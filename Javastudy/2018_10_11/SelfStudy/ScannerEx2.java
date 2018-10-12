import java.util.*;

public class ScannerEx2 {

	public static void main(String[] args) {
		System.out.println("정수를 하나 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		int num = Integer.parseInt(tmp);
		
		if(num == 0) {
			System.out.println("입력하신숫자는 0 입니다");
		}
		else {
			System.out.println("입력하신숫자는 0이 아닙니다");
			System.out.printf("입력하신숫자는 %d입니다", num);
		}
		
		scanner.close();
	}

}
