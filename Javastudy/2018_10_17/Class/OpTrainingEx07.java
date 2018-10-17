import java.util.*;

public class OpTrainingEx07 {

	public static void main(String[] args) {
		
		int price = 3500;
		int quantity, payment, total, change, tax;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("카페모카 잔 수: ");
		quantity = scanner.nextInt();
		System.out.print("지불할 액수: ");
		payment = scanner.nextInt();
		
		tax = (price * quantity) * 10 / 100;
		total = (price * quantity) + tax;
		change = payment - total;
		
		System.out.println("[출력내용] ");
		System.out.printf("지불한 돈: %d\n", payment);
		System.out.printf("카페 모카 단가: %d\n", price);
		System.out.printf("수량: %d\n", quantity);
		System.out.printf("부가세: %d\n", tax);
		System.out.printf("상품 총액: %d\n", total);
		System.out.printf("거스름돈 : %d", change);
		
		scanner.close();
	}

}
