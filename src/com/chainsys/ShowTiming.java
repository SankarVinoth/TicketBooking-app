package com.chainsys;

import java.time.LocalTime;

public class ShowTiming {
public static void showtiming(String times) {
		
    	LocalTime showtimes = LocalTime.parse(times);      // sepearte cabtimes and hour variables are used here to get the date for further process  
	    int hour=showtimes.getHour();
	    System.out.println("your show time is"+" "+hour);
	    
	}
}
