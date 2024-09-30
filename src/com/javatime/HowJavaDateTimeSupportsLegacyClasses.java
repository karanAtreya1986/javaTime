package com.javatime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class HowJavaDateTimeSupportsLegacyClasses {

	public static void main(String[] args) {

		// What does date object give me
		// gives current system date and time alongwith timezone.
		// date is present in java.sql package for db dates.
		// date is also present in java.util package for non database related dates.
		Date date = new Date();
//		System.out.println("Date is " + date);

		// Date to Instant
		// converts to instant date
		// gives current system date
		// time will be in some different zone.
		Instant dateToInstant = new Date().toInstant();
//		System.out.println("Instant using Date: " + dateToInstant);

		// convert instant date to date
		// this will give the current system date and current system time
		// it will also give the timezone in your machine
		Date convertFromInstantToDate = Date.from(Instant.now());
//		System.out.println("Instant date to date is " + convertFromInstantToDate);

		// What does Calendar Object give us
		// gives us the time in ms.
		long calendar = Calendar.getInstance().getTimeInMillis();
//		System.out.println("Date is " + calendar);

		// Calendar to Instant
		// we use new to create objects
		// in calendar class we use calendar.getinstance()
		// gives current system date
		// time will be in different zone
		Instant calenderToInstant = Calendar.getInstance().toInstant();
//		System.out.println("Instant using Calender: " + calenderToInstant);

		// Now we can convert Instant to LocalDateTime or other similar classes
		// local date time using instant class
		// give current date and time for the timezone (IST) in this case
		LocalDateTime dateTimeToInstant = LocalDateTime.ofInstant(dateToInstant,
				ZoneId.of(ZoneId.SHORT_IDS.get("IST")));
//		System.out.println("LocalDateTime using Instant: " + dateTimeToInstant);

		// ZonedDateTime from Specific Calendar
//		Zonedatetime class to deal with Gregorian calendar
		// gives current system date and current system time
		// also mentiones the region of the timezone
		ZonedDateTime gregorianCalendarDateTime = new GregorianCalendar().toZonedDateTime();
//		System.out.println("ZoneDateTime using Gregorian Calendar: " + gregorianCalendarDateTime);

		// GregorianCalendar Date Time
		// gregorian calendar date time
		// output is vague
		GregorianCalendar gc = GregorianCalendar.from(gregorianCalendarDateTime);
		System.out.println("Gregorian Calender date time is " + gc);
	}

}
