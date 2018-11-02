package com.score;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ScoreMain {

	ArrayList<Score> list;

	public ScoreMain() {
		list = new ArrayList<>();
	}

	public void callMenu(BufferedReader br) throws IOException, NumberFormatException{
		int menu;
		while(true) {
			System.out.println("1.성적입력 | 2.성적출력 | 3.종료");
			menu = Integer.parseInt(br.readLine());

			switch(menu) {
			case 1:
				input(br);
				break;
			case 2:
				output(list);
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("유효하지 않은 입력입니다");
			}
		}
	}

	public void input(BufferedReader br) throws IOException{
		Score score = new Score();
		System.out.print("이름입력: ");
		score.setName(br.readLine());
		System.out.print("국어성적입력: ");
		score.setKorean(Integer.parseInt(br.readLine().trim()));
		System.out.print("수학성적입력: ");
		score.setMath(Integer.parseInt(br.readLine().trim()));
		System.out.print("영어성적입력: ");
		score.setEnglish(Integer.parseInt(br.readLine().trim()));

		list.add(score);
	}

	public void output(ArrayList<Score> list) {
		System.out.println("이름    국어    수학    영어    총점    평균    등급");
		System.out.println("==========================");
		for(Score score: list) {
			System.out.print(score.toString());
		}
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt", true))){
			bw.write("이름    국어    수학    영어    총점    평균    등급");
			bw.newLine();
			bw.write("===============================");
			bw.newLine();
			for(Score score: list) {
				bw.write(score.toString());
			}
		}catch(Exception e) {}
	}

	public static void main(String[] args) {
		ScoreMain sm = new ScoreMain();
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			sm.callMenu(br);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
