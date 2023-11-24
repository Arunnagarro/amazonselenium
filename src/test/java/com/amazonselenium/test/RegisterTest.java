package com.amazonselenium.test;

import org.testng.annotations.Test;

import com.amazonselenium.pages.Registerpage;
import com.relevantcodes.extentreports.LogStatus;

public class RegisterTest extends basetest{

		
	    @Test (groups= {"sanity" , "valid"}) 
		public void validregisterUser() {

			Registerpage register = new Registerpage(driver);
			
			register.createaccount();
			register.enteruser("aashutosh");
			register.enteremail("bhardwajaashutosh59@gmail.com");
			register.enterpassword("93@5408095");
			register.enterpasswordagain("93@5408095");
		    register.submit();
		    
			}
	
	     @Test (groups= {"sanity" , "invalid"}) 
	     public void  invalidPass() {
	  		
				Registerpage register = new Registerpage(driver);
				register.createaccount();
				register.enteruser("garv");
				register.enteremail("garvkaushik01@gmail.com");
				register.enterpassword("931");
				register.enterpasswordagain("931");
				
	            register.submit();
	            
	 			    }
	     
	     @Test (groups= {"sanity" , "blank"}) 
	     public void blankregisteruser() {
	  		
				Registerpage register = new Registerpage(driver);
				register.createaccount();
				register.enteruser("");
				register.enteremail("");
				register.enterpassword("");
				register.enterpasswordagain("");
	            register.submit();
	           			
	 			
	      }
	     
	     @Test (groups= {"sanity" , "invalid"}) 
	     public void  invalidMail() {
	  		
				Registerpage register = new Registerpage(driver);
				register.createaccount();
				register.enteruser("arun");
				register.enteremail("arun1");
				register.enterpassword("931540");
				register.enterpasswordagain("931540");
				
	            register.submit();
	            
	 			    }
	     
	     @Test (groups= {"sanity" , "blank"}) 
	     public void  blankUser() {
	  		
				Registerpage register = new Registerpage(driver);
				register.createaccount();
				register.enteruser("");
				register.enteremail("arunsinghratwaana.com");
				register.enterpassword("931");
				register.enterpasswordagain("931");
				
	            register.submit();
	            
	 			    }
	}



