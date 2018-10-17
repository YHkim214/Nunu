import java.util.*;

public class OpTrainingEx05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int price = 300;
		int content_coffee = 5; //커피 한잔의 커피양
		int content_cream = 3;
		int content_sugar = 1;
		int stock_coffee = 10;
		int stock_cream = 10;
		int stock_sugar = 10;
		
		int amount = 0;
		int coin = 1000;
		
		while(true) {
			System.out.println("============================");
			System.out.print("1. 커피구매 | 2.종료 | 3.관리자패널\n");
			System.out.println("============================");
			int menu = scanner.nextInt();
			if(menu == 1) {
				
				System.out.printf("돈을 넣어주세요(커피값 300원): ");
				int pay = scanner.nextInt();
				
				while(price > pay) {
					System.out.print("투입한 금액이 모자랍니다. 돈을 더 넣어 주세요: ");
					int addPay = scanner.nextInt();
					pay += addPay;
				}
				
				int balance = pay - price;
				
				if(balance > coin || coin <= 0) {
					System.out.println("거스름돈이 모자랍니다. 관리자에게 문의하세요.");
					continue;
				} else if(stock_coffee < content_coffee) {
					System.out.println("커피가 모자랍니다. 관리자에게 문의하세요.");
					continue;
				} else if(stock_cream < content_cream) {
					System.out.println("프림이 모자랍니다. 관리자에게 문의하세요.");
					continue;
				} else if(stock_sugar < content_sugar) {
					System.out.println("설탕이 모자랍니다. 관리자에게 문의하세요.");
					continue;
				}
				
				stock_coffee -= content_coffee;
				stock_cream -= content_cream;
				stock_sugar -= content_sugar;
				coin -= balance;
				amount += pay;
				
				System.out.printf("이용해주셔서 감사합니다. 거스름 돈: %d\n", balance);
				
				/*System.out.println("===현재 자판기 정보===");
				System.out.printf("커피량: %d\n", stock_coffee);
				System.out.printf("크림량: %d\n", stock_cream);
				System.out.printf("설탕량: %d\n", stock_sugar);
				System.out.printf("동전 보유금액: %d\n", coin);
				System.out.printf("보유 금액: %d\n", amount);
				System.out.println("=============");*/
				
			}else if(menu == 2) {
				
				System.out.println("안녕~ 또 와요.");
				break;
				
			}else if(menu == 3) {
				
				System.out.print("관리자 패스워드를 입력해주세요: ");
				int password = scanner.nextInt();
				if(password == 1234) {
					while(true) {
						
						System.out.println("==================================");
						System.out.print("1. 자재보충 | 2.커피비율변경 | 3.돌아가기\n");
						System.out.println("==================================");
						int dev_menu = scanner.nextInt();
						
						if(dev_menu == 1) {
							
							System.out.print("보충할 자재를 선택하세요(1. 커피 | 2.크림| 3.설탕): ");
							int sup_menu = scanner.nextInt();
							System.out.print("보충할 수량을 입력하세요: ");
							int sup_number = scanner.nextInt();
							
							if(sup_menu == 1) {
								stock_coffee += sup_number;
							}else if(sup_menu == 2) {
								stock_cream += sup_number;
							}else if(sup_menu == 3) {
								stock_sugar += sup_number;
							}
							
							continue;
							
						}else if(dev_menu == 2) {
							continue;
						}else if(dev_menu == 3) {
							break;
						}
					}
				} else {
					
					System.out.println("응 틀렸어 돌아가");
					continue;
				}
				
			}else {
				
				System.out.println("잘못입력했습니다.");
			}
		}
		
		scanner.close();

	}

}
