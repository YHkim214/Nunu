package com.score;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map.Entry;

public class Score {
	private String name;
	private int korean;
	private int english;
	private int math;
	static BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
	
	public Score() {
		try {
			do{
				System.out.print("이름 입력: ");
				this.name = s.readLine();
			}while(name.equals(""));
			
			do{
				System.out.print("국어 성적: ");
				this.korean = Integer.parseInt(s.readLine());
			}while(korean < 0 || korean > 100);
			
			do{
				System.out.print("영어 성적: ");
				this.english = Integer.parseInt(s.readLine());
			}while(english < 0 || english > 100);
			
			do{
				System.out.print("수학 성적: ");
				this.math = Integer.parseInt(s.readLine());
			}while(math < 0 || math > 100);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public static void entry() throws NumberFormatException, IOException {
		int menu = 0;
		HashMap<String, Score> map = new HashMap<String, Score>();
		Score sc = null;
		do {
			System.out.println("1.성적입력 | 2.성적보기| 3.종료");
			menu = Integer.parseInt(s.readLine());
			switch(menu) {
			case 1:
				sc = new Score();
				map.put(sc.name, sc);
				break;
			case 2:
				System.out.print("누구의 점수를 보겠습니까?");
				String stu = s.readLine();
				
				if(!map.keySet().contains(stu)) {
					System.out.println("검색결과가 없습니다");
					break;
				}
			
				Set<Entry<String, Score>> set = map.entrySet();
				Iterator<Entry<String, Score>> it = set.iterator();
				
				while(it.hasNext()) {
					Map.Entry<String, Score> e = (Map.Entry<String, Score>)it.next();
					if(e.getKey().equals(stu)) {
						e.getValue().printScore();
						break;
					}
				}
				break;
			case 3:
				System.out.println("프로그램을 종료합니다");
				return;
			default:
				System.out.println("유효하지 않은 입력입니다");
				continue;
			}
		} while(true);
	}
	
	
	public int getSum() {
		return korean + english + math;
	}
	public double getAverage() {
		return (double)getSum() / 3;
	}
	public String getGrade() {
		switch((int)getAverage() / 10) {
		case 10: case 9:
			return "A";
		case 8: 
			return "B";
		case 7: 
			return "C";
		case 6: 
			return "D";
		default:
			return "F";
		}
	}
	public void printScore() {
		System.out.println("이름: " + name);
		System.out.println("국어: " + korean);
		System.out.println("영어: " + english);
		System.out.println("수학: " + math);
		System.out.println("총점: " + getSum());
		System.out.printf("평균: %.2f\n", getAverage());
		System.out.println("등급: " + getGrade());
	}

}
