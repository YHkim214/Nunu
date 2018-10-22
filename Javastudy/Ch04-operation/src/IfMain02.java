import java.util.*;

public class IfMain02 {

	public static void main(String[] args) {	
		//홀짝구분
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("숫자를 하나 입력해보거라: ");
		int num = scanner.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		
		scanner.close();
	}

}
