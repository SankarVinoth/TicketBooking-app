package com.chainsys;

import java.time.LocalDate;

public class SeniorCitizenshipChecking {
           public static double seniorcitizenshipchecking(String dob,double gstcalculation) {
        	double amount =0;   
        	LocalDate now= LocalDate.now();         //inbuilt function here used to print current date
   	 		
            int year=now.getYear();
   	 	
   	 		LocalDate dob1= LocalDate.parse(dob);
   	 		int actyear=dob1.getYear();
   	 		int age=(year-actyear);
   	 		System.out.println( "your age is"+age);
   	 		if(age>50) {
   	 			System.out.println("your age is greater than 50 so u have 50% reduction in pay!!!!!!!! enjoy!!!!!!");
   	 			amount=(gstcalculation/2);
   	 		}
   	 		else {
   	 			System.out.println("Your age is less than 50 So no discounts for you sorry");
   	 		}
   	 		return amount;
           }
}
