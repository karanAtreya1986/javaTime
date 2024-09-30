package com.javatime;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class HowDateAndTimeAPIWorks {

//	Java util had date and timestamp.
//	Java sql had date only.
//	Java sql has no methods for time parsing and time formatting.
//	All these problems solved using java time package. Works with date, time and date time.

	public static void main(String[] args) {

		// Current Date
		// no time only current system date is returned.
		LocalDate today = LocalDate.now();
//		System.out.println("Current Date using now method is " + today);

		// Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
		// if we give wrong time zone then we get error as unknown time zone
		LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
//		System.out.println("Current Date in Asia/Kolkata Timezone = " + todayKolkata);

		LocalDate usCentral = LocalDate.now(ZoneId.of("US/Central"));
//		System.out.println("Current Date in US/Central Timezone = " + usCentral);

//		LocalDate us1Central = LocalDate.now(ZoneId.of("US/unknown"));
//		System.out.println("Current Date in US/Central Timezone = " + us1Central);

		// Creating LocalDate by providing input arguments
		// it will give the date as per the format we need
		LocalDate firstDay_2016 = LocalDate.of(2016, Month.JANUARY, 1);
//		System.out.println("Specific Date by providing the date in right format " + firstDay_2016);

		// Try creating date by providing invalid inputs
		// try to generate new date which does not exist
//		LocalDate feb29_2014 = LocalDate.of(2014, Month.FEBRUARY, 29);
//		System.out.println("Specific Date is " + feb29_2014); // Exception in thread
		// "main" java.time.DateTimeException: Invalid date 'February 29' as '2014' is
		// not a leap year

		// Getting date from the base date i.e 01/01/1970
//		In java the default year is 1970 and date is 1 january 1970.
//		Add 1000 days from 1 january 1970-
		LocalDate dateFromBase = LocalDate.ofEpochDay(1000);
//		System.out.println("1000th day from base date = " + dateFromBase);

		// get the 100th day of year 2016
		LocalDate hundredDay2016 = LocalDate.ofYearDay(2016, 100);
		System.out.println("100th day of 2016 = " + hundredDay2016);

	}

}
