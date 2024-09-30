package com.javatime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterWithLocalTime {

	public static void main(String[] args) {

//		Date, dateTime can be shifted or changed. Only changing time with this localTime API not allowed.
		// with local time we cant change dates and days.
		LocalTime currentDate = LocalTime.now();
		System.out.println("First Day of the month is " + currentDate.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println("Last Day of the month is " + currentDate.with(TemporalAdjusters.lastDayOfMonth()));
		System.out.println("First Day of next year is " + currentDate.with(TemporalAdjusters.firstDayOfNextMonth()));
		System.out.println("Last Day of next year is " + currentDate.with(TemporalAdjusters.lastDayOfYear()));
		System.out.println("First Day of Next Year is " + currentDate.with(TemporalAdjusters.firstDayOfNextYear()));
		System.out.println("First Day of Next Month is " + currentDate.with(TemporalAdjusters.firstDayOfNextMonth()));
		System.out.println("next Monday is on " + currentDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY)));
		System.out.println("Last date of this year= " + currentDate.with(TemporalAdjusters.lastDayOfYear()));
	}

}
