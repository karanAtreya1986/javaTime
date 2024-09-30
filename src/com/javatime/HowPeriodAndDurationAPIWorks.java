package com.javatime;

import java.time.Duration;
import java.time.Instant;

public class HowPeriodAndDurationAPIWorks {

	public static void main(String[] args) {
		// Current TimeStamp
		// date will be your machine date
		// time will be in unix format.
		Instant timestamp = Instant.now();
//		System.out.println("Current Timestamp calculated using Instant class is " + timestamp);

		// get the date and time
		// date will be your machine date
		// time will be in unix format but it should be more condensed form
		Instant specificTime = Instant.ofEpochMilli(timestamp.toEpochMilli());
//		System.out.println("Specific Time = " + specificTime);

		// calculates duration
		// 30*24hours = PT720H
		Duration thirtyDay = Duration.ofDays(30);
//		System.out.println(thirtyDay);

		// more duration examples
		// duration can calculate hours, ms, seconds, nano seconds also
		Duration hoursDuration = Duration.ofHours(10);
		System.out.println(hoursDuration);
		Duration millisDuration = Duration.ofMillis(1000);
		System.out.println(millisDuration);
		Duration minutesDuration = Duration.ofMinutes(30);
		System.out.println(minutesDuration);
		Duration nanosDuration = Duration.ofNanos(5000);
		System.out.println(nanosDuration);
		Duration secondsDuration = Duration.ofSeconds(5000);
		System.out.println(secondsDuration);
	}

}
