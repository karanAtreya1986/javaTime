package com.javatime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HowDateTimeFormatterWorks {

	public static void main(String[] args) {

		// get todays date.
		LocalDate date = LocalDate.now();
//		System.out.println("Default format of LocalDate is " + date);

		// print as per our own pattern
//		System.out.println("According to pattern: " + date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));

		// print in iso format
		// we are writing this code on 22 september 2024.
//		System.out.println("According to pattern: " + date.format(DateTimeFormatter.BASIC_ISO_DATE));

		// to get the date and time
		// iso date just gives the date and no time.
//		LocalDateTime dateTime = LocalDateTime.now();
//		System.out.println("Default format of LocalDateTime=" + dateTime);
//		System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
//		System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));

		// Parsing Example
		// we want the date and time in our own format.
		LocalDateTime dt = LocalDateTime.parse("27::Apr::2014 21::39::48",
				DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss"));
		System.out.println("Default format after parsing = " + dt);
	}

}
