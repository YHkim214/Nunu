import java.util.Scanner;

public class OpTrainingEx04 {
	public static void main(String[] args) {
		//커피값 4,000원 입니다. 마실커피 수량을 입력하고 돈을 지불하세요.
		//지불한 돈에서 발생한 거스름돈을 출력
		//돈이 모자라 못살경우 "금액이 모자랍니다"라고 알려준후 다시 지불하게
		
		Scanner scanner = new Scanner(System.in);
		
		int coffee = 4000;
		int payment, quantity, balance, total;
		
		System.out.print("구매수량 입력: ");
		quantity = scanner.nextInt();
		
		while(true) {
			System.out.print("내가 내는 돈: ");
			payment = scanner.nextInt();
			total = coffee * quantity;
			balance = payment - total;
			
			if(balance < 0) {
				System.out.printf("금액이 %d원 모자랍니다\n", -balance);
				continue;
			}else {
				break;
			}
		}
		
		System.out.printf("거스름 돈: %,d원", balance);
		scanner.close();
	}
}
