package com.chainsys;

import java.util.Scanner;

public class MainFunctions {
	public static void main(String args[]) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter your mobile Number");
		Long mobileno=scr.nextLong();
		boolean isvalid=LoginPage.loginpage(mobileno);   //isValid variable used to check the status of mobile no
		if(isvalid==false) {
			System.out.println("Enter a Correct Number");
		}
		else {
			System.out.println("Please enter your Password");
		}
		
		
		Long password=scr.nextLong();        
		boolean isvalid1=LoginPage.loginpage(password); // calling the password method to get 8 digit password
		if(isvalid1==false) {
			System.out.println("Enter a correct password");
		}
		
		System.out.println("1: front Rows");
		System.out.println("2: Middle Rows");
		System.out.println("3: Back Rows");
		System.out.println("Enter any one option (1/2/3)");
		int useroption = scr.nextInt();
		TicketTypes1. ticketOptions(useroption);     // calling the tickettypes method by passing arguement useroption
		System.out.println("Enter the Number of Tickets You want ?");
		int no_tickets=scr.nextInt();
		double gstcalculation=TicketsAmountCalculation.ticketAmountCalculation(useroption,no_tickets); //  calling gstcalculation method for amount calculation 
		System.out.println(gstcalculation);
		 System.out.println("enter your preferable show  time");
		 String times=scr.next();
		  ShowTiming.showtiming(times);          //calling show timing method to print show timing 
		  System.out.println("Enter your date of birth");
   	 	  String dob=scr.next();
   	 	  double discount=SeniorCitizenshipChecking.seniorcitizenshipchecking(dob,gstcalculation); 
   	 	    System.out.println("Your discounted amount is"+""+discount+""+"enjoy your show");
		scr.close();
		
		
		
	}

}
