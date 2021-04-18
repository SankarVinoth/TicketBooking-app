package com.chainsys;

import java.util.Scanner;

public class LoginPage {
	     public static boolean loginpage(Long mobileno) {
	    	 boolean isvalid = false;
	    	 String mobilenostring=String.valueOf(mobileno);// convert to string
	    	 
	 	     if(mobilenostring.length()==10) {                // to check the phoneno length typed is correct or not
	 	    	isvalid=true;
	 	    	
	 	    	
	 	    }
	 	    else {
	 	    	isvalid =false;
	 	    	
	 	    }
	    	 
	 	    return isvalid;
}
	     public static boolean password(Long password) {
	     boolean isvalid = false;
    	 String passwordstring=String.valueOf(password); // convert to string
 	    if(passwordstring.length()==8) {                // to check the phoneno length typed is correct or not
 	    	isvalid=true;
 	    }
 	    else {
 	    	isvalid =false;
 	    }
 	    return isvalid;
}
}