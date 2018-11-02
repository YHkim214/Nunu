package com.calendar;

import java.io.*;
import java.util.Calendar;

public class CalandarMain02 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Calendar cal = Calendar.getInstance();
		
		try {
			System.out.println("��������� �� �Է�.(ex ����: 2018, ��: 4)>");
			System.out.print("����: ");
			int year = Integer.parseInt(br.readLine().trim());
			System.out.print("��: ");
			int month = Integer.parseInt(br.readLine().trim());
			
			System.out.println("    ["+year+"�� "+ month +"��]    ");
			System.out.println("========================");
			System.out.println("  ��   ��   ȭ   ��   ��   ��  ��");
			
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

