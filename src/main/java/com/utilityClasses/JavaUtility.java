package com.utilityClasses;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	/**
	 * Generates and returns a random integer between 0 and 4999.
	 * 
	 * @return Random integer in the range [0, 5000).
	 */
	public int getRandomNumber() {
		Random random = new Random();
		int ranNUm = random.nextInt(5000);
		return ranNUm;
	}
	/**
	 * Gets the current system date formatted as "YYYY-MM-DD".
	 * 
	 * @return Current date in "yyyy-MM-dd" format as a String
	 */
	public String getSystemDateYYYYMMDD() {
		
		Date dateObj = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(dateObj);
		return date;
	}
	
	/**
	 * Retrieves the current system time in a format suitable for filenames by
     * replacing spaces and colons with underscores.
     * 
	 * @return Current time with spaces and colons replaced by underscores.
	 */
	public String getCurrentTime() {
		String time = new Date().toString().replace(" ", "_").replace(":", "_");
		return time;
	}
	/**
	 * Calculates a date based on the current system date, shifted by a specified
     * number of days. The result is formatted as "YYYY-MM-DD".
	 * @param days
	 * @return
	 */
	public String getRequiredDateYYYYMMDD(int days) {
		Date dateObj = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.format(dateObj);
		Calendar cal = sdf.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH,days);
		String reqdate = sdf.format(cal.getTime());
		return reqdate;
		
	}
}
