package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAirlinePage {
	public WebDriver driver;

	public AddAirlinePage(WebDriver driver){

		this.driver=driver;
		
		PageFactory.initElements(driver, this);


	}

	@FindBy(xpath="//img[@alt='Masters']")  
	@CacheLookup
	WebElement linkMaster;

	@FindBy(xpath="//a[@href='/admin/airline/airline-table']")
	@CacheLookup
	WebElement btAirline;

	@FindBy(xpath="//*[@class='ant-btn ant-btn-primary']")
	@CacheLookup
	WebElement btCreateNew;
	
	@FindBy(id="airlineName")
	@CacheLookup
	WebElement txtName;
	
	@FindBy(id="iata")
	@CacheLookup
	WebElement txtIATA;
	
	@FindBy(id="icao")
	@CacheLookup
	WebElement txtICAO;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement txtCallsign;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement txtAlias;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement btSave;

	public void clickMaster() {
		
		linkMaster.click();
	
	}
public void clickAirline() {
		
	btAirline.click();
	
	}
	
public void clickCreateNew() {
		
	btCreateNew.click();
	
	}
public void airlineName(String aname ) {

	txtName.sendKeys(aname);

}
public void airlineICAO(String aICAO ) {

	txtICAO.sendKeys(aICAO);

}
public void airlineIATA(String aIATA ) {

	txtIATA.sendKeys(aIATA);

}	
public void airlineAlias(String aAlias ) {

	txtAlias.sendKeys(aAlias);

}
public void airlineCallsign(String aCallsign ) {

	txtCallsign.sendKeys(aCallsign);

}
public void clickSave() {
	
	btSave.click();
	
	}
}
