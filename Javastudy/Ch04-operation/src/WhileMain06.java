import java.util.Scanner;

public class WhileMain06 {

	public static void main(String[] args) {
		//유사은행 코드
		Scanner scanner = new Scanner(System.in);
		int balance = 0;
		
		while(true) {
			System.out.println("=============================");
			System.out.println("1.예금 | 2.출금 | 3.잔고확인 | 4.종료");
			System.out.println("=============================");
			System.out.print("선택 >>");
			
			int menu = scanner.nextInt();
			if(menu == 1) {
				System.out.print("예금액을 입력하세요: ");
				int add = scanner.nextInt();
				balance += add;
			}else if(menu == 2) {
				System.out.print("출금액을 입력하세요: ");
				int draw = scanner.nextInt();
				while(draw > balance) {
					System.out.printf("잔고가 부족합니다.(현재 잔고: %,d원)\n", balance);
					System.out.print("출금액을 입력하세요: ");
					draw = scanner.nextInt();
				}
				balance -= draw;
			}else if(menu == 3) {
				System.out.printf("현재 잔고: %,d원\n", balance);
			}else if(menu == 4) {
				System.out.println("프로그램을 종료합니다");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다");
				continue;
			}
			
		}
		
		scanner.close();
	}

}
