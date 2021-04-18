package com.chainsys;

public class TicketsAmountCalculation {
	public static double ticketAmountCalculation(int option,int noOftickets) {
		double gst=0;
		double totalamount=0;
		if(option==1) {
			double amount=(100*noOftickets);
			 gst=((amount*10)/100);
			  totalamount=(amount+gst);
			
		}
		else if(option==1) {
			double amount=(200*noOftickets);
			 gst=((amount*10)/100);
			 totalamount=(amount+gst);
			
		} 
		else if(option==3) {
			double amount=(300*noOftickets);
			 gst=((amount*10)/100);
			 totalamount=(amount+gst);
			
		}
		else {
			System.out.println("4th option Not available");
		}
		return totalamount;

	}	

}
