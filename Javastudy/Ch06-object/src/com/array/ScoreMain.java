package com.array;

public class ScoreMain {

	public static void main(String[] args) {
		
		Score[] scoreArray = new Score[4];
		int total = 0;
		int avg = 0;
		
		scoreArray[0] = new Score("ȫ�浿", 98, 96, 88);
		scoreArray[1] = new Score("�̼���", 97, 66, 87);
		scoreArray[2] = new Score("�念��", 96, 78, 67);
		scoreArray[3] = new Score("������", 95, 99, 65);
		
		for(Score s: scoreArray) {
			System.out.printf("%s\t", s.getName());
			System.out.printf("%d\t", s.getKorean());
			System.out.printf("%d\t", s.getEnglish());
			System.out.printf("%d\t", s.getMath());
			System.out.printf("%d\t", s.getSum());
			System.out.printf("%.1f\t", s.getAverage());
			System.out.printf("%s\n", s.getGrade());
			
			total += s.getSum();
		}
		
		avg = total / (scoreArray.length * 3);
		
		System.out.println("=========================");
		System.out.printf("��ü ���� �հ�: %d\n", total);
		System.out.printf("��ü ���� ���: %d", avg);
		
	}

}
