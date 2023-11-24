package com.amazonselenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Registerpage { 
	WebDriver  driver;

public Registerpage(WebDriver driver) {
	 PageFactory.initElements(driver,this);
	 this.driver= driver;
}
 
   @FindBy( how = How.ID, using ="createAccountSubmit")
    public WebElement createaccount;
    
   @FindBy( how = How.ID, using ="ap_customer_name")
   public WebElement yourname;
 
   @FindBy( how = How.ID, using ="ap_email")
   public WebElement email;
   
   @FindBy( how = How.ID, using ="ap_password")
   public WebElement password;
   
   @FindBy( how = How.ID, using ="ap_password_check")
   public WebElement passwordagain;
   
   @FindBy( how = How.ID, using ="continue")
   public WebElement continue3;
   
   public void  createaccount() {
   	createaccount.click();
   }
   public void  enteruser(String user) {
    	yourname.sendKeys(user);
    }
    public void  enteremail(String user) {
    	email.sendKeys(user);
    }
    public void  enterpassword(String pass) {
    	password.sendKeys(pass);
    }
    public void  enterpasswordagain(String pass) {
    	passwordagain.sendKeys(pass);
    }
    public void submit() {
    	continue3.click();
    	
    }
   
}
