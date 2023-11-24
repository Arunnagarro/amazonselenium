package com.amazonselenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
     WebDriver  driver;
     public loginpage(WebDriver driver) {
    	 PageFactory.initElements(driver,this);
    	 this.driver= driver;
    	 
     }

     @FindBy( how = How.CLASS_NAME, using ="nav-action-inner")
     public WebElement signIn;
     
    
     @FindBy( how = How.ID, using ="ap_email")
     public WebElement email;
     
     @FindBy( how = How.ID, using ="continue")
     public WebElement continue1;
     
    @FindBy( how = How.NAME, using ="password")
     public WebElement password;
     
     
     @FindBy( how = How.ID, using ="signInSubmit")
     public WebElement submitButton;  
    

     public void ClicKsignIn() {
    	   signIn.click();  
       }
     
      public void Enteremail(String user) {
	  email.sendKeys(user);
	  
  }
      public void Clickcontinue1() {
 	   continue1.click();  
    }
     public void Enterpassword(String pass) {
	  password.sendKeys(pass);
  }
      public void Clicksubmit() {
	   submitButton.click();
	   
   }
	   
   }
  