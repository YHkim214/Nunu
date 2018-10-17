import java.util.*;

public class OpTrainingEx05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int price = 300;
		int content_coffee = 5; //Ŀ�� ������ Ŀ�Ǿ�
		int content_cream = 3;
		int content_sugar = 1;
		int stock_coffee = 10;
		int stock_cream = 10;
		int stock_sugar = 10;
		
		int amount = 0;
		int coin = 1000;
		
		while(true) {
			System.out.println("============================");
			System.out.print("1. Ŀ�Ǳ��� | 2.���� | 3.�������г�\n");
			System.out.println("============================");
			int menu = scanner.nextInt();
			if(menu == 1) {
				
				System.out.printf("���� �־��ּ���(Ŀ�ǰ� 300��): ");
				int pay = scanner.nextInt();
				
				while(price > pay) {
					System.out.print("������ �ݾ��� ���ڶ��ϴ�. ���� �� �־� �ּ���: ");
					int addPay = scanner.nextInt();
					pay += addPay;
				}
				
				int balance = pay - price;
				
				if(balance > coin || coin <= 0) {
					System.out.println("�Ž������� ���ڶ��ϴ�. �����ڿ��� �����ϼ���.");
					continue;
				} else if(stock_coffee < content_coffee) {
					System.out.println("Ŀ�ǰ� ���ڶ��ϴ�. �����ڿ��� �����ϼ���.");
					continue;
				} else if(stock_cream < content_cream) {
					System.out.println("������ ���ڶ��ϴ�. �����ڿ��� �����ϼ���.");
					continue;
				} else if(stock_sugar < content_sugar) {
					System.out.println("������ ���ڶ��ϴ�. �����ڿ��� �����ϼ���.");
					continue;
				}
				
				stock_coffee -= content_coffee;
				stock_cream -= content_cream;
				stock_sugar -= content_sugar;
				coin -= balance;
				amount += pay;
				
				System.out.printf("�̿����ּż� �����մϴ�. �Ž��� ��: %d\n", balance);
				
				/*System.out.println("===���� ���Ǳ� ����===");
				System.out.printf("Ŀ�Ƿ�: %d\n", stock_coffee);
				System.out.printf("ũ����: %d\n", stock_cream);
				System.out.printf("������: %d\n", stock_sugar);
				System.out.printf("���� �����ݾ�: %d\n", coin);
				System.out.printf("���� �ݾ�: %d\n", amount);
				System.out.println("=============");*/
				
			}else if(menu == 2) {
				
				System.out.println("�ȳ�~ �� �Ϳ�.");
				break;
				
			}else if(menu == 3) {
				
				System.out.print("������ �н����带 �Է����ּ���: ");
				int password = scanner.nextInt();
				if(password == 1234) {
					while(true) {
						
						System.out.println("==================================");
						System.out.print("1. ���纸�� | 2.Ŀ�Ǻ������� | 3.���ư���\n");
						System.out.println("==================================");
						int dev_menu = scanner.nextInt();
						
						if(dev_menu == 1) {
							
							System.out.print("������ ���縦 �����ϼ���(1. Ŀ�� | 2.ũ��| 3.����): ");
							int sup_menu = scanner.nextInt();
							System.out.print("������ ������ �Է��ϼ���: ");
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
					
					System.out.println("�� Ʋ�Ⱦ� ���ư�");
					continue;
				}
				
			}else {
				
				System.out.println("�߸��Է��߽��ϴ�.");
			}
		}
		
		scanner.close();

	}

}
