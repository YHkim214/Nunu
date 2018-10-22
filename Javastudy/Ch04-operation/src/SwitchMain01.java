import java.util.*;

public class SwitchMain01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("정수형숫자 입력: ");
		int num = scanner.nextInt();
		
		switch(num) { //long을 제외한 정수형+문자+문자열가능
			case 1:
				System.out.println("1 입력");
				break;//switch 블럭을 빠져나감
			case 2:
				System.out.println("2 입력");
				break;
			case 3:
				System.out.println("3 입력");
				break;
			default:
				System.out.println("1,2,3이 아닌 정수 입력");
		
		}
		scanner.close();
	}

}
