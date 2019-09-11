package com.mkyong.core.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

	public static void main(String[] args) {

		System.out.println(getLocalCurrentDate());
		
	}

	private static Date getLocalCurrentDate() {
	
		return new Date();
		
	}
	
	public String printTodatDate()
	{
		String pattern = "MM/dd/yyyy HH:mm:ss";

		DateFormat df = new SimpleDateFormat(pattern);

		Date today = Calendar.getInstance().getTime();        
		String todayAsString = df.format(today);

		System.out.println("Today is: " + todayAsString);
		return "success";
	}

}
