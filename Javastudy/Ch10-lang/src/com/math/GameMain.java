package com.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameMain {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] pool = {"가위", "바위", "보"};
		int me = 0;
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		while(true) {
			try {
				System.out.println("[입력하세요]");
				System.out.println("1.가위 | 2.바위| 3.보| 4.종료");

				me = Integer.parseInt(br.readLine());
				if(me == 4) {
					System.out.println("종료합니다.");
					System.out.println("당신의 전적: " + win + "승 " + lose + "패 " + draw + "무");
					break;
				}
				int com = (int)(Math.random() * 3) + 1;
				
				switch(me - com) {
				case 0:
					System.out.println("컴퓨터: " + pool[com-1] + ", 유저: " + pool[me-1] + "=> 무승부!");
					draw++;
					break;
				case -2: case 1:
					System.out.println("컴퓨터: " + pool[com-1] + ", 유저: " + pool[me-1] + "=> 유저 승!");
					win++;
					break;
				case -1: case 2:
					System.out.println("컴퓨터: " + pool[com-1] + ", 유저: " + pool[me-1] + "=> 컴퓨터 승!");
					lose++;
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("유효하지 않은 입력입니다");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("유효하지 않은 입력입니다");
			} catch (IOException e) {}
		}
		
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}