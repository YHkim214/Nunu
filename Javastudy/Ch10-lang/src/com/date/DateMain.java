package com.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now);
		
		System.out.println(now.toLocaleString());
		
		DateFormat f = DateFormat.getDateTimeInstance();
		String today = f.format(now);
		System.out.println(today);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy³â MM¿ù ddÀÏ (E) a hh:mm:ss");
		today = sdf.format(now);
		System.out.println(today);

	}

}
