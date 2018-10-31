package com.calendar;

import java.util.Calendar;

public class CalendarMain01 {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		int week_yy = c.get(Calendar.WEEK_OF_YEAR);
		int day_yy = c.get(Calendar.DAY_OF_YEAR);
		System.out.println(week_yy);
		System.out.println(day_yy);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		
		String week = "일월화수목금토";
		String day = String.valueOf(week.charAt(c.get(Calendar.DAY_OF_WEEK)));
		System.out.println(day + "요일");
		
		int amPm = c.get(Calendar.AM_PM);
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		System.out.println(amPm == 0? "오전" : "오후");
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
	}

}
