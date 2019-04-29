package com.herokuapp.matchingalgo.sweeten;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Renovation_Project extends LaunchBrowser { //Script for validating Renovation_Project

	@Test(priority=11)
	public void verifyRePrjct_header() throws InterruptedException
	{	 	
			String act_RePrjct_title = driver.findElement(By.xpath("/html/body/div/h1")).getText(); // by className
		  	String exp_RePrjct_title = "Renovation Project List";
		  	Assert.assertEquals(act_RePrjct_title, exp_RePrjct_title);
		  	driver.findElement(By.linkText("New Renovation Project")).click();
	}
	@Test(priority=12, dependsOnMethods="verifyRePrjct_header")
	public void verifyNewRePrjct() throws InterruptedException
	{	 	
			Thread.sleep(3000);
			String act_NewRePrjct_title = driver.findElement(By.xpath("/html/body/div/h1")).getText(); // by className
		  	String exp_NewRePrjct_title = "New Renovation Project";
		  	Assert.assertEquals(act_NewRePrjct_title, exp_NewRePrjct_title);
	}
	@Test(priority=13)
	public void Send_NewRePrjct_details() throws InterruptedException
	{	 	
			driver.findElement(By.id("renovation_project_longitude")).sendKeys("1.5");
			driver.findElement(By.id("renovation_project_latitude")).sendKeys("2.5");
			driver.findElement(By.id("renovation_project_min_budget")).sendKeys("50");
			driver.findElement(By.id("renovation_project_max_budget")).sendKeys("500");
			driver.findElement(By.id("renovation_project_is_design_service_req")).click();
			driver.findElement(By.id("renovation_project_is_build_service_req")).click();
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//*[@id=\"new_renovation_project\"]/div[7]/div/button")).click();
			driver.findElement(By.linkText("Back")).click();
	}
//	@Test(priority=14,dependsOnMethods="Send_NewRePrjct_details")
//	public void Success_NewRePrjct_details() throws InterruptedException
//	{	 	
//		 String actNewRePrjctmsg =driver.findElement(By.xpath("/html/body/div/p[1]")).getText();
//		 String expNewRePrjctmsg ="Renovation Project was successfully created.";
//		 Assert.assertEquals(actNewRePrjctmsg, expNewRePrjctmsg);   
//	}

}
