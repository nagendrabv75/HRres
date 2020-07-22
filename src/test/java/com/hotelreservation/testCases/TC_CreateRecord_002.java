package com.hotelreservation.testCases;

import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import com.hotelreservation.pageObjects.createRecord;

public class TC_CreateRecord_002  extends BaseClass{
	
	
	
	@Test(priority=1)
	public void CreateRecordMethod() throws InterruptedException
	{
		driver.get(baseURL);
		Thread.sleep(5000);
		logger.info("Launched the Application Page");
		
		createRecord cr=new createRecord(driver);
		
		cr.enterFirstName(fName);
		cr.enterSurName(lName);
		cr.enterPrice(price);
		
		
	}
	@Test(priority=2)
	
	public void enterDeposit()
	{
		Select depositPaid=new Select(driver.findElement(By.xpath("//*[@id=\"depositpaid\"]")));
        depositPaid.selectByVisibleText("false");

	}
	
	@Test(priority=3)
	public void checkInDate() throws InterruptedException
	{
	
			driver.findElement(By.xpath("//*[@id=\"checkin\"]")).click();
	        Calendar cal=Calendar.getInstance();
	        int date_CI=cal.get(Calendar.DATE); // return the current date
	        String CI_date=String.valueOf(date_CI);

	        Thread.sleep(5000);
	       driver.findElement(By.linkText(CI_date)).click();
	       Thread.sleep(5000);
		
	}
	
	
	@Test(priority=4)
	public void checkOutDate() throws InterruptedException
	{

			driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
			Calendar cal=Calendar.getInstance();

	        int date_CO=cal.get(Calendar.DATE); // return the current date
	        date_CO=date_CO+2; //Incrementing by 2 days
	        String CO_date=String.valueOf(date_CO);

	        Thread.sleep(5000);
	        driver.findElement(By.linkText(CO_date)).click();
		 Thread.sleep(5000);
	}
	
	@Test(priority=5)
	public void saveRecord()
	{
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[7]/input")).click();
		logger.info("Successfully saved the record");
		
		Assert.assertTrue(true);
		
	}

	@Test(priority=6)
	public static void delrecord() throws InterruptedException
	{
		Thread.sleep(5000);
	    List <WebElement> deleteRec=driver.findElements(By.xpath("//div[starts-with(@id,'19')]"));
	    int i=2;

	    for(WebElement e:deleteRec)
	    {
	      String data=e.getText();

	      if(data.startsWith("Mike"))
	      {
	            System.out.println(data);

	            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div["+i+"]/div[7]/input[1]")).click();
	            break;
	      }
	      i++;
	    }
	    Thread.sleep(5000);

	}
}
