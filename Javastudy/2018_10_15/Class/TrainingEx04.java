import java.util.*;

public class TrainingEx04 {

	public static void main(String[] args) {
		
		//a전자 대리점은 총금액의 15%를 할인해주기로함 상품과 상품의 단가와 수량을 입력받아 최종금액출력, 소수점 버리기.
		
		String product;
		int price, quantity, netPrice, discountedPrice;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("상품명을 입력해 주세요: ");
		product = scanner.nextLine();
		System.out.printf("단가를 입력해 주세요: ");
		price = scanner.nextInt();
		System.out.printf("수량을 입력해 주세요: ");
		quantity = scanner.nextInt();
		
		netPrice = price * quantity;
		discountedPrice = (int)(netPrice * 0.85);
		
		System.out.printf("%s %d대의 가격은: %,d원", product, quantity, discountedPrice);
		
		scanner.close();
	}

}
