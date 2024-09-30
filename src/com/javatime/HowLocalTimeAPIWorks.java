package com.javatime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class HowLocalTimeAPIWorks {

	public static void main(String[] args) {

		// Default format for time is hh:mm:ss.zzz
		// Zzz- milliseconds.

		// Current Time
		// gives current system time on machine
		LocalTime time = LocalTime.now();
//		System.out.println("Current Time=" + time);

		// get the current system date and system time
		LocalDateTime dateTime = LocalDateTime.now();
//		System.out.println("Current date and Time=" + dateTime);
//		System.out.println("Current Time=" + time);

		// Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
		// give the zone details and you will get that zones current time
//		LocalTime timeKolkata = LocalTime.now(ZoneId.of("Asia/Kolkata"));
//		System.out.println("Current Time in Asia/Kolkata=" + timeKolkata);
//
//		LocalTime CST = LocalTime.now(ZoneId.of("America/Chicago"));
//		System.out.println("Current Time in America/Chicago=" + CST);

		// gives the current date and time in that particular zone
//		LocalDateTime timeKolkata = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
//		System.out.println("Current date and Time in Asia/Kolkata=" + timeKolkata);
//
//		LocalDateTime CST = LocalDateTime.now(ZoneId.of("America/Chicago"));
//		System.out.println("Current date and Time in America/Chicago=" + CST);

		// Creating LocalTime by providing input arguments
		// we get the specified time.
//		LocalTime specificTime = LocalTime.of(12, 20, 25, 40);
//		System.out.println("Specific Time of Day=" + specificTime);

		// we can print specific date and time
//		LocalDateTime specificTime = LocalDateTime.of(2017, Month.JANUARY, 1, 12, 20, 25, 40);
//		System.out.println("Specific date and Time of Day=" + specificTime);

		// this will add 100 seconds
		// start time will be 00:00:00
//		LocalTime specificSecondTime = LocalTime.ofSecondOfDay(100);
//		System.out.println("100th  time= " + specificSecondTime);

		// Try creating time by providing invalid inputs
		// LocalTime invalidTime = LocalTime.of(25,20);
		// System.out.println("Valid Time is " + invalidTime);
		// Exception in thread "main" java.time.DateTimeException:
		// Invalid value for HourOfDay (valid values 0 - 23): 25

		// java.time.zone.ZoneRulesException: Unknown time-zone ID: IST
		// LocalTime todayIST = LocalTime.now(ZoneId.of("IST"));

		// add 100 seconds from epoch
		// epoch means the start date which is 1 january 1970
		// time will be 00:00:00
		LocalDateTime specificSecondTime = LocalDateTime.ofEpochSecond(100, 0, ZoneOffset.UTC);
		System.out.println("100th  time= " + specificSecondTime);
	}

}
