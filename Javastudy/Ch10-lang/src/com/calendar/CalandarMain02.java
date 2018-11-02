package com.calendar;

import java.io.*;
import java.util.Calendar;

public class CalandarMain02 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Calendar cal = Calendar.getInstance();
		
		try {
			System.out.println("희망연도와 달 입력.(ex 연도: 2018, 월: 4)>");
			System.out.print("연도: ");
			int year = Integer.parseInt(br.readLine().trim());
			System.out.print("월: ");
			int month = Integer.parseInt(br.readLine().trim());
			
			System.out.println("    ["+year+"년 "+ month +"월]    ");
			System.out.println("========================");
			System.out.println("  일   월   화   수   목   금  토");
			
			cal.set(year, month-1, 1);
			int week = cal.get(Calendar.DAY_OF_WEEK);
			for(int i = 1; i < week ; i++) {
				System.out.print("   ");
			}
			for(int i = 1; i <= cal.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
				System.out.print(i >= 10 ? " " + i : "  " + i);
				if(week%7 == 0) System.out.println();
				week++;
			}
		} catch (Exception e) {}
		
	} 
}

