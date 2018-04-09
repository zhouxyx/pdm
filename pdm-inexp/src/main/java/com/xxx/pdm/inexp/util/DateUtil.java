package com.xxx.pdm.inexp.util;

import java.util.Calendar;

public class DateUtil {

	
	public static int getCurrentMonth() {
		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(Calendar.MONTH) + 1;
		return month;
	}
	
	
	public static Integer getCurrentYear() {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		return year;
	}
	
}
