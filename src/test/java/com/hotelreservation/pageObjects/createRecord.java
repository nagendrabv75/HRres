package com.hotelreservation.pageObjects;

import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class  createRecord {
	
	public static WebDriver ldriver;
	

	public  createRecord(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Identifying the Elements
	
	//Identify the first Name
	@FindBy(id="firstname")
	@CacheLookup
	WebElement firstName;
	
	
	//Identify the Sur Name
	@FindBy(id="lastname")
	@CacheLookup
	WebElement lastName;

	//Identify the Price
	@FindBy(id="totalprice")
	@CacheLookup
	WebElement totalPrice;
	
	

	

	
	public void enterFirstName(String fName)
	{
		firstName.sendKeys(fName);
	}
	
	public void enterSurName(String lName)
	{
		lastName.sendKeys(lName);
	}
	
	public void enterPrice(String tPrice)
	{
		totalPrice.sendKeys(tPrice);
	}
	
	
	
	
	
	
}
