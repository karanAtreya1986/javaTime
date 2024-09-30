package com.javatime;

import java.time.LocalDate;
import java.time.LocalTime;

public class AnotherExampeOfJavaDateTime {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		// Get the Year, check if it's leap year
		// we have a direct java method isLeapYear already present
//		System.out.println("Year " + today.getYear() + " is Leap Year? " + today.isLeapYear());

		// Compare two LocalDate for before and after
		// check if one date is before another date or after another date.
		// returns true or false.
//		System.out.println("Today is before 01/01/2015? " + today.isBefore(LocalDate.of(2015, 1, 1)));

		// Create LocalDateTime from LocalDate
		// gives current date and time
//		System.out.println("Current Time=" + today.atTime(LocalTime.now()));

		// plus and minus operations
		// current date is 23 september 2024
		System.out.println("10 days after today will be " + today.plusDays(10));
		System.out.println("3 weeks after today will be " + today.plusWeeks(3));
		System.out.println("20 months after today will be " + today.plusMonths(20));

		System.out.println("10 days before today will be " + today.minusDays(10));
		System.out.println("3 weeks before today will be " + today.minusWeeks(3));
		System.out.println("20 months before today will be " + today.minusMonths(20));
	}

}
