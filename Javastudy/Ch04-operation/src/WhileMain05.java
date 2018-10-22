import java.util.Scanner;

public class WhileMain05 {

	public static void main(String[] args) {
		//while문에서 break 활용
		Scanner scanner = new Scanner(System.in);
		
		int a = 0, total = 0;
		
		System.out.println("0전까지 입력받은 정수로 합 구하기");
		
		while(true){
			
			System.out.print("누적할 숫자입력: ");
			a = scanner.nextInt();
			if(a == 0) break;
			total += a;
			
		}
		
		System.out.printf("정수의 총합: %d", total);
		scanner.close();
	}

}
