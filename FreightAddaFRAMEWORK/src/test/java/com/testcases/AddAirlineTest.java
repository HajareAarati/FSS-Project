package com.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.page.AddAirlinePage;
import com.page.LoginPage;

public class AddAirlineTest extends BaseClass {
	private	static Logger logger=LogManager.getLogger(AddAirlineTest.class.getName());
	@Test
	public void addAirline() throws InterruptedException, IOException {
		LoginPage l=new LoginPage(driver);

		l.enterUsername(username);
		logger.info("Entered username");
	   l.enterPassword(password);	
	   logger.info("Entered password");
	 l.clickOnLogin();
	 logger.info("Login successfull");
	 Thread.sleep(5000);
	 AddAirlinePage addAir=new AddAirlinePage(driver);
	 addAir.clickMaster();
	 addAir.clickAirline();
	 addAir.clickCreateNew();
	 addAir.airlineName("Mumbai Airlines");
	 addAir.airlineIATA("BOM");
	 addAir.airlineICAO("VABB");
	 addAir.airlineAlias("");
	 addAir.airlineCallsign("");
	 addAir.clickSave();
	 
	 Thread.sleep(3000);
	boolean res= driver.getPageSource().contains("Created Successfully");
	 if(res==true) {
		 Assert.assertTrue(true);
	 }
	 else {
		 Assert.assertTrue(false);
		 captureScreen( driver,"addAirline");
		 
	 }
	}
	
	
	
}
