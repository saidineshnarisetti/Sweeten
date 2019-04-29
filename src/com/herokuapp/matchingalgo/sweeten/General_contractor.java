package com.herokuapp.matchingalgo.sweeten;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class General_contractor extends LaunchBrowser{ //Script for validating General contractor
	
	@Test(priority=4)
	public void verifyCnt_header() throws InterruptedException
	{	 	
			String act_cnt_title = driver.findElement(By.xpath("/html/body/div/h1")).getText(); // by className
		  	String exp_cnt_title = "General contractor List";
		  	Assert.assertEquals(act_cnt_title, exp_cnt_title);
		  	driver.findElement(By.linkText("New General contractor")).click();
	}
	@Test(priority=5, dependsOnMethods="verifyCnt_header")
	public void verifyNew_Cnt() throws InterruptedException
	{	 	
			Thread.sleep(3000);
			String act_Newcnt_title = driver.findElement(By.xpath("/html/body/div/h1")).getText(); // by className
		  	String exp_Newcnt_title = "New General contractors";
		  	Assert.assertEquals(act_Newcnt_title, exp_Newcnt_title);
	}
	@Test(priority=6)
	public void Send_Cnt_details() throws InterruptedException
	{	 	
//			driver.findElement(By.id("general_contractor_longitude")).sendKeys("1.5");
//			driver.findElement(By.id("general_contractor_latitude")).sendKeys("2.5");
//			driver.findElement(By.id("general_contractor_min_project_budget")).sendKeys("50");
//			driver.findElement(By.id("general_contractor_max_project_budget")).sendKeys("500");
//			driver.findElement(By.id("general_contractor_is_offering_design_service")).click();
//			driver.findElement(By.id("general_contractor_is_offering_build_service")).click();
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//*[@id=\"new_general_contractor\"]/div[7]/div/button")).click();
			driver.findElement(By.linkText("Back")).click();
	}
//	@Test(priority=7,dependsOnMethods="Send_Cnt_details")
//	public void Success_Cnt_details() throws InterruptedException
//	{	 	
//		 String actUpdatemsg =driver.findElement(By.xpath("/html/body/div/p[1]")).getText();
//		 String expUpdatemsg ="General Contractor was successfully created.";
//		 Assert.assertEquals(actUpdatemsg, expUpdatemsg);   
//	}


}
