package SelfStudy01;

import java.util.*;

public class ShoppingList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		String item = "";
		while(true) {
			System.out.printf("구매하실 항목을 입력하세요: ");
			item = scanner.nextLine();
			if(item.equals("quit")) { //(중요)equals와 ==의 차이 equals는 '내용'을비교. ==는 객체의 주소를 비교.
				break;
			}
			list.add(item);
		}
		scanner.close();
		System.out.println("장바구니 품목: ");
		for(String i:list) {
			System.out.printf("%s, ", i);
		}
	}

}
