package com.amazonselenium.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.amazonselenium.utils.screenshot;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class basetest {
	 public static WebDriver driver;
	 public static File file;
	 public static FileInputStream fis;
	 public static Properties prop;
	 public static ExtentReports extent;
	 public static ExtentTest extentTest;
	 
	
	 
	static {
		file= new File ("./resources/config.properties");
		try {			
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
		   e.printStackTrace();
		}
	}
	@BeforeSuite (groups= {"sanity", "invalid"})
	  public void setExtent(){
		  extent = new ExtentReports("./reports/ExtentReport.html");
		  
	  }
	@AfterSuite  (groups= {"sanity", "invalid"})
	public void endReport() {
		extent.flush();
		extent.close();
	}
	
	@BeforeMethod (groups= {"sanity", "invalid"})
	public static void initializeWebDriver() {
		System.setProperty(prop.getProperty("driverProperty"),prop.getProperty("driverPath"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		prop.getProperty("globalWait");
		
	}
	
	@BeforeMethod (groups= {"sanity", "invalid"})
	public static void navigateSite() {
		driver.get(prop.getProperty("url"));
		driver.findElement(By.id("nav-link-accountList")).click();
	}
	
	@BeforeMethod (groups= {"sanity", "invalid"})
	public void startTest(Method name) {
		String testname = name.getName();
		extentTest = extent.startTest(testname);
	}
	
	@AfterMethod (groups= {"sanity", "invalid"})
	public void resultTest(ITestResult result) throws IOException {
		
		if(result.getStatus() == ITestResult.FAILURE) {
			
			String imagePath = screenshot.capturescreenshot(driver, result.getName());
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(imagePath));
			
		}
		else {
			if(result.getStatus() == ITestResult.SUCCESS) {
				extentTest.log(LogStatus.PASS, "Test case passed successfully");	
				
			}
		}
		extent.endTest(extentTest);
		driver.close();
	}
	
}

	 
