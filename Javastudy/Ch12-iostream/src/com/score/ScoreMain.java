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
			System.out.println("1.�����Է� | 2.������� | 3.����");
			menu = Integer.parseInt(br.readLine());

			switch(menu) {
			case 1:
				input(br);
				break;
			case 2:
				output(list);
				break;
			case 3:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("��ȿ���� ���� �Է��Դϴ�");
			}
		}
	}

	public void input(BufferedReader br) throws IOException{
		Score score = new Score();
		System.out.print("�̸��Է�: ");
		score.setName(br.readLine());
		System.out.print("������Է�: ");
		score.setKorean(Integer.parseInt(br.readLine().trim()));
		System.out.print("���м����Է�: ");
		score.setMath(Integer.parseInt(br.readLine().trim()));
		System.out.print("������Է�: ");
		score.setEnglish(Integer.parseInt(br.readLine().trim()));

		list.add(score);
	}

	public void output(ArrayList<Score> list) {
		System.out.println("�̸�    ����    ����    ����    ����    ���    ���");
		System.out.println("==========================");
		for(Score score: list) {
			System.out.print(score.toString());
		}
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt", true))){
			bw.write("�̸�    ����    ����    ����    ����    ���    ���");
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
