package com.amazonselenium.test;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazonselenium.pages.loginpage;

public class loginTest extends basetest {
   public static WebDriver driver;

	@Test (priority = 1, groups = { "sanity", "valid" })
	public void ValidLogin() {
		loginpage login =  new loginpage(driver);
		login.Enteremail("9315408095");
		login.Clickcontinue1();
		login.Enterpassword("1234arunsi");
		login.Clicksubmit();
		Assert.assertEquals(driver.getCurrentUrl(), "Amazon Sign In");
		
	}
	

	@Test (priority = 2, groups = { "sanity", "invalid" })	
	public void invalidmail() {
		loginpage login =  new loginpage(driver);
		login.Enteremail("9315");
		login.Clickcontinue1();
//		login.Enterpassword("9315");
//		login.Clicksubmit();

		}
	
	@Test (priority = 4, groups= {"invalid", "sanity", "exc"}) 
	  public void blankPass() { 
		  
	  loginpage login = new loginpage(driver); 
	  login.Enteremail("arunsinghratwaan@gmail.com");
	  login.Clickcontinue1(); 
	  login.Enterpassword(" "); 
	  login.Clicksubmit(); 
	  
	  }


	@Test (priority = 3, groups = { "sanity", "blank" })
	public void blankmail() {

		loginpage login =  new loginpage(driver);
		
		login.Enteremail("");
		login.Clickcontinue1();
		}
	
	@Test (priority = 5, groups = { "sanity", "invalid" })
	public void invalidPass() {
		loginpage login =  new loginpage(driver);
		login.Enteremail("9315408095");
		login.Clickcontinue1();
		login.Enterpassword("aruns");
		login.Clicksubmit();
		
	}
	
	
	
		
	}

