package com.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


import com.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readConfig=new ReadConfig();
	public String baseURL=readConfig.getApplicationURL();
	public String username=readConfig.getusername();
	public String password=readConfig.getpassword();
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		 System.setProperty("webdriver.chrome.driver",readConfig.getchromePath());
		 driver=new ChromeDriver(); 
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS)	;	
		 driver.get(baseURL);
		 
	 }

		@AfterClass
		public void tearDown() {
			driver.quit();
		}
	 
	 
	 
	 
	 
 
	public void captureScreen(WebDriver driver,String testCaseName) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;//typecasting 
		File source =ts.getScreenshotAs(OutputType.FILE);//it will take screen shot 
		String destinationFile = System.getProperty("user.dir")+"/Screenshots/"+testCaseName+".png";
		
		//for fileutils class u need to add dependecy of commans.io
		FileUtils.copyFile(source,new File(destinationFile));
		


	}
	
}
