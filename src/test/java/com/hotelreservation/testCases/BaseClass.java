package com.hotelreservation.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
	
	public String baseURL="http://hotel-test.equalexperts.io/";
	public static WebDriver driver;
	public String fName="Mike";
	public String lName="Larry";
	public String price="50";
	
	public static Logger logger;
	
	
	@BeforeClass
	public void setup()
	{
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver");
        driver=new ChromeDriver();		
        
        logger=Logger.getLogger("hotelReservation");
        PropertyConfigurator.configure("Log4j.properties");
		
	}
	
	@AfterClass
	public void close()
	{
		driver.close();
	}
	

}
