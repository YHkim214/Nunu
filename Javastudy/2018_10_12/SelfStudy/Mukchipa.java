package SelfStudy01;

import java.util.*;

public class Mukchipa {
	public static void main(String[] args) {
		firstGame();
	}
	
	public static void firstGame(){
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		int match = 0, win = 0, draw = 0, lose = 0;
		while(true) {
			System.out.printf("����������! (1.���� 2.���� 3.�� 4.�׸��ϱ�)");
			int myHand = scanner.nextInt();
			int opHand = rand.nextInt(3) + 1;
			if(myHand == 4) break;
			match++;
			if(myHand > 4) {
				System.out.println("�ȵ��ض�");
			}else {
				if(myHand == opHand) {
					System.out.println("����!");
					draw++;
				}else if(myHand == 1) {
					if(opHand == 2) {
						System.out.println("����!");
						lose++;
					}else if(opHand == 3) {
						System.out.println("�̰��!");
						win++;
					}
				}else if(myHand == 2) {
					if(opHand == 1) {
						System.out.println("�̰��!");
						win++;
					}else if(opHand == 3) {
						System.out.println("����!");
						lose++;
					}
				}else if(myHand == 3) {
					if(opHand == 1) {
						System.out.println("����!");
						lose++;
					}else if(opHand == 2) {
						System.out.println("�̰��!");
						win++;
					}
				}
			}
		}
		scanner.close();
		System.out.println("������");
		System.out.printf("���� ����: %d�� %d�� %d�� %d��", match, win, draw, lose);
	}
}
