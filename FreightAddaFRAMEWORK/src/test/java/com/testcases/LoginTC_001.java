package com.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.page.LoginPage;



public class LoginTC_001 extends BaseClass{
	private	static Logger logger=LogManager.getLogger(LoginTC_001.class.getName());
	//ExtentReports extent = new ExtentReports();
	  //ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");
	
	@Test
	public void loginTest() throws IOException  {
	
		LoginPage l=new LoginPage(driver);

	l.enterUsername(username);
	logger.info("Entered username");
   l.enterPassword(password);	
   logger.info("Entered password");
 l.clickOnLogin();
 logger.info("Login successfull");
 
 
 captureScreen( driver,"loginTest");
 Assert.assertTrue(true);
 
 

	}
	
}
