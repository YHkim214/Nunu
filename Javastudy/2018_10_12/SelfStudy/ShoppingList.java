package SelfStudy01;

import java.util.*;

public class ShoppingList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		String item = "";
		while(true) {
			System.out.printf("�����Ͻ� �׸��� �Է��ϼ���: ");
			item = scanner.nextLine();
			if(item.equals("quit")) { //(�߿�)equals�� ==�� ���� equals�� '����'����. ==�� ��ü�� �ּҸ� ��.
				break;
			}
			list.add(item);
		}
		scanner.close();
		System.out.println("��ٱ��� ǰ��: ");
		for(String i:list) {
			System.out.printf("%s, ", i);
		}
	}

}
