package com.javatime;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterWithLocalDateTime {

	public static void main(String[] args) {

		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("First Day of the month is " + currentDateTime.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println("Last Day of the month is " + currentDateTime.with(TemporalAdjusters.lastDayOfMonth()));
		System.out
				.println("First Day of next year is " + currentDateTime.with(TemporalAdjusters.firstDayOfNextMonth()));
		System.out.println("Last Day of next year is " + currentDateTime.with(TemporalAdjusters.lastDayOfYear()));
		System.out.println("First Day of Next Year is " + currentDateTime.with(TemporalAdjusters.firstDayOfNextYear()));
		System.out
				.println("First Day of Next Month is " + currentDateTime.with(TemporalAdjusters.firstDayOfNextMonth()));
		System.out.println("next Monday is on " + currentDateTime.with(TemporalAdjusters.next(DayOfWeek.MONDAY)));
	}

}
