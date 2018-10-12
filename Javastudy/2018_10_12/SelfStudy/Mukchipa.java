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
			System.out.printf("가위바위보! (1.가위 2.바위 3.보 4.그만하기)");
			int myHand = scanner.nextInt();
			int opHand = rand.nextInt(3) + 1;
			if(myHand == 4) break;
			match++;
			if(myHand > 4) {
				System.out.println("똑디해라");
			}else {
				if(myHand == opHand) {
					System.out.println("비겻다!");
					draw++;
				}else if(myHand == 1) {
					if(opHand == 2) {
						System.out.println("졌다!");
						lose++;
					}else if(opHand == 3) {
						System.out.println("이겻다!");
						win++;
					}
				}else if(myHand == 2) {
					if(opHand == 1) {
						System.out.println("이겼다!");
						win++;
					}else if(opHand == 3) {
						System.out.println("졌다!");
						lose++;
					}
				}else if(myHand == 3) {
					if(opHand == 1) {
						System.out.println("졌다!");
						lose++;
					}else if(opHand == 2) {
						System.out.println("이겻다!");
						win++;
					}
				}
			}
		}
		scanner.close();
		System.out.println("ㅅㄱ링");
		System.out.printf("너의 전적: %d전 %d승 %d무 %d패", match, win, draw, lose);
	}
}
