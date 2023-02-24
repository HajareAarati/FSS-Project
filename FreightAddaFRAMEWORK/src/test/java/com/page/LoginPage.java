package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver){

		this.driver=driver;
		
		PageFactory.initElements(driver, this);


	}

	@FindBy(xpath="//*[@id=\"userName\"]")  
	@CacheLookup
	WebElement txtusername;

	@FindBy(xpath="//*[@id=\"password\"]")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath="//*[@class=\"ant-btn ant-btn-primary\"]")
	@CacheLookup
	WebElement btnLogin;



	public void enterUsername(String Username ) {
		
		txtusername.sendKeys(Username);
	
	}

	public void enterPassword(String Password ) {

		txtPassword.sendKeys(Password);
	
	}

	public void clickOnLogin() {
		btnLogin.click();

	}


}



